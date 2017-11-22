package com.example.security.repositories;

import com.example.security.Controller.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
	User findByUsername(String username);
	User findByemail(String email);
	Long countByEmail (String email);
	Long countByusername (String username);
}
