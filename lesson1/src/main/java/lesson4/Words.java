package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Words {
    public static void main(String[] args) {
     ArrayList<String> arrayWords = new ArrayList<>(Arrays.asList ("One","Two","Free", "Pants", "Four", "Five", "Five", "Six", "Pants", "Phone"));
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        for (int i = 0; i < arrayWords.size(); i++) {
            if (words.containsKey(arrayWords.get(i))){
                int current = words.get(arrayWords.get(i)) + 1;
                words.put(arrayWords.get(i), current);
            }else {
                words.put(arrayWords.get(i), 1);
            }

        }
        for (Map.Entry word:words.entrySet()){
            System.out.println(word);

        }

    }

}
