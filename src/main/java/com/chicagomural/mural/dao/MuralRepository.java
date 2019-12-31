package com.chicagomural.mural.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chicagomural.mural.entity.Mural;
public interface MuralRepository extends JpaRepository<Mural, Integer> {
	// disabled paths HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};
}
