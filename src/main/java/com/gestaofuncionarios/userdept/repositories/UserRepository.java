package com.gestaofuncionarios.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaofuncionarios.userdept.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
