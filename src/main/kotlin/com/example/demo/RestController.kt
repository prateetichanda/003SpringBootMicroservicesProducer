package com.example.demo

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping

@RestController
@RequestMapping("/emp")
class RestController() {
	
	@RequestMapping("/client")
	fun welcome():Employee
	{
		var emp=Employee(1,"prateeti",23,"Commsmedia");
		emp.toString();
		return emp;
	}
	
}