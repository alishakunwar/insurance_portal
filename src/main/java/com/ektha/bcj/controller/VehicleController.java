package com.ektha.bcj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.ektha.bcj.entity.Vehicle;
import com.ektha.bcj.service.IVehicleService;

@Controller
public class VehicleController {

	@Autowired
	IVehicleService vehicleService;

	@RequestMapping(value = "/")
	public ModelAndView displayVehicleInfo() {

		ModelAndView model = new ModelAndView("vehicle");
		return model;

	}

	/**
	 * This method get vehicle information based on customer's driver license.
	 * @param response
	 * This method 
	 */

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	@ResponseBody
	public List<Vehicle> getVehicleInfo(HttpServletRequest request, HttpServletResponse response) {

		int driverLicense = Integer.parseInt(request.getParameter("driverLicense"));

		List<Vehicle> vehicle = vehicleService.getVehicleInfo(driverLicense);

		System.out.println(vehicle);
		return vehicle;

	}

}
