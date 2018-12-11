package travel;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.FieldSetter;

import static org.junit.Assert.*;

public class CustomerTest {
    private Trip trip;
    private Customer customerTest;

    @Before
    public void addCustomerAndTravelToTest() {
        customerTest = new Customer("Test");
        Date start = new Date(2016, 3, 23);
        Date end = new Date(2019, 3, 23);
        trip = new AbroadTrip(start, end, "Testowy trip");
        //new FieldSetter(customerTest, Customer.class.getDeclaredField("greetService")).set(new GreetService("Dupa1"));

    }

    @Test
    public void assignTrip() {
        customerTest.assignTrip(trip);
        assertEquals(trip, customerTest.getTrip());
    }
    @Test
    public void assignTripIsNull() {
        assertNull(customerTest.getTrip());
    }
}