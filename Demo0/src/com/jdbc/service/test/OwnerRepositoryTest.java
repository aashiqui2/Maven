package com.jdbc.service.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.jdbc.dto.OwnerDTO;
import com.jdbc.repository.OwnerRepository;
import com.jdbc.repository.impl.OwnerRepositoryImpl;


public class OwnerRepositoryTest {

	@Test
	public void testFindAllOwners() { 
		OwnerRepository ownerRepository = new OwnerRepositoryImpl();
		List<OwnerDTO> ownerDTOList = ownerRepository.findAllOwners();
		Assertions.assertFalse(ownerDTOList.isEmpty());
	}
}
