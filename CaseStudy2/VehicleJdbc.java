package VehicleDekho;



import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

import VehicleDekho.model.Vehicle;
import VehicleDekho.model.Bike;
import VehicleDekho.model.Car;


public class VehicleJdbc {
	
public  boolean insertIntoVehicle(Vehicle vehicle) {
		
		Connection con = null;
		PreparedStatement ps = null;
		int result;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "INSERT INTO vehicle (`vehicle_id`, `make`, `model`, `engineInCC`, `fuelCapacity`,"
				+ " `mileage`, `price`, `roadTax`,`created_time`,`created_by`)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
	
		try {
			ps = con.prepareStatement(query);
			//System.out.println(vehicle.getEngineInCc());
			ps.setInt(1,vehicle.getVehicleId());
			ps.setString(2,vehicle.getMake());
			ps.setString(3,vehicle.getModel());
			ps.setInt(4,vehicle.getEngineInCc());
			ps.setInt(5,vehicle.getFuelCapacity());
			ps.setInt(6,vehicle.getMileage());
			ps.setDouble(7,vehicle.getPrice());
			ps.setDouble(8,vehicle.getRoadTax());
			ps.setString(9,vehicle.getCreated_time());
			ps.setString(10,vehicle.getCreated_by());
			result = ps.executeUpdate();
			if(result!=0) {
				if(vehicle instanceof Car) {
					  insertIntoCar(vehicle);
					return true;
				}
				else {
					 insertIntoBike(vehicle);
					return true;
				}
					
					
			}
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

private boolean insertIntoCar(Vehicle vehicle) {
	Connection con = null;
	PreparedStatement ps = null;
	boolean result;
	ConnectionUtil conUtil = new ConnectionUtil();
	con = conUtil.getConnection();
	String query = "INSERT INTO Car (`vehicle_id`, `ac`, `powerSteering`, `accessoryKit`)"
			+ " VALUES (?, ?, ?, ?); ";

		try {
		ps = con.prepareStatement(query);
		
		ps.setInt(1,vehicle.getVehicleId());
		ps.setBoolean(2,((Car) vehicle).isAc());
		ps.setBoolean(3,((Car) vehicle).isPowerSteering());
		ps.setString(4,((Car) vehicle).getAccessoryKit());
		result = ps.execute();
		
		return result;
			
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
	
		try {
			if (con != null) {
				con.close();
			}
			if (ps != null) {
				ps.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	return false;

}

private boolean insertIntoBike(Vehicle vehicle) {
	Connection con = null;
	PreparedStatement ps = null;
	boolean result;
	ConnectionUtil conUtil = new ConnectionUtil();
	con = conUtil.getConnection();
	String query = "INSERT INTO Bike (`vehicle_id`, `SelfStart`, `HelmetPrice`)"
			+ " VALUES (?, ?, ?);  ";

	try {
		ps = con.prepareStatement(query);
		
		ps.setInt(1,vehicle.getVehicleId());
		ps.setBoolean(2,((Bike) vehicle).isSelfStart());
		ps.setInt(3,((Bike) vehicle).getHelmetPrice());
		result = ps.execute();
		
		return result;
		
			
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
	
		try {
			if (con != null) {
				con.close();
			}
			if (ps != null) {
				ps.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	return false;

}

}
