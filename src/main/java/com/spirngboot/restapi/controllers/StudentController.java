package com.spirngboot.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.spirngboot.restapi.entities.Student;
import com.spirngboot.restapi.services.StudentService;
import java.util.*;

@Controller
public class StudentController {

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudents() {
		StudentService service = new StudentService();
		return service.getStudents();
	}

	@GetMapping("/students/{id}")
	@ResponseBody
	public Student getStudentById(@PathVariable("id") Integer id) {
		StudentService service = new StudentService();
		return service.getStudentById(id);
	}

}
