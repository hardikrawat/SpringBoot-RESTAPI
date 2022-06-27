package com.spirngboot.restapi.services;

import java.util.*;
import com.spirngboot.restapi.entities.Student;

public class StudentService {

	private static List<Student> student = new ArrayList();

	static {
		student.add(new Student(1, "Student-1"));
		student.add(new Student(2, "Student-2"));
		student.add(new Student(3, "Student-3"));
		student.add(new Student(4, "Student-4"));
	}

	public List<Student> getStudents() {
		return student;
	}

	public Student getStudentById(Integer id) {
		for (int i = 0; i < student.size(); i++) {
			if (id == student.get(i).getId()) {
				return student.get(i);
			}
		}
		return null;
	}

}
