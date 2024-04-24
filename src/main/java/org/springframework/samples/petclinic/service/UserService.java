package org.springframework.samples.petclinic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {


	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException {
	
		if(username.equals("James"))
		{
			return new User("James","pass",new ArrayList<>());
		}
		else
			throw new UsernameNotFoundException("User not found");
	}
}
