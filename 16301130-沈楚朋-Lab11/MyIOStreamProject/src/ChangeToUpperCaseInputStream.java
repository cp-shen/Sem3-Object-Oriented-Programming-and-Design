import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class ChangeToUpperCaseInputStream extends FilterReader{
    public ChangeToUpperCaseInputStream(Reader in){
        super(in);
    }

    @Override
    public int read() throws IOException{
        return Character.toUpperCase(super.read());
    }

}
