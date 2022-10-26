package com.example.swagger;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	

	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
		return employeeRepository.findById(id).get() != null ? employeeRepository.findById(id).get() : null;
		//return sd.findById(id).get() != null ? sd.findById(id).get() : null;
		
	}

	
	public Employee updateEmployee(Employee employee, long id) {
//		
//		// we need to check whether employee with given id is exist in DB or not
//		Employee existingEmployee = employeeRepository.findById(id).get() != null ? employeeRepository.findById(id).get() : null;
//		
//		existingEmployee.setFirstName(employee.getFirstName());
//		existingEmployee.setLastName(employee.getLastName());
//		existingEmployee.setEmail(employee.getEmail());
//		// save existing employee to DB
//		employeeRepository.save(existingEmployee);
//		return existingEmployee;
	     //   if (employee.getId()!= 0)
	        
	            //Optional<Employee> wipConfigurationData = employeeRepository.findById(id);

	        //    if (wipConfigurationData.isPresent())
	           

	                Employee updatedWipConfiguration = employeeRepository.save(employee);

	                return updatedWipConfiguration;

	           
	            
	        }

	
	public void deleteEmployee(long id) {
		
		// check whether a employee exist in a DB or not
		//Employee existingEmployee = employeeRepository.findById(id).get() != null ? employeeRepository.findById(id).get() : null;
		employeeRepository.deleteById(id);
	}
	
}
//package com.example.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.dao.studentDao;
//import com.example.demo.model.studentData;
//
//@Service
//public class studentService {
//	@Autowired
//	studentDao sd;
//
//	public studentData studentdata(studentData studentdata) {
//		return sd.save(studentdata);
//
//	}
//
//	public studentData gettingid(int id)
//
//	{
//
//		return sd.findById(id).get() != null ? sd.findById(id).get() : null;
//
//	}
//	
//	
//	public studentData updateEmployee(studentData studentdata, int id) {
//		
//		// we need to check whether employee with given id is exist in DB or not
//		studentData existingEmployee = sd.findById(id).get() != null ? sd.findById(id).get() : null;
//		
//		existingEmployee.setName(studentdata.getName());
//		existingEmployee.setDept(studentdata.getDept());
//		
//		// save existing employee to DB
//		sd.save(existingEmployee);
//		return existingEmployee;
//	}
//}
