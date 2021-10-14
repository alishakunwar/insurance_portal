package com.ektha.bcj.dao;

import java.util.List;

import com.ektha.bcj.entity.Vehicle;

public interface IVehicleDAO {

	public List<Vehicle> getVehicleInfo(int driverLicense);
	

}
