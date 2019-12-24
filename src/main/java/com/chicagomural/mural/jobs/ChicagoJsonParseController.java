package com.chicagomural.mural.jobs;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chicagomural.mural.dao.MuralRepository;
import com.chicagomural.mural.entity.Mural;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/jobs")
public class ChicagoJsonParseController {
	
	private MuralRepository repo;
	
	@Autowired
	public ChicagoJsonParseController(MuralRepository repo) {
		this.repo = repo;
	}
	
	@PostMapping("/chicago-parse-data")
	public List<Mural> setMurals(){
		final List<Mural> savedMurals = new ArrayList<>();
		try {
			System.out.println("starting");
			final ObjectMapper mapper = new ObjectMapper();
			final List<Mural> murals = Arrays.asList(mapper.readValue(new File("data/chicago-mural.json"), Mural[].class));
			System.out.println("Parsed");
			System.out.println(murals.size());

			murals.stream().forEach(mural -> {
				repo.save(mural);
				savedMurals.add(mural);
			});
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
		return savedMurals;
	}

}
