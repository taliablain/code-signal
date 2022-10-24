/*
Given an array of integers, find the pair of adjacent elements that has the largest product
and return that prodyct.
 */





import java.util.stream.IntStream;

public class adjacentElementsProduct {
    public static void main(String[] args) {
        // declaring the input array
        int[] inputArray = new int[] {3, 6, -2, -5, 7, 3};
        // printing out solution as cannot return value in main class that is void
         System.out.println(IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt());
        }
    }

/*
IntStream - Java IntStream class is a specialization of Stream interface for int primitive. It
represents a stream of primitive int-values elements supporting sequential and parallel operations
IntStream is part of the java.util.stream package and implements AutoCloseable and BaseStream
interfaces.
IntStream of(int... values) - Returns stream containing specified all elements
IntStream.of(1, 2, 3); - // 1, 2, 3
The IntStream produced by range() methods is a sequential ordered stream of int values which is
the equivalent of increasing int values in a for-loop and value incremented by 1.
- range(int start, int end) - returns a sequential ordered int stream from startInclusive(inclusive)
to endExclusive(exclusive) by an incremental step of 1.
IntStream.range(1, 5); // 1,2,3,4

 */

/*
The map() function is a method in the Stream class that represents a functional programming concept.
In simple words, the map() is used to transform one object into another by applying a function.
In this case, I think it maps each element in the array to the product of itself and the next element in
the array.
.max is then used to get the maximum value of this.
 */

/*
The getAsInt() method returns value if a value is present in OptionalInt object, otherwise throws
NoSuchElementException.
Without this part of the program, the printed out value is OptionalInt[21], so we need this to
extract the value.
 */