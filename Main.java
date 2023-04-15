import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

//7.1 Coding practice problems overview
//Why use Coding Practice Problems?
//Research shows that repeated practice moves knowledge into the long-term region
// of the brain, making tasks easier (compare the ease of driving now vs. when
// you first learned) and enabling new learning on top of that knowledge.
//
//This material is designed for students to practice the most fundamental programming
// concepts via short coding problems. The auto-grading provides immediate feedback
// of correctness, so students can instantly find/fix bugs.
//
//Many problems were adapted from exam questions at various universities, so
// practicing may improve exam performance. Problems focus on core skills, so
// practicing may improve a student's ability to efficiently complete programming
// assignments. Students preparing for job interviews may also find the practice
// helps them answer common interview coding questions.
//
//Hints and solutions
//Many problems includes hints at the bottom of the specification.
// Students are encouraged to NOT read those hints initially.
// If stuck on a problem, students might read just the NEXT hint, not all the hints.
// Trying to figure out how to solve the problems is working your brain in the
// necessary ways; reading how someone else solved the problem is a different skill.
// It's like trying to solve a riddle versus being told the answer to a riddle.
//
//Each problem includes a solution by an experienced programmer.
// Programming is like an essay answering a question:
// Numerous correct answers exist.
// Comparing your solution to experienced programmer may yield insights.
// As with hints, students are encouraged NOT to view the solution until done,
// or if stuck.
//
//Most solutions have ending comments that describe key decisions, common issues, etc.
//
//Difficulty and time
//An estimate of each problem's difficulty is indicated using asterisks in the
// problem's title (*, **, or ***). These are based on a person who is just learning
// that topic. Ex: When learning branches, a problem may be of medium difficulty and
// thus have two asterisks, but by the time a student has learned loops, that
// branching problem may be easy.
//
//Each problem is estimated to take between 5 minutes (one asterisk) to perhaps 20
// minutes (three asterisks) for a student. Sometimes a problem will take longer,
// especially in the presence of bugs. That is perfectly normal. Just remember,
// every time you get stuck on a programming problem, you become a slightly stronger
// programmer. It's like lifting weights: Hurts, but strengthens.
//
//Now start practicing!
//Below is an example problem, with hints, results from automated grading of a
// student's, and the solution (with explanation notes) that a student can view at
// any time. The student's submission is close, but is failing some tests; from
// those test cases, the student realizes he/she isn't handling exclamation points
// correctly, so goes back and fixes his/her submission and submits again (as many
// times as desired).
//
//Example problem, to get you warmed up
//Given an input integer, output two times that integer. End with newline.
// (NOTE: Nearly every problem expects the student to follow the good practice of
// always ending output with a newline, so the newline won't be explicitly stated).
// Do not prompt the user to enter the integer; just read the integer.
// Ex: If the input is 3, the output should be 6.
//
//HINTS:
//
//A series of hints would normally appear here.
// This problem is very simple so not many hints appear, and they are very basic.
//
//Read the integer into a variable using the Scanner variable scnr, as in:
// userInt = scnr.nextInt(); Then, use System.out.println() to output 2 times
// that integer and end the output with a newline.
//
//When using "Develop" mode, remember to pre-enter the needed input values.
// Otherwise you may get weird behavior when running.

/*        Scanner scnr = new Scanner(System.in);

        // Type your code here.
        System.out.println(scnr.nextInt()*2);
*/

//7.2 PRACTICE: Expressions*: Simple floating-point expression
//Write an assignment statement for the following mathematical
// equation:
//
//y = (1/3)x + (x/4) + 2x
//
//Keep x as an integer. Use an expression that matches the equation's
// right side as closely as possible. If the input is -1,
// the output is -2.583333333333333.
//
//Hints:
//
//Don't rearrange the equation or try to simplify it.
//
//If both operands of division (or other operators) are integers,
// integer division is performed, which rounds down; so for example
// 1/2 is 0. So make at least one operand a floating-point type,
// as in 1.0/2, or 1.0/2.0, to cause floating-point division.


 /*       Scanner scnr = new Scanner(System.in);
        int x;
        double y;

        x = scnr.nextInt();

        // Type your code here.
        y =  (1.0/3.0)*x + (x/4.0) + (2.0*x);
        // end answer

        System.out.println(y);
*/

//7.3 PRACTICE: Expressions*: Distance formula
//Map/GPS applications commonly compute the distance between two points.
// A point may be a coordinate on an x-y plane like 1.5 2.0.
// The distance formula is d = √((x2 - x1)2 + (y2-y1)2)
// (basically, Pythagorean's Theorem).
// Given two points, output the distance between them.
// If the input is 1.5 2.0 4.5 6.0, the output is 5.
//
//Hints:
//
//Add import java.lang.Math; and then use the sqrt() method.
// For squaring, you might use the pow() method with a second parameter of 2.

/*
        Scanner scnr = new Scanner(System.in);

        //* Type your code here.

        double x1, x2, y1, y2, d;

        x1 = scnr.nextDouble();
        y1 = scnr.nextDouble();
        x2 = scnr.nextDouble();
        y2 = scnr.nextDouble();

        d=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));

        System.out.println(d);
*/


//7.4 PRACTICE: Branches**: Complex cost structure
//An airline describes airfare as follows.
    // A normal ticket's base
    // cost is $300.
    // Persons aged 60 or over have a base cost of $290.
    // Children 2 or under have $0 base cost.
    // A carry-on bag costs $10.
    // A first checked bag is free,
        // second is $25,
        // and each additional is $50.
    // Given inputs of age,
        // carry-on (0 or 1),
        // and checked bags (0 or greater),
        //  compute the total airfare.
//
//Hints:
//
//First use an if-else statements to assign airFare with
// the base cost
//
//Use another if statement to update airFare for a carryOn
//
//Finally, use another if-else statement to update airFare
// for checked bags
//
//Think carefully about what expression correctly calculates
// checked bag cost when bags are 3 or more







        Scanner scnr = new Scanner(System.in);
        int passengerAge;
        int carryOns;
        int checkedBags;
        int airFare;

        passengerAge = scnr.nextInt();
        carryOns = scnr.nextInt();
        checkedBags = scnr.nextInt();

        /* Type your code here. */

        System.out.println(airFare);












    }
}
