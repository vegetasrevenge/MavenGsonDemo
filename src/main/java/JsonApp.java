import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonApp {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        List<String> contactFileStrings = new ArrayList<>();
        try {
            contactFileStrings = Files.readAllLines(Paths.get("src/main/java/contacts.json"));

        } catch (IOException e) {
            System.out.println("idk broh");
        }

        List<Contact> contactList = new Gson().fromJson(contactFileStrings.get(0), new TypeToken<List<Contact>>(){
        }.getType());

        for(Contact c : contactList){
            System.out.println(c.getPrintableString());
        }

//        for (int i = 0; i < 30; i++) {
//            //make a contact and add to list
//            Contact contact = new Contact(i, "Casey", "Edwards", "1293854763");
//            contactList.add(contact);
//        }
//
        Contact newC = new Contact(30, "Paul", "Wall", "385723646236");
        contactList.add(newC);
        //Files.write wants a list of strings
        List<String> contactStringList = new ArrayList<>();

        // JSON is essentially a string
        String contactString = new Gson().toJson(contactList);
        // Add JSON string to the list
        contactStringList.add(contactString);

        try {
            Files.write(Paths.get("src/main/java/contacts.json"), contactStringList);
        } catch (IOException e) {
            System.out.println("womp womp");
            e.printStackTrace();
        }
    }
}
