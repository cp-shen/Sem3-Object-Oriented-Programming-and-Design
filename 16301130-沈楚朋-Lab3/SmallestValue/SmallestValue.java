public class SmallestValue
{

    /** Creates a new instance of SmallestValue */
    public SmallestValue()
    {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declares the numbers
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int min = 99;


        //determines the smallest number
        min = (num1<num2)? num1:num2;
        min = (min<num3)? min:num3;


        //prints the output on the screen
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("The smallest number is = "+min);

        if(min<10)
            System.out.println ("The smallest number is less than 10!");
        else
            System.out.println ("The smallest number is greater than or equal to 10!");


    }

}