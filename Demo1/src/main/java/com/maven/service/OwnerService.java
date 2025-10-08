package com.maven.service;

import java.util.List;

import com.maven.dto.OwnerDTO;


public interface OwnerService {
	List<OwnerDTO> findAllOwners();
}