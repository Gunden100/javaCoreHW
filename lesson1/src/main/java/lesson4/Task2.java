package lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook a = new PhoneBook();
        a.add("Second Name", "123");
        a.add("Second Name", "456");
        a.add("Second Name1", "789");
        System.out.println(a.get("Арсен"));
        System.out.println(a.get("Second Name"));
        }
}
class PhoneBook{
    HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
    public void add(String name, String number){
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);
        }else {
            ArrayList<String> test = new ArrayList<String>();
            test.add(number);
            phoneBook.put(name, test);
        }

    }
    public ArrayList<String> get(String name){
        return phoneBook.get(name);
    }

}


