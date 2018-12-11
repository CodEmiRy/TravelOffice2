package travel;

public class DomesticTrip extends Trip {
    double ownArrivalDiscount;
    double price;


    public DomesticTrip(Date start, Date end, String destination) {
        super(start, end, destination);

    }

    public double getPrice() {
        return  super.getPrice() - ownArrivalDiscount;
    }

    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
        double price = getPrice();
        super.setPrice(price);
    }
}
