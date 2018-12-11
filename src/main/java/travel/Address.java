package travel;

public class Address {

    private String zip;
    private String cit;
    private String street;


    public Address(String zip, String cit, String street) {
        this.zip = zip;
        this.cit = cit;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address: " +
                "zip=" + zip +
                ", cit=" + cit +
                ", street=" + street ;
    }
}
