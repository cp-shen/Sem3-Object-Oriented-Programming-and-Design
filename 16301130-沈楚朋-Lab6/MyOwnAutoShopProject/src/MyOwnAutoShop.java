import javax.swing.*;

/**
 * Create and display the sale prices of all instance.
 */
public class MyOwnAutoShop{
    public static void main(String[] args) {
    Sedan sedan = new Sedan(100,50000,"blue",4);
    Ford ford1 = new Ford(100,50000,"blue",4,5000);
    Ford ford2 = new Ford(100,50000,"white",2,8000);
    Car car = new Car(100,50000,"black");

        JOptionPane.showMessageDialog(null,
                "The sale prices of sedan is" + sedan.getSalePrice() +
                        "\nThe sale prices of ford1 is" + ford1.getSalePrice() +
                        "\nThe sale prices of ford2 is" + ford2.getSalePrice() +
                        "\nThe sale prices of car is" + car.getSalePrice());

    }

}
