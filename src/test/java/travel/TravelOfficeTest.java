package travel;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.internal.util.reflection.FieldSetter;

import java.util.Calendar;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class TravelOfficeTest {

    private TravelOffice travelOffice;
    private Trip tripTest;
    private Customer customerTest;

    @Before
    public void addCustomerAndTravelToTest() {
        travelOffice = new TravelOffice();
        Address addressTest = new Address("69-212", "Lodz", "test");
        Date start = new Date(2016, 3, 23);
        Date end = new Date(2019, 3, 23);
        tripTest = new AbroadTrip(start, end, "Testowy trip");
        tripTest.setPrice(130.50);
        AbroadTrip abroadTrip = (AbroadTrip) tripTest;
        abroadTrip.setInsurance(10);
        customerTest = new Customer("Test");
        customerTest.setAddress(addressTest);
        customerTest.assignTrip(tripTest);
    }

    @Test
    public void addCustomer() {
        travelOffice.addCustomer(customerTest);
        assertFalse(travelOffice.customers.isEmpty());
    }


    @Test
    public void addTrip() {

        travelOffice.addTrip("SuperTripTest", tripTest);
        assertFalse(travelOffice.trips.isEmpty());
    }
    @Test
    public void addTrip2() {

        assertTrue(travelOffice.trips.isEmpty());
    }

    @Test
    public void removeTrip() {

        travelOffice.addTrip("SuperTripTest", tripTest);
        assertTrue(travelOffice.removeTrip("SuperTripTest"));
    }

    @Test
    public void removeTripIsEmpty() {

        travelOffice.addTrip("SuperTripTest", tripTest);
        travelOffice.removeTrip("SuperTripTest");
        assertTrue(travelOffice.trips.isEmpty());
    }

    @Test
    public void removeTripIfTripDoesNotExist() {

        travelOffice.removeTrip("SuperTripTest");
        assertFalse(travelOffice.removeTrip("SuperTripTest"));
    }


    @Test
    public void findCustomerByName() {
        travelOffice.addCustomer(customerTest);
        assertEquals(customerTest, travelOffice.findCustomerByName("Test"));
    }

    @Test
    public void findCustomerByNameIfListIsEmpty() {
        assertNull(travelOffice.findCustomerByName("Test"));
    }


    @Test
    public void removeCustomer() {
        travelOffice.addCustomer(customerTest);
        assertTrue(travelOffice.removeCustomer(customerTest));
    }

    @Test
    public void removeCustomerIfListIsEmpty() {
        travelOffice.addCustomer(customerTest);
        assertFalse(travelOffice.customers.isEmpty());
    }
}