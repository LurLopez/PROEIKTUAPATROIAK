package presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import adapter.DriverTable;
import businessLogic.BLFacade;
import businessLogic.BLFacadeFactory;
import domain.Driver;
import domain.Ride;

public class AdapterProbatu {
	
	public static void main(String[]	args)	{
		
		Driver driver = new Driver("Lur@", "Lur");

        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(1, "Bilbao", "Donostia", new Date(),3, (float)50.00, driver));
        rides.add(new Ride(2, "Gasteiz", "Iruñea", new Date(),3, (float)70.00,driver));
        rides.add(new Ride(3, "Donostia", "Bilbao", new Date(),3, (float)60.00,driver));
        
        driver.setRides(rides);

        DriverTable dt = new DriverTable(driver);
        dt.setVisible(true);

	}
	
}
