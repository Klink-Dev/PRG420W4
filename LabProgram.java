import java.util.*;

public class LabProgram {
    public static void main(String[] args) {

/***************4.13 LAB: Output numbers in reverse
//Write a program that reads a list of integers and outputs those
// integers in reverse. The input begins with an integer indicating
// the number of integers that follow. For coding simplicity,
// follow each output integer by a comma, including the last one.
// Assume that the list will always contain fewer than 20 integers.
//
//Ex: If the input is:
//
//5 2 4 6 8 10
//the output is:
//
//10,8,6,4,2,
//To achieve the above, first read the integers into an array.
// Then output the array in reverse.

        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        numElements = scnr.nextInt();   // Input begins with number of integers that follow

        // Type your code here.
        for(int i = 0; i<numElements; i++){
            userList[i] = scnr.nextInt();
        }
        for(int i = numElements-1; i>=0; i--){
            System.out.print(userList[i]+",");
        }
        System.out.println();

        ****************************************/

/***********************************4.14 LAB: Middle item
//Given a sorted list of integers, output the middle integer.
// A negative number indicates the end of the input (the negative number
// is not a part of the sorted list). Assume the number of integers is
// always odd.
//
//Ex: If the input is:
//
//2 3 4 8 11 -1
//the output is:
//
//Middle item: 4
//The maximum number of list values for any test case should not exceed 9.
// If exceeded, output "Too many numbers".
//
//Hint: First read the data into an array. Then, based on the array's size,
// find the middle item.

                Scanner scnr = new Scanner(System.in);
                int[] userValues = new int[9];  // Set of data specified by the user

        // Type your code here.

        int i;
        for(i=0; i<= userValues.length; i++){
            int temp = scnr.nextInt();
            if (temp<0){
                System.out.println("Middle item: "+ (userValues[(i/2)]));
                break;
            } else if (i== userValues.length) {
                System.out.println("Too many numbers");
            } else{
                userValues[i] = temp;
            }

        }


        //*************************** ***************************/




/***********************4.15 LAB: Output values below an amount
//Write a program that first gets a list of integers from input.
// The input begins with an integer indicating the number of integers
// that follow. Then, get the last value from the input, which
// indicates a threshold. Output all integers less than or equal to
// that last threshold value. Assume that the list will always contain
// fewer than 20 integers.
//
//Ex: If the input is:
//
//5 50 60 140 200 75 100
//the output is:
//
//50,60,75,
//The 5 indicates that there are five integers in the list, namely
// 50, 60, 140, 200, and 75. The 100 indicates that the program should
// output all integers less than or equal to 100, so the program
// outputs 50, 60, and 75.
//
//For coding simplicity, follow every output value by a comma, including
// the last one.
//
//Such functionality is common on sites like Amazon, where a user can
// filter results.

        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input

        // Type your code here.

        int threshold;
        int ARRAY_LENGTH = scnr.nextInt();

        for(int i=0; i<ARRAY_LENGTH; i++){
            userValues[i] = scnr.nextInt();
        }
        threshold = scnr.nextInt();

        for (int i=0; i<ARRAY_LENGTH; i++){
            if (userValues[i]<threshold){
                System.out.print(userValues[i]+ ",");
            }
        }System.out.println();

**********************************************************/


/***********************4.16 LAB: Adjust list by normalizing
//When analyzing data sets, such as data for human heights or for human
// weights, a common step is to adjust the data. This adjustment can be
// done by normalizing to values between 0 and 1, or throwing away
// outliers.
//
//For this program, adjust the values by dividing all values by the
// largest value. The input begins with an integer indicating the number
// of floating-point values that follow. Assume that the list will
// always contain fewer than 20 floating-point values.
//
//Output each floating-point value with two digits after the decimal
// point, which can be achieved as follows:
//System.out.printf("%.2f", yourValue);
//
//Ex: If the input is:
//
//5 30.0 50.0 10.0 100.0 65.0
//the output is:
//
//0.30 0.50 0.10 1.00 0.65
//The 5 indicates that there are five floating-point values in the list,
// namely 30.0, 50.0, 10.0, 100.0, and 65.0. 100.0 is the largest value
// in the list, so each value is divided by 100.0.
//
//For coding simplicity, follow every output value by a space, including
// the last one.

        Scanner input = new Scanner(System.in);

        int arrlen = input.nextInt();
        double[] arr = new double[arrlen];
        double largest = arr[0];

        for (int i=0; i<arrlen; i++){
            arr[i] = input.nextDouble();
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for (int i=0; i<arrlen; i++){
            System.out.printf("%-5.2f", (arr[i]/=largest));
        }System.out.println();

//**********************************************************/

/*******************************4.17 LAB: Word frequencies
//Write a program that reads a list of words. Then, the program outputs those
// words and their frequencies. The input begins with an integer indicating the
// number of words that follow. Assume that the list will always contain fewer
// than 20 words.
//
//Ex: If the input is:
//
//5 hey hi Mark hi mark
//the output is:
//
//hey - 1
//hi - 2
//Mark - 1
//hi - 2
//mark - 1
//Hint: Use two arrays, one array for the strings and one array
// for the frequencies.


        Scanner input = new Scanner(System.in);
        int arrlen = input.nextInt();
        String[] words = new String[arrlen];
        int[] freq = new int[arrlen];

        for (int i=0; i<arrlen; i++){
            words[i] = input.next();
        }

        for (int i=0; i<arrlen; i++){
            freq[i] = 0;

            for(int j=0; j<arrlen; j++){
                if(words[i].equals(words[j])){
                    freq[i]++;
                }
            }
            System.out.println(words[i]+ " - " +freq[i]);
        }


 //**********************************************************/

//4.18 LAB: Contains the character
//Write a program that reads an integer, a list of words, and a character.
// The integer signifies how many words are in the list.
// The output of the program is every word in the list that contains
//      the character at least once.
// For coding simplicity, follow each output word by a comma,even the last one.
// Add a newline to the end of the last output.
// Assume at least one word in the list will contain the given character.
// Assume that the list of words will always contain fewer than 20 words.
//
//Ex: If the input is:
//
//4 hello zoo sleep drizzle z
//then the output is:
//
//zoo,drizzle,
//To achieve the above, first read the list into an array.
// Keep in mind that the character 'a' is not equal to the character 'A'.


        Scanner input = new Scanner(System.in);
        int arrlen = input.nextInt();
        String[] words = new String[arrlen];

        for(int i=0; i<arrlen; i++){
            words[i] = input.next();
        }

        char x = input.next().charAt(0);
        for(int i=0; i<arrlen; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    System.out.print(words[i]+",");
                    break;
                }
            }
        }
        System.out.println();



    }
}
