package travel;

public class AbroadTrip extends Trip {
    double insurance;


    public AbroadTrip(Date start, Date end, String destination) {
        super(start, end, destination);
    }

    public double getPrice() {
        return super.getPrice() + insurance;

    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
        double price = getPrice();
        super.setPrice(price);

    }
}
