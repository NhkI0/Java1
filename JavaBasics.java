import java.util.Arrays;

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
            averageRows[i] = (float) (Math.round((sumAverage/m)*10000.0)/10000.0);
        }
        for (int j = 0; j < m; j++) {
            float sumAverage = 0.0F;
            for (int[] ints : matrix) {
                sumAverage += ints[j];
            }
            averageColumns[j] = (float) (Math.round((sumAverage/n)*10000.0)/10000.0);
        }
        System.out.println(Arrays.toString(averageRows));
        System.out.println(Arrays.toString(averageColumns));
    }
}

