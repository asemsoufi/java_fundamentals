package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 11: Nested for loop
 *
 *      Use a nested for loop to generate a multiplication table for numbers 1-10.
 *      The output should look something like this: (you don't need to worry about perfect alignment)
 *
 *      1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |
 *      2 |4 |6 |8 |10|12|14|16|18|20 |
 *      3 |6 |9 |12|15|18|21|24|27|30 |
 *      4 |8 |12|16|20|24|28|32|36|40 |
 *      5 |10|15|20|25|30|35|40|45|50 |
 *      6 |12|18|24|30|36|42|48|54|60 |
 *      7 |14|21|28|35|42|49|56|63|70 |
 *      8 |16|24|32|40|48|56|64|72|80 |
 *      9 |18|27|36|45|54|63|72|81|90 |
 *      10|20|30|40|50|60|70|80|90|100|
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j<= 10; j++){
                int currentMulti = i * j;
                // convert the current multiplication outcome to string to estimate its length
                // this is to determine if more space needs to be added to keep numbers aligned
                String currentString = Integer.toString(currentMulti);
                // if the outcome is made-up of one digit, OR two digits at the left-most side of the table
                // then add a space before the '|' to fill the second position and maintain alignment
                if((currentString.length() == 1) || (currentString.length() == 2 && j == 10)) {
                    System.out.print(currentMulti + " |");
                }
                // else, don't add an extra space before the '|'
                else{
                    System.out.print(currentMulti + "|");
                }
            }
            System.out.println();
        }

    }
}
