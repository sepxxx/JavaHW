package deadline01_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        FileInputStream iStream;
        Set<Integer> set = new TreeSet<>();

        try{
            iStream = new FileInputStream("in.txt");
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
            return;
        }
        int x;
        try{
            x = iStream.read();
            while( x != -1){
                set.add(x);
                x = iStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Integer> array = new ArrayList<>(set);
        for(int j = array.size() - 1; j >= 0; j--){
            System.out.print(array.get(j) + " ");
        }

        try{
            iStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}