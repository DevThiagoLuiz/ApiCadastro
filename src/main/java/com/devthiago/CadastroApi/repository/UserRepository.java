package com.devthiago.CadastroApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devthiago.CadastroApi.dto.UserDto;
import com.devthiago.CadastroApi.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query
	public User findByNomeOrEmail(String nome, String email);

	public UserDto findByEmail(String email);

	

}
