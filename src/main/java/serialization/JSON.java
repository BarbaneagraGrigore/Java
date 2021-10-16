package serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSON {
    static ObjectMapper mapper = new ObjectMapper();

    public static void writeToJSON() {
        User user = new User();

        List<String> msg = new ArrayList<>();
        msg.add("hello friend 1");
        msg.add("hello friend 2");
        msg.add("hello friend 3");

        user.setName("Grigore Barbăneagră");
        user.setAge(25);
        user.setMessages(msg);

        try {
            //Convert object to serialization.JSON string and save into file directly
            mapper.writeValue(new File("C:\\Users\\gbarbaneagra\\Downloads\\test\\test.json"), user);

            //Convert object to serialization.JSON string and pretty print
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonInString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromJSON() {

        try {
            // Convert serialization.JSON string from file to Object
            User user = mapper.readValue(new File("C:\\Users\\gbarbaneagra\\Downloads\\test\\test.json"), User.class);

            //Convert object to serialization.JSON string and pretty print
            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonInString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

