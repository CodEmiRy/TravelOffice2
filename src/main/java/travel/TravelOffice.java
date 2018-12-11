package travel;

import java.util.HashMap;
import java.util.HashSet;

public class TravelOffice {

    HashSet<Customer> customers = new HashSet<Customer>();
    HashMap<String, Trip> trips = new HashMap<String, Trip>();


    public void addCustomer(Customer customer) {
        customers.add(customer);
    }


    public String getCustomerCount() {
        return "Obecnie jest " + customers.size() + " zapisanych osób w tablicy.";
    }

    @Override
    public String toString() {
        String info = "Zapisane osoby: ";
        for (Customer customer : customers) {
            info += customer.toString();
        }
        return info;
    }


    public void addTrip(String s, Trip t) {
        trips.put(s, t);
    }

    boolean removeTrip(String s) {
        if (trips.containsKey(s)) {
            trips.remove(s);
            return true;
        } else {
            return false;
        }
    }

    Customer findCustomerByName(String s) {
        for (Customer customer : customers) {
            if (customer.getName().equals(s)) {
                return customer;
            }
        }
        return null;
    }

    boolean removeCustomer(Customer c) {
        for (Customer customer : customers) {
            if (customer.equals(c)) {
                customers.remove(customer);
                return true;
            }
        }
        return false;
    }

}