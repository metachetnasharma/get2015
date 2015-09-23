package VehicleDekho;

import java.util.List;

import VehicleDekho.model.Vehicle;

public class Main {
	public static void main(String args[]) {
		VehicleDekhoParsing object = new VehicleDekhoParsing();
		VehicleJdbc vehicleJdbc = new VehicleJdbc();
		List<Vehicle> carList = object
				.readConfig("../CaseStudy1/xmlfile/Car.xml");
		System.out.println(carList);
		for (Vehicle vehicle : carList) {
			vehicleJdbc.insertIntoVehicle(vehicle);
		}
		List<Vehicle> bikeList = object
				.readConfig("../CaseStudy1/xmlfile/Bike.xml");
		System.out.println(bikeList);
		for (Vehicle vehicle : bikeList) {
			vehicleJdbc.insertIntoVehicle(vehicle);
		}
	}
}
