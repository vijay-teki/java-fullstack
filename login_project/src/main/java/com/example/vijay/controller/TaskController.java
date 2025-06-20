package com.example.vijay.controller;
import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/getPublic")
public class TaskController {
	
	   static  List<Details> list = new ArrayList<>();

	@GetMapping("/{id}/testing/{secondId}")
    public void task(@PathVariable("id") String studentid,
    		@PathVariable("secondId") String empid,
    		@RequestParam("name") String name) 
	{
        System.out.println("In the get controller ");
        System.out.println(empid);
    }
	@PostMapping
	public void posttask() {
		System.out.println("in the post");
	}
	public static void main(String args[]) {
		
	}
	
	   @GetMapping("/get")
	    public List<Details> display(){
	    	return list;
	    }
	   @PostMapping("/add")
	    public String addStudent(
	            @RequestParam String stdname,
	            @RequestParam int stdid,
	            @RequestParam String branch) {

	        Details d = new Details(stdname, stdid, branch);
	        list.add(d);
	        return "Succesfully added student";
	    }


	   
	   @DeleteMapping("/{id}")
	    public String  delete(@PathVariable("id") int id) {
	    	Iterator<Details> iterator = list.iterator();

	        while (iterator.hasNext()) {
	            Details d = iterator.next();
	            if (d.getStdid() == id) {
	                iterator.remove(); // Safely remove using iterator
	                return "Student with ID " + id + " deleted successfully.";
	            }
	        }

	        return "Student with ID " + id + " not found.";
	    }

	
	
//	@GetMappning("/name")
//	public void add()
	

}