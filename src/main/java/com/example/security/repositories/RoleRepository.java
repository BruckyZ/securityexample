package com.example.security.repositories;

import com.example.security.Controller.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>
{
	Role findByRole (String role);
}
