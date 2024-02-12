package student.student.repository;

import org.springframework.stereotype.Repository;
import student.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    private static final Map<Long, Student> store = new HashMap<>();

    public Student save(Student student){
        store.put(student.getId(), student);
        return student;
    }

    public Student findById(Long studentId){
        return store.get(studentId);
    }

    public List<Student> findAll(){
        return new ArrayList<>(store.values());
    }

    public void update(Long studentId, Student updateStudent){
        Student findStudent = findById(studentId);
        updateStudentInformation(findStudent,updateStudent);
        save(findStudent);
    }

    private void updateStudentInformation(Student findStudent, Student updateStudent){
        findStudent.setName(updateStudent.getName());
        findStudent.setAddress(updateStudent.getAddress());
    }
}

