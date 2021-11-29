package OVApp;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class JsonTest {

    @org.junit.jupiter.api.Test
    void parse() throws IOException {
        JSONParser jsonP = new JSONParser();

        try(FileReader reader = new FileReader("test.json")){
            Object obj = jsonP.parse(reader);
            System.out.println(obj);
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}