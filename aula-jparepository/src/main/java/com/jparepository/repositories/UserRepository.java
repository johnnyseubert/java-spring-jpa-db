package com.jparepository.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);
	
	Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);

}
