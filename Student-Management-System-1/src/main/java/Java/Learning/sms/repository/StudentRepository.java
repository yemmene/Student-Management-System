package Java.Learning.sms.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import Java.Learning.sms.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
