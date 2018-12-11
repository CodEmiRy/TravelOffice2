package travel;

public abstract class Trip {

    private Date start;
    private Date end;
    private String destination;
    private double price;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Trip: " +"\n    -"+
                "Start " + start.toString() +"\n    -"+
                "End " + end.toString() +"\n    -"+
                "Destination: " + destination +"\n    -"+
                "Price: " + price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
