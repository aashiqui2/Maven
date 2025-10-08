package com.jdbc.service;

import java.util.List;

import com.jdbc.dto.OwnerDTO;


public interface OwnerService {
	List<OwnerDTO> findAllOwners();
}