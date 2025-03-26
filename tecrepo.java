package com.learningstd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningstd.model.eteacher;
@Repository
public interface tecrepo extends JpaRepository<eteacher,Integer>
{
	
	public eteacher findByEmail(String email);
}
