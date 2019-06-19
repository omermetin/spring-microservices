package com.omermetin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.omermetin.domain.Student;

@RestController
public class StudentServiceController {
	
	private static Map<String, List<Student>> schoolDB = new HashMap<String, List<Student>>();
	
	static {
		schoolDB = new HashMap<String, List<Student>>();
		
		List<Student> lst = new ArrayList<Student>();
		Student std = new Student("Omer", "PHD");
		lst.add(std);
		std = new Student("Mimar", "MBA");
		lst.add(std);
		
		schoolDB.put("abcschool", lst);
		
		lst = new ArrayList<Student>();
        std = new Student("Murat", "Class III");
        lst.add(std);
        std = new Student("Ali", "Class VI");
        lst.add(std);
 
        schoolDB.put("xyzschool", lst);
 
    }
 
    @RequestMapping(value = "/getStudentDetailsForSchool/{schoolname}", method = RequestMethod.GET)
    public List<Student> getStudents(@PathVariable String schoolname) {
        System.out.println("Getting Student details for " + schoolname);
 
        List<Student> studentList = schoolDB.get(schoolname);
        if (studentList == null) {
            studentList = new ArrayList<Student>();
            Student std = new Student("Not Found", "N/A");
            studentList.add(std);
        }
        return studentList;
    }
}