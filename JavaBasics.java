import java.util.Arrays;

// Creation of the "JavaBasics" javadoc
/**
 * <p>This method is an exercise that make us see and use the very basics of Java</p>
 * <p>I hope all wil be as intended :)</p>
 * @version 1.0
 * @author Noé GUENGANT
 */
// Creation of the "JavaBasics" class
public class JavaBasics {
    /* name  : GUENGANT Noé
    *  group : ERASMUS
    *  code  : 20234703 */
    public static void main(String[] arg){
        // Creating n and m and setting them to the desired length
        String name = "noe", familyName = "guengant";
        int n = name.length();
        int m = familyName.length();
        // Creation of matrix with n as rows and m as columns
        int[][] matrix = new int[n][m];
        // Creation of two arrays to compare
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] nameAsArray = name.split("(?!^)");
        int a = 0;
        // Calculation of a by splitting the name as an array and double looping on it
        for (String s : nameAsArray) {
            for (String vowel : vowels) {
                if (vowel.equals(s)) {
                    a += 1;
                }
            }
        }
        int b = n + m;
        // Filling the 2D array with random numbers
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * (b - a + 1) + a);
            }
        }
        System.out.println("Whole matrix with headings for indexes :");
        // Creating the headings using StringBuilder and \t to align everything
        StringBuilder headings = new StringBuilder("\t");
        for (int i = 0; i < m; i++){
            headings.append(i).append("\t");
        }
        System.out.println(headings);
        headings = new StringBuilder();
        // After some tries the line below was what had the best render
        headings.append("--".repeat((int)(m*2.2)));
        System.out.println(headings);
        // Printing all the arrays, in row, with the index of the first array as indicator
        for (int i = 0; i < matrix.length; i++){
            StringBuilder row = new StringBuilder(i+"|");
            for (int j = 0; j < matrix[i].length; j++){
                row.append("\t").append(matrix[i][j]);
            }
            System.out.println(row);
        }
        // Now making the two arrays for EX 5
        float[] averageRows = new float [n];
        float[] averageColumns = new float [m];
        // Calculus for the rows
        for (int i = 0; i < matrix.length; i++) {
            float sumAverage = 0.0F;
            for (int j = 0; j < matrix[i].length; j++) {
                sumAverage += matrix[i][j];
            }
            averageRows[i] = (float) (Math.round((sumAverage/m)*10000.0)/10000.0); // 10000.0 allows 4 digits precision
        }
        for (int j = 0; j < m; j++) {
            float sumAverage = 0.0F;
            for (int[] ints : matrix) {
                sumAverage += ints[j];
            }
            averageColumns[j] = (float) (Math.round((sumAverage/n)*10000.0)/10000.0);
        }
        System.out.print("\n\n"); // I will often do this to add readability to the output
        System.out.println("Average of elements inside the tab per row :");
        System.out.println(Arrays.toString(averageRows));
        System.out.println("Average of elements inside the tab per columns :");
        System.out.println(Arrays.toString(averageColumns));
        // Making two more arrays for EX 6
        int[] aboveAverageRows = new int [n];
        int[] aboveAverageColumns = new int [m];
        // Calculating for the rows
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j]>averageRows[i]){
                    aboveAverageRows[i] += 1;
                }
            }
        }
        // Calculating for the columns (so swapping the loops)
        for (int j = 0; j < m; j++){
            for (int i = 0; i < n; i++){
                if (matrix[i][j]>averageColumns[j]){
                    aboveAverageColumns[j] += 1;
                }
            }
        }
        System.out.print("\n\n");
        System.out.println("Above average elements inside the tab per row :");
        System.out.println(Arrays.toString(aboveAverageRows));
        System.out.println("Above average elements inside the tab per columns :");
        System.out.println(Arrays.toString(aboveAverageColumns));

        // Let's go to exercise 6
        int maxValue = -1; // Because the value is negative it will be replaced the first iteration
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (i != a+1 && j != a+1){ // The +1 is mandatory because the index start at 0
                    if (matrix[i][j] > maxValue){
                        maxValue = matrix[i][j];
                    }
                }
            }
        }
        System.out.print("\n\n");
        System.out.println("Maximum value inside the 2D array excluding those on columns/rows " + a + " :\n"
                + maxValue);

        // For exercise 7 we just use a classic .sort() on a copy with a loop
        for (int[] ints : matrix) {
            Arrays.sort(ints);
        }
        System.out.print("\n\n");
        System.out.println("2D array sorted by rows :");
        System.out.println(Arrays.deepToString(matrix));

        // Exercise 8
        float minValue = b + 1; // To be sure that any value will be less than the initialisation
        int minValueIndex = 0; // To store the index of that value
        for (int i = 0; i < averageColumns.length; i++){
            if (averageColumns[i] < minValue){
                minValue = averageColumns[i];
                minValueIndex = i;
            }
        }
        // Now we seek the minimum value of the column we found
        minValue = b + 1; // Once again we take b+1 to ensure that an inferior value will be found
        for (int j = 0; j < n; j++){
            if (matrix[j][minValueIndex] < minValue){
                minValue = matrix[j][minValueIndex];
            }
        }
        System.out.print("\n\n");
        System.out.println("Minimum value of the column with the smallest average :\n" + (int) minValue);
        // Conversion to int because all the values are integers and there is no point of printing x.0 each time
    }
}

