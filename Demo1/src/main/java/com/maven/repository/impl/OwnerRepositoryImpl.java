package com.maven.repository.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maven.config.DatabaseConfig;
import com.maven.dto.OwnerDTO;
import com.maven.exception.InternalServiceException;
import com.maven.repository.OwnerRepository;
import com.maven.util.MapperUtil;


public class OwnerRepositoryImpl implements OwnerRepository {
	@Override
	public List<OwnerDTO> findAllOwners() {
		String sql = "SELECT * FROM owner_table";
		List<OwnerDTO> ownerList = new ArrayList<>();
		try (Connection connection = DatabaseConfig.getConnection();
				Statement statement = connection.createStatement();) {
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				OwnerDTO owner = MapperUtil.convertOwnerResultSetToDto(resultSet);
				ownerList.add(owner);
			}
		} catch (ClassNotFoundException | SQLException exception) {
			throw new InternalServiceException(exception.getMessage());
		}
		return ownerList;
	}
}
