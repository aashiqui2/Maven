package com.maven.service.impl;

import java.util.List;

import com.maven.dto.OwnerDTO;
import com.maven.repository.OwnerRepository;
import com.maven.repository.impl.OwnerRepositoryImpl;
import com.maven.service.OwnerService;

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
