package tourAgentstvo;

public class Tour {
    private String country;
    private String days;
    private String transport;
    private double price;

    public Tour(){

    }
    public Tour(String country, String days, String transport, double price){
        this.country = country;
        this.days = days;
        this.transport = transport;
        this.price = price;
    }
    public Tour(String country, double price){

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return getCountry() + " на " + getDays() + " дней транспорт - " + getTransport() + " цена тура " + getPrice() + " руб.";
    }
}
