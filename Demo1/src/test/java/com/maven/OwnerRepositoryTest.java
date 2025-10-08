package com.maven;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.maven.dto.OwnerDTO;
import com.maven.repository.OwnerRepository;
import com.maven.repository.impl.OwnerRepositoryImpl;


public class OwnerRepositoryTest {

	@Test
	public void testFindAllOwners() { 
		OwnerRepository ownerRepository = new OwnerRepositoryImpl();
		List<OwnerDTO> ownerDTOList = ownerRepository.findAllOwners();
		Assertions.assertFalse(ownerDTOList.isEmpty());
	}
}
