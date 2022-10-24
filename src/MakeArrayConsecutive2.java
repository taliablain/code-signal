/*
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
each statue having a non-negative integer size. Since he likes to make things perfect,
he wants to arrange them from smallest to largest so that each statue will be bigger
than the previous one by exactly 1. He may need some additional statues to be able to
accomplish that. Help him figure out the minimum number of additional statues needed.
 */

/*
EXAMPLE
For statues = [6, 2, 3, 8], the output should be solution(statues) = 3
Ratiorg needs statues of sizes 4, 5 and 7.
 */


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class MakeArrayConsecutive2 {

    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        double max = statues[0];
        for (int counter = 1; counter < statues.length; counter++)
        {
            if (statues[counter] > max)
            {
                max = statues[counter];
            }
        }
        //System.out.println("The biggest statue size is: " + max);
        for(int x = 0; x < statues.length; x++) {
            if(statues[x] <= max){
                //System.out.println(statues[x]);
            }

            }
        int maxInt = (int)max;
        int[] arr = IntStream.rangeClosed(1, maxInt).toArray();
        //System.out.println(Arrays.toString(arr));

       Arrays.sort(statues);
       HashSet<Integer> set = new HashSet<>();

       for (int i = statues[0]; i < statues[statues.length - 1]; i++) {
           set.add(i);
       }

       for (int i =0; i < statues.length; i++) {
           set.remove(statues[i]);
       }

       for (int x : set) {
           //System.out.print(x + " ");
       }
       //System.out.println(set.size());
       // need to convert set size to int
        int result = set.size();
        System.out.println(result);

        }



    }

/*
what I want to do is find the max number in the array, then find out which
numbers equal to or less than that are missing.
 */
/*
The next thing i want to perhaps try is, generating the max number, and then
having it create an array of all the numbers less than max, and then compare the two
so it can tell me which statue sizes are needed.
 */

// the step I'm at I have an array of all the numbers up to the max, now I need to compare this to the original
// array and then get it to print out the number of elements that don't match

// then I need to work on the formatting for code signal