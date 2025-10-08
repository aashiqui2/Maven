package com.jdbc.repository;

import java.util.List;

import com.jdbc.dto.OwnerDTO;

public interface OwnerRepository {
	List<OwnerDTO> findAllOwners();
}
