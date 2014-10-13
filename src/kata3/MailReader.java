package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailReader {
    private final String filePath;

    public MailReader(String filePatch) {
        this.filePath = filePatch;
    }
    
    public String[] readDomain(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            ArrayList<String> domainList = new ArrayList <>();
            reader.close();
            return null;
        } catch (IOException ex) {
            try {
                reader.close();
            } catch (IOException ex1) {}
            return new String[0];
        }
    }
}