package com.maven;

import java.util.List;

import com.maven.dto.OwnerDTO;
import com.maven.service.OwnerService;
import com.maven.service.impl.OwnerServiceImpl;


public class Demo {
	private OwnerService ownerService;

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.run(args);
	}

	public void run(String... args) {
		ownerService = new OwnerServiceImpl();
		try {
			System.out.println("Welcome to Petistaan");
			List<OwnerDTO> ownerDTOList = ownerService.findAllOwners();
			System.out.println("There are " + ownerDTOList.size() + " owners.");
			ownerDTOList.forEach(System.out::println);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
