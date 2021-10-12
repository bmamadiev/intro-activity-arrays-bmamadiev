public class Main {


    public static void main(String[] args) {
        /* To run this assignment, select Run --> Run 'Main" from the file menu at the top of IntelliJ IDEA */

        /***********************/
        /* Using Arrays        */
        /***********************/

        // Complete the Following Exercises.

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise One"); // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // Accessing an array
        // - First, Log the word "jumped" to the console by accessing it in the array.
        // - Second, Log the last word of the array to the console.
        // - Your code should output the following:
        //     jumped
        //     fence

        String[] sentence = {"The", "dog", "jumped", "over", "the", "fence"};
        // Write your code here 👇

        System.out.println(sentence[2]);
        System.out.println(sentence[5]);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Two");

        // Adding up Numbers
        // - Create a statement which adds up every number of the array, assigning
        //   the sum to a new variable.
        //   Then log the sum to the console.
        //
        //   You don't need to do anything fancy here, like loops or functions,
        //   just access every index of the array and add up the numbers in one big equation.
        // - Your code should output the following:
        //     28

        int[] numbers = {3, 4, 5, 7, 9};
        // Write your code here 👇

        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];

        System.out.println(sum);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Three");
        //  Creating an array
        // - Create a new array and initialize with the names of five different colors.
        //   The array should be assigned to a variable named "colors"
        // - Display the array to the console by calling: displayArray(colors);
        // - Then Log the length of the array to the console (it should print 5)
        // Write your code here 👇

        String[] colors = {"red", "blue", "purple", "white", "black"};

        displayArray(colors);
        System.out.println(colors.length);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Four");
        // Updating an array
        // - Add 5 names of people to the array.
        // - Log that array to the console.
        // - Using the index variable, assign the name "Albert" to the given index.
        // - Then display the modified array to the console using the call: displayArray(names);
        String[] names; // Don't modify this line.
        int index = 2;
        // Write your code here 👇

        names = new String[]{"Behzod", "Nico", "Claire", "Mike", "Chi"};
        displayArray(names);
        names[index] = "Albert";
        displayArray(names);

        // ----------------------------------------------------------------------------------------------
    }
    /*Do not change this code - start*/
    public static void displayArray (Object[] array) {
        Boolean init = true;
        System.out.print("{");
        for (Object i : array) {
            if (init) {
                init = false;
            }
            else {
                System.out.print(",");
            }
            System.out.print(i);
        }
        System.out.print("}");
        System.out.println();
    }
    /*Do not change this code - end*/

}
