import java.io.File;
import java.util.Date;


/**
 * @author BJTU16301130
 * @version 20171021
 */
public class DirListing{
    private enum Switch{recurOn, recunOff, verboseOn, verboseOff}

    public static void showDirlist(String dirName, int layer, Switch recur, Switch verbose){
        File dir = new File(dirName);
        for(File file : dir.listFiles()){
            Date lastModified = new Date(file.lastModified());

            if(file.isFile()){
                for(int i = 0; i < layer ; i++){
                    System.out.print("    ");
                }
                if(verbose.equals(Switch.verboseOn)){
                    System.out.println("File: " + file.getName() + "    " + file.length() + "    " + lastModified);
                }else {
                    System.out.println("File: " + file.getName());
                }
            }else {
                for(int i = 0; i < layer; i++){
                    System.out.print("    ");
                }
                System.out.println("SubDir: " + file.getName() + "    " + lastModified);

                if(recur.equals(Switch.recurOn))
                    showDirlist(file.getAbsolutePath(), ++layer, recur, verbose);
            }
        }
    }

    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("args can not be resolved.\n" +
                    "Usage:\n" +
                    "java DirListing [-R] [-verbose] [directory]");
            System.exit(-1);
        }

        String dirName = args[2];
        Switch recur = null;
        Switch verbose = null;

        if(new File(dirName).isDirectory() == false){
            dirName = ".";
        }

        if(args[0].equals("-R")){
            recur = Switch.recurOn;
        }else {
            recur = Switch.recunOff;
        }

        if(args[1].equals("-verbose")){
            verbose = Switch.verboseOn;
        }else {
            verbose = Switch.verboseOff;
        }

        DirListing.showDirlist(dirName,0, recur, verbose);
    }
}
