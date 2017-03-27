package net.a6te.lazycoder.labtest1;

/**
 * Created by Mobile App Develop on 3/27/2017.
 */

public class Calculation {
    private double price;
    private double vat;
    private double discount;
    private  Result result;



   /* public Calculation(double price, double vat, double discount) {
        this.price = price;
        this.vat = vat;
        this.discount = discount;
    }*/

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }




    /*public double calculate()
    {

        return price + vat -discount;
    }*/
}
