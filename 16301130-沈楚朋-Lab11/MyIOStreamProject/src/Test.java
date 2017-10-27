import java.io.FileReader;
import java.io.IOException;

public class Test{
    public static void main(String[] args){
        try{
            ChangeToUpperCaseInputStream upperIn =
                    new ChangeToUpperCaseInputStream(new FileReader("test.txt"));

            int got = upperIn.read();
            while(got != -1){
                System.out.printf("%c",got);
                got = upperIn.read();
            }

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
