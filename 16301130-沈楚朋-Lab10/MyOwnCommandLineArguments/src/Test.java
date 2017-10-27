/**
 * @author BJTU16301130
 * @version 20171018
 */
public class Test{
    public static void main(String[] args) {
        int[] ages = new int[args.length/2];

        for(int i = 0; i < args.length; i++){
            if(i % 2 == 1){
                try{
                    ages[i/2] = Integer.parseInt(args[i]);
                }catch (NumberFormatException ex){
                    ex.printStackTrace();
                    System.out.println("Please input the text in correct format.");
                }
            }
        }

        float sum = 0, ave = 0;
        for(int age : ages){
            sum += age;
        }
        ave = sum/ages.length;

        System.out.println("The average age is " + ave);
    }
}
