package travel;

public class Customer {

    private String name;
    private Trip trip;
    private Address address;


    public Trip getTrip() {
        return trip;
    }

    public Customer(String name) {
        this.name = name;

    }

    public void setAddress(Address adr) {
        address = adr;
    }

    public void assignTrip(Trip tri) {
        trip = tri;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

            return "Customer" + "\n" +
                    "Name: " + name +
                    "" + "\n" + trip.toString() +
                    ", " + "\n" + address.toString() + "."
                    ;

    }
}
