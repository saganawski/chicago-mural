package com.chicagomural.mural.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chicagomural.mural.entity.Mural;

public interface MuralRepository extends JpaRepository<Mural, Integer> {

}
