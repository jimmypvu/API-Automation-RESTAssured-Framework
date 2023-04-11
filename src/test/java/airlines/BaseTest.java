package airlines;

import utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class BaseTest {
    public static Map<String, Object> jsonData;

    //static block automatically gets run when class starts, can do it this way too instead of with @before annotations
    static{
        String env = System.getProperty("env").equals("") || System.getProperty("env") == null ? "qa" : System.getProperty("env");

        try {
            jsonData = JsonUtils.getJsonDataAsMap("airlines/"+env+"/airlinesApiData.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    @BeforeTest
//    public void setup() throws IOException {
//        String env = System.getProperty("env").equals("") || System.getProperty("env") == null ? "qa" : System.getProperty("env");
//        jsonData = JsonUtils.getJsonDataAsMap("airlines/"+env+"/airlinesApiData.json");
//    }
}
