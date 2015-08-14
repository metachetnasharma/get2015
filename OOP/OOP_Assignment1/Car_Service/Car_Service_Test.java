package Car_Service;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Car_Service_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ServiceStation serviceStation = new ServiceStation();
		serviceStation.readMechanics();
		serviceStation.readCars();
		serviceStation.doAllotment();
		HashMap<String, Integer> carProcessingList = serviceStation
				.getCarProcessingStatus();
		HashMap<String, Integer> expCarProcessingList = new HashMap<String, Integer>();
		expCarProcessingList.put("SUV", 2);
		expCarProcessingList.put("Sedan", 2);
		expCarProcessingList.put("HB", 1);
		Assert.assertEquals("Not matched", true,
				compareHashMap(expCarProcessingList, carProcessingList));

	}

	public boolean compareHashMap(HashMap<String, Integer> hash1,
			HashMap<String, Integer> hash2) {
		if (hash1.keySet().size() != hash2.keySet().size()) // in case when one
															// of the map is
															// containing more
															// elements
			return false;

		for (String carType : hash1.keySet()) {
			if (hash2.containsKey(carType)
					&& hash1.get(carType) != hash2.get(carType))
				return false;
		}

		return true;

		// fail("Not yet implemented");
	}

}
