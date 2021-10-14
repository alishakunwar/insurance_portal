package com.ektha.bcj.service;

import java.util.List;

import com.ektha.bcj.entity.Vehicle;

public interface IVehicleService {
	
	public List<Vehicle> getVehicleInfo(int driverLicense);

}
