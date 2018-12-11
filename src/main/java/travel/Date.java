package travel;

public class Date {

    private int rok;
    private int miesiac;
    private int dzien;


    public Date(int rok, int miesiac, int dzien) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }


    @Override
    public String toString() {
        return "Date: " +
                "rok= " + rok +
                ", miesiac= " + miesiac +
                ", dzien= " + dzien ;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }
}
