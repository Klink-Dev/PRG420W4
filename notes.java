import java.util.Scanner;

public class notes {

    public static void main(String[] args){

/*
*
*Respond to the following in a minimum of 175 words:

Loops are used frequently in coordination with arrays.
Discuss with 2 examples the advantages of using loops with arrays.
*

Hello Class,

Arrays are an excellent way to store a collection of similar data as independent elements, and since the elements are accessed using a sequential set of integers, it makes sense to use a loop iterated with a sequential set of integers in coordination with arrays. In Java, all elements in an array must be of the same datatype, and strings are simply an array of characters so loops can also coordinate well with strings too. A common way to use loops with arrays is to loop a predetermined number of times based on how many elements are in the array, then perform a repeatable task, like changing or outputting each element in the array. Since the number of iterations is known, I prefer to use FOR loops to iterate through arrays.
* In my first example, I create an integer array with a length of 10, meaning that it has indexes of 0 through 9, since the length is known, you can easily use a for loop with the condition that the iteration variable be less than the length of the array. Then in each iteration I use the iteration variable to reference the index of the array, and set the element equal to the index multiplied by itself and output to the screen:

        Scanner input = new Scanner(System.in);
        int[] y = new int[10];
        for (int i = 0; i<y.length; i++) {
            y[i] = i*i;
            System.out.println(i + " Squared is: " +y[i]);
        }
        *
My seceond example is a little more complex, but I think it can further display the advantages of using loops with arrays. I start with an array of strings, and each string is an array of characters, so it is an array of arrays. I use a FOR loop to manipulate each index of the array "z", and a nested FOR loop to manipulate each character in the array. I iterate through "z" incrementally, and iterate through each string decrementally, to output the word in reverse:
*
        String[] words = {"BATS", "DEVIL","KNITS", "GULP", "SWAP", "STOP", "STRESSED"};
        for (int word = 0; word<words.length; word++) {
            System.out.print(words[word] + " spelled backwards is ");
            for (int letter = words[word].length()-1; letter>=0; letter--){
                System.out.print(words[word].charAt(letter));
            }
            System.out.println();
        }


*/

        Scanner input = new Scanner(System.in);
        int[] y = new int[10];
        for (int i = 0; i<y.length; i++) {
            y[i] = i*i;
            System.out.println(i + " Squared is: " +y[i]);
        }
        System.out.println();

  //outputting user input in reverse, treating a string as an array:
//        String[] z = {"BATS", "DEVIL","KNITS", "GULP", "SWAP", "STOP", "STRESSED"};
//        for (int i = 0; i<z.length; i++) {
//            System.out.print(z[i] + " spelled backwards is ");
//            for (int j = z[i].length()-1; j>=0; j--){
//                System.out.print(z[i].charAt(j));
//            }
//            System.out.println();
//        }


        String[] words = {"BATS", "DEVIL","KNITS", "GULP", "SWAP", "STOP", "STRESSED"};
        for (int word = 0; word<words.length; word++) {
            System.out.print(words[word] + " spelled backwards is ");
            for (int letter = words[word].length()-1; letter>=0; letter--){
                System.out.print(words[word].charAt(letter));
            }
            System.out.println();
        }



//        String x = input.nextLine();
//        for(int i = x.length()-1; i >= 0; i--){
//            System.out.print(x.charAt(i));
//        }

        /*


* */







    }
}
