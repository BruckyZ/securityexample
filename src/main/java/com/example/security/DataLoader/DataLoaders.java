package com.example.security.DataLoader;

import com.example.security.Controller.User;
import com.example.security.repositories.RoleRepository;
import com.example.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

@Component
public class DataLoaders implements CommandLineRunner
{

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public void run(String... strings) throws Exception
	{
		System.out.println("Loading data...");

		roleRepository.save(new Role("USER")
		roleRepository.save(new Role("ADMIN"));

		Role adminRole = roleRepository.findByRole("ADMIN");
		Role userRole = roleRepository.findByRole("USER");


		User user = new User("bob@bob.com", "bob", "Bob", "Bobberson", true, "bob");
		user.(userRole);
		userRepository.save(user);
	}
}