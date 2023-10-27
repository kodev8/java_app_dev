package exercises.section2;

import java.util.Collections;
import java.util.Arrays;


public class SortArgs {

    public static void main (String args[]) {

        Collections.sort(Arrays.asList(args));

        for (String item: args) {
            System.out.println(item);
        }


    }
    
}
