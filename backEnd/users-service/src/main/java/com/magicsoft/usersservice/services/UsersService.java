package com.magicsoft.usersservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicsoft.usersservice.model.Users;
import com.magicsoft.usersservice.repository.UsersRepository;



@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository = null;
	
	 
	    public Users saveOrUpdateUser( Users user) {
	    	
	    	 
	    	
	        return usersRepository.save(user);
	    }
	    
	    public List<Users> getUsers() {
	    	 
	    	
	        return usersRepository.findAll();
	    }
	    

	
}
