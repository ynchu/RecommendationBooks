package com.nchu.recom.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentFactory {
    public List<Student> getStudent() {
        List<Student> list = new ArrayList<Student>();

        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setNo("172011" + String.format("%02d", i + 1));
            student.setName("Li Hua " + String.format("%02d", i + 1));
            student.setAge(20 + i);
            list.add(student);
        }

        return list;
    }

    public List<Student> findBy(String no) {
        List<Student> list = getStudent();
        return list.stream().filter(e -> e.getNo().contains(no)).collect(Collectors.toList());
    }

    public Student findByNo(String no) throws StudentNotFoundException {
        List<Student> list = getStudent();
        Student student = list.stream().filter(e -> e.getNo().equals(no)).findFirst().orElse(null);
        if (student == null) {
            throw new StudentNotFoundException();
        }
        return student;
    }

}
