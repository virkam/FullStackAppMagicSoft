package com.magicsoft.usersservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.magicsoft.usersservice.model.Users;
import com.magicsoft.usersservice.services.UsersService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UsersController {
	
	@Autowired
	private UsersService usersService = null;

	 @RequestMapping(value = "/users" , method = RequestMethod.POST , produces = "application/json")
	 
	    public Users createUser( @RequestBody Users user) 
	 	{
		 		 
	        return usersService.saveOrUpdateUser(user);
	    }
	 


		@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
		public List<Users> getUsers() {
			
			List<Users> list = usersService.getUsers();
			System.out.println(" List "+list);
			return list;

		}
		
		 
	
	
}
