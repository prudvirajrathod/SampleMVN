package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.repo.ITouristRepo;

@Service
public class TouristService implements ITouristMgntService {

	@Autowired
	private ITouristRepo repo;
	
	@Override
	public String registerTourist(Tourist tourist) {
		String val = repo.save(tourist).getFeuserid();
		return "Record with id: "+val+" is inserted";
	}

	@Override
	public List<Tourist> fetchAll() {
		List<Tourist> list = repo.findAll();
		//list.sort((t1, t2)->t1.getFeUserId().compareTo(t2.getFeUserId()));
		return list;
	}

	
	
}
