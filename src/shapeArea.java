/*
Below we will define an n-interesting polygon. Your task is to find the area of the polygon for a
given n.
A 1-interesting polygon is just a square with a side of length 1.
An n-interesting polygon is obtained by taking the n-1 interesting polygon and appending 1-interesting
polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4- interesting polygons in the
picture below.

EXAMPLE
- For n = 2, the output should be solution(n) = 5;
- For n = 3, the output should be solution(n) = 13
 */

import java.util.Random;
import java.util.random.RandomGenerator;


public class shapeArea {
    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class
        int upperbound = 1000;
        int n = rand.nextInt(upperbound);
        System.out.println("n is: " +n );
        System.out.println("the area of a " + n + " sided polygon is: ");
        System.out.println(Math.pow(n-1, 2) + Math.pow(n, 2));
    }
}
