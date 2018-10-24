package com.example.demo.dao;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
@Component
public interface EmployeeRepository extends ElasticsearchRepository<Employee,String> {
	Employee queryEmployeeById(String id);

}
