package cz.tul.alg.wed.tomku;

public class Bus {
    private int numberOfRoute;
    private int noOfSeats;
    private String company;
    private int noOfPax;

    public Bus(String company, int noOfSeats, int numberOfRoute) {
        this.company = company;
        this.noOfSeats = noOfSeats;
        this.numberOfRoute = numberOfRoute;
        this.noOfPax = 0;
    }

    public Bus() {
        this.noOfSeats = 40;
    }

    public int getSeats() {
        return this.noOfSeats;
    }

    public int getPax() {
        return this.noOfPax;
    }

    public String getCompany() {
        return this.company;
    }

    public int getRoute() {
        return this.numberOfRoute;
    }

    public void vystoupit(int pax) {
        if (pax > this.noOfPax) {
            int temp = pax - noOfPax;
            pax -= temp;
            this.noOfPax -= pax;
        } else {
            this.noOfPax -= pax;
        }
    }

    public void nastoupit(int pax) {
        if (pax > this.noOfSeats) {
            int temp = pax - noOfSeats;
            pax -= temp;
            this.noOfPax += pax;
        } else {
            this.noOfPax += pax;
        }
    }

    public void vystoupitAll() {
        this.noOfPax = 0;
    }

    public void changeParams(String company, int numberOfRoute) {
        this.company = company;
        this.numberOfRoute = numberOfRoute;
    }

    @Override
    public String toString() {
        return String.format("Autobus číslo %s, společnosti %s, s počtem sedadel %s veze %s cestujících.", getRoute(), getCompany(), getSeats(), getPax());
    }
}
