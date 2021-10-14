package com.ektha.bcj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.bcj.entity.Customer;
import com.ektha.bcj.entity.Vehicle;

@Repository
public class VehicleDAO implements IVehicleDAO {

	private static final String SQL_SEARCH_VEHICLE = "select VIN, Manufacturer, Model, Year from vehicle v join customer c where v.driverLicense = c.DriverLicense and v.driverLicense = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private VehicleRowMapper vehicleRowMapper;

	int driverLicense;

	@Override
	public List<Vehicle> getVehicleInfo(int driverLicense) {

		List<Vehicle> vehicle = jdbcTemplate.query(SQL_SEARCH_VEHICLE, vehicleRowMapper, driverLicense);

		return vehicle;

	}

}
