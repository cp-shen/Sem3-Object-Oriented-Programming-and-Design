/**
 * @author BJTU16301130
 * @version 20171014
 */
public class Main{
    public static void main(String[] args) {
        Integer num = new Integer(1);
        Long num2 = new Long(2);
        Object obj = "BJTU";
        Boolean boo = new Boolean(true);

        PairExtendedAgain<Integer,Long,Object,Boolean> pe6 = new PairExtendedAgain(num,num2,obj,boo);

        System.out.println("First = " + pe6.getFirst());
        System.out.println("Second = " + pe6.getSecond());
        System.out.println("Third = " + pe6.getThird());
        System.out.println("Forth = " + pe6.getF1());
    }
}
