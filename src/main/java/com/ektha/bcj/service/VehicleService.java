package com.ektha.bcj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.bcj.dao.IVehicleDAO;
import com.ektha.bcj.entity.Customer;
import com.ektha.bcj.entity.Vehicle;

@Service
public class VehicleService implements IVehicleService{

	@Autowired
	IVehicleDAO vehicleDAO;

	public List<Vehicle> getVehicleInfo(int driverLicense) {

		List<Vehicle> vehicle = vehicleDAO.getVehicleInfo(driverLicense);

		return vehicle;
	}

}
