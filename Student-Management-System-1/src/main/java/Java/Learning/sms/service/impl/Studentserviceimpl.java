package Java.Learning.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import Java.Learning.sms.entity.Student;
import Java.Learning.sms.repository.StudentRepository;
import Java.Learning.sms.service.StudentService;

@Service

public class Studentserviceimpl implements StudentService{
	
	private StudentRepository studentRepository;
	public Studentserviceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
