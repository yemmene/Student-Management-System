package Java.Learning.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Java.Learning.sms.service.StudentService;

@Controller
public class StudentController {
	
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
// handler method to handle list students request and return mode and view
	
	@GetMapping("/students")
	
	public String listStudents(Model model) {
		model.addAttribute("student", studentService.getAllStudents());
		return "students";
	
	
}
}
