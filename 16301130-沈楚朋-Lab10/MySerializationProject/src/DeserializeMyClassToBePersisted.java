import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author BJTU16301130
 * @version 20171018
 */
public class DeserializeMyClassToBePersisted{
    public static void main(String[] args) {
        MyClassToBePersisted person = new MyClassToBePersisted();

        try{
            FileInputStream fis = new FileInputStream("Serialized");
            ObjectInputStream ois = new ObjectInputStream(fis);

            person = (MyClassToBePersisted) ois.readObject();
            ois.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.println(person);
    }
}
