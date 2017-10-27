import java.io.*;

/**
 * @author BJTU16301130
 * @version 20171018
 */
public class SerializeMyClassToBePersisted{
    public static void main(String[] args) {
        MyClassToBePersisted person =
                new MyClassToBePersisted("Wang",18,"Basketball", "BJTU",2017);

        try {
            FileOutputStream fos = new FileOutputStream("Serialized");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);
            oos.close();

            System.out.println("Object serialization succeeded.");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
