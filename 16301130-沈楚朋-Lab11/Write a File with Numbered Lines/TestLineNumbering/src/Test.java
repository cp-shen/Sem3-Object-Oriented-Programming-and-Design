import java.io.*;

/**
 * @author BJTU16301130
 * @version 20171021
 */
public class Test{
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Please enter the name of a file.");
            System.exit(-1);
        }

        File file = new File(args[0]);
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);

            String line = null;
            int lineNum = 1;
            while((line = reader.readLine()) != null ) {
                if (line.equals("") == false) {
                    writer.write(lineNum + " " + line + "\r\n");
                    lineNum++;
                }else{
                    break;
                }
            }

            inputStreamReader.close();
            reader.close();
            fileWriter.close();
            writer.close();
        }catch (FileNotFoundException ex){
            ex.getStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
