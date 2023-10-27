package exercises.section2;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;


public class SortStar {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,39,2,6));
        
        Collections.sort(test);

        for (Integer num: test) {
            System.out.print(num  + " * ");
        }
       
    }
}
