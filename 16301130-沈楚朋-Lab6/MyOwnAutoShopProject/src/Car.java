/**
 * @author BJTU16301130
 * @version 20170922
 */
public class Car{
    private int speed;
    private double regularPrice;
    private String color;

    public double getSalePrice(){
        return regularPrice;
    }

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
}

class   Truck extends Car{
    private int weight;

    /**
     * @return If weight > 2000, 10% discount. Otherwise, 20% discount.
     */
    public double getSalePrice(){
        if(weight > 2000){
            return  super.getSalePrice() * 0.9;
        }
        else{
            return  super.getSalePrice() * 0.8;
        }
    }
    public Truck(int speed, double regularPrice, String color, int weight)
    {
        super(speed,regularPrice,color);
        this.weight = weight;
    }
}

class Ford extends Car{
    private int year;
    private int manufacturerDiscount;

    /**
     * @return From the sale price computed from Car class, subtract the manufacturerDiscount.
     */
    public double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount)
    {
        super(speed,regularPrice,color);
        this.manufacturerDiscount = manufacturerDiscount;
        this.year = year;
    }
}

class Sedan extends Car{
    private int length;

    public double getSalePrice() {
        if(length > 20){
            return super.getSalePrice() * 0.95;
        }
        else{
            return super.getSalePrice() * 0.9;
        }
    }
    public Sedan(int speed, double regularPrice, String color, int length)
    {
        super(speed,regularPrice,color);
        this.length = length;
    }
}

