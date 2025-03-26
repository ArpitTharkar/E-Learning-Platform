package com.learningstd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.learningstd.model.stuestu;
@Repository
public interface sturepo extends JpaRepository<stuestu,Integer>
{
	public stuestu findBysemail(String semail);

}
