package com.maven.repository;

import java.util.List;

import com.maven.dto.OwnerDTO;


public interface OwnerRepository {
	List<OwnerDTO> findAllOwners();
}
