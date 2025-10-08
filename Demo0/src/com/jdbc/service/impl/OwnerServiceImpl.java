package com.jdbc.service.impl;

import java.util.List;

import com.jdbc.dto.OwnerDTO;
import com.jdbc.repository.OwnerRepository;
import com.jdbc.repository.impl.OwnerRepositoryImpl;
import com.jdbc.service.OwnerService;


public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;
	
	public OwnerServiceImpl() {
		this.ownerRepository = new OwnerRepositoryImpl();
	}

	@Override
	public List<OwnerDTO> findAllOwners() {
		return ownerRepository.findAllOwners();
	}
}
