package com.assignment.app.repository;

import com.assignment.app.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value = "SELECT * FROM user where id= ?1", nativeQuery = true)
	public User getUser(Integer id);

}
