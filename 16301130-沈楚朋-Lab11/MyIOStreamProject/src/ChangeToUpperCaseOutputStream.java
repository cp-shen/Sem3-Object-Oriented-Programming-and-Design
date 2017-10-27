import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class ChangeToUpperCaseOutputStream extends FilterWriter{
    public ChangeToUpperCaseOutputStream (Writer out){
        super(out);
    }

    @Override
    public void write(int c) throws IOException{
        super.write(Character.toUpperCase(c));
    }
}
