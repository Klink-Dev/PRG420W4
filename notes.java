import java.util.*;

public class notes {

    public static void main(String[] args){




        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int product = 1;
        double average = 0.0;
        int[] numbersCubed = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            product *= numbers[i];
            numbersCubed[i] = numbers[i]*numbers[i]*numbers[i];
            System.out.println(numbers[i] + " cubed is "+ numbersCubed[i]);
        }

        System.out.println("The sum of the array is " + sum);
        System.out.println("The product of the array is " + product);
        System.out.println("The average of the array is " + average);






System.out.println("\n\n\n\n");
/*
*
*Respond to the following in a minimum of 175 words:

Loops are used frequently in coordination with arrays.
Discuss with 2 examples the advantages of using loops with arrays.
*/
        /**

Hello Class,

Arrays are an excellent way to store a collection of similar data as independent elements, and since the elements are accessed using a sequential set of integers, it makes sense to use a loop iterated with a sequential set of integers in coordination with arrays. In Java, all elements in an array must be of the same datatype, and strings are simply an array of characters so loops can also coordinate well with strings too. A common way to use loops with arrays is to loop a predetermined number of times based on how many elements are in the array, then perform a repeatable task, like changing or outputting each element in the array. Since the number of iterations is known, I prefer to use FOR loops to iterate through arrays.
In my first example, I create an integer array with a length of 10, meaning that it has indexes of 0 through 9, since the length is known, you can easily use a for loop with the condition that the iteration variable be less than the length of the array. Then in each iteration I use the iteration variable to reference the index of the array, and set the element equal to the index multiplied by itself and output to the screen:

        int[] y = new int[10];
        for (int i = 0; i<y.length; i++) {
            y[i] = i*i;
            System.out.println(i + " Squared is: " +y[i]);
        }
        /**
My second example is a little more complex, but I think it can further display the advantages of using loops with arrays. I start with an array of strings, and each string is an array of characters, so it is an array of arrays. I use a FOR loop to manipulate each index of the array "words", and a nested FOR loop to manipulate each "letter" in each "word". I iterate through "words" incrementally, and iterate through each "word" decrementally, to output the string of "letters" in reverse:

        String[] words = {"BATS", "DEVIL","KNITS", "GULP", "TACOCAT", "SWAP", "STOP", "KAYAK", "STRESSED"};
        for (int word = 0; word<words.length; word++) {
            System.out.print(words[word] + " spelled backwards is ");
            for (int letter = words[word].length()-1; letter>=0; letter--){
                System.out.print(words[word].charAt(letter));
            }
            System.out.println();
        }


*/











    }
}
