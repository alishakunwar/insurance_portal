package com.ektha.bcj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ektha.bcj.entity.Vehicle;

@Component("vehicleRowMapper")
public class VehicleRowMapper implements RowMapper<Vehicle> {

	@Override
	public Vehicle mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Vehicle vehicle = new Vehicle();

		vehicle.setVin(resultSet.getString("VIN"));
		vehicle.setManufacturer(resultSet.getString("Manufacturer"));
		vehicle.setModel(resultSet.getString("Model"));
		vehicle.setYear(resultSet.getInt("Year"));

		return vehicle;

	}

}
