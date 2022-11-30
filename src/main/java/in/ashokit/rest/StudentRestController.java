package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bind.Student;
@RestController
public class StudentRestController 
{
	@PostMapping(value= {"/student"},consumes= {"application/json","application/xml"})
	public ResponseEntity<String> addStudent(@RequestBody Student student)
	{
		System.out.println(student);
		String msg="Student saved";
		//logic to insert record in db
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}

}
