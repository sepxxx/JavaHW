package deadline15_12;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader rText = new BufferedReader(new FileReader("src/deadline15_12/eng.txt"));
            BufferedReader rDict = new BufferedReader(new FileReader("src/deadline15_12/dict.txt"));
            Map<String, String> dict = new HashMap<>();
            String line = rDict.readLine();
            while (line != null) {
                dict.put(line.split("=")[0], line.split("=")[1]);
                line = rDict.readLine();
            }
            line = rText.readLine();
            while (line != null) {
                String[] words = line.split("[ .,!?:]");
                for (String word : words) {
                    word=word.toLowerCase();
                    System.out.print(dict.getOrDefault(word, word)+" ");
                }
                System.out.println();
                line = rText.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}