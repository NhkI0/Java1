# Programming tecnologies

# „The basics of Java “

**The aim of the work** is to get acquainted with the basic syntax of Java programming language and to be able to apply it for simple calculations.

## Workflow and tasks:

1. Create a class (name JavaBasics) with the main () method.

2. Write a multi-line comment in the class file code that includes your name, group, and student book number. Before each task, write a one-line comment with a brief explanation. Write a javadoc comment that will introduce what your class is about. [1.25 points]<br>
  
3. In the main () method define a two-dimensional array of type int, which consists of n rows and m columns. The values of n and m are determined by the number of letters in your name (n) and surname (m). For example, in the case of Jūratė Janutėnaitė, n = 6, m = 11. Note: calculations for n and m must be automated, no manual calculation. [1.25 points]<br>
  
4. Fill the array with random numbers from a to b. a is the number of vowels in your name, and b is the total number of characters in your name and surname. For example, in the case of Jūratė Janutėnaitė a = 3, and b = 17. Loops and random number generation tools must be used to fill the array. Print the generated array on the screen, in the form of a table (arranged in rows and columns, with headings for each column and row, for index display). [1.25 points]<br>
  
5. Create two one-dimensional arrays, where one would store the averages of all rows and the other - the averages of columns. Display one array and then another array. Accuracy - 4 decimal places [1.25 points]<br>
   
6.  Calculate and display the number of values in each line that are greater than the average for that line. Note: Implement proper loop control [1.25 points]<br>
   
7. Find and print the maximum value of the 2D array, excluding the values in row a and column a (a value from task 4). [1.25 points]<br>
   
8. Print the values of a row of a two-dimensional array, arranged from the smallest to the largest, but without changing the two-dimensional array itself (a value from task 4). [1.25 points]<br>
   
9. Find the index of the minimum value from the column average values array. Display the minimum value of the two dimentional array from the i-th column (i found from average column array)[1.25 points]<br>
  
10. Upload the created .java file to 1st laboratory work in the Moodle system.<br>



**Supplementary Material:**

The System.out.print command is used to display text or data on the screen, which will output the specified text.System.out.println ("Text") will additionally add a newline character at the end of the text. You can combine multiple texts or text and the value of a variable, e.g. System.out.print ("Hello, +" world! ") Will return a single text," Hello, world! ". Meanwhile, if the variable int a = 5 is available, executing the System.out.print command ("Answer:" + a) will print the text "Answer: 5". Use a nice table display \ t. Random numbers can be generated in several ways:
* Math.random () generates a floating point number from 0 to 1. Since this is not an int type number, it should be converted to int.
* After creating a Random type object (Random rand = new Random ();), it is possible to call the randomnumber generation function rand.nextInt (max) through this object, where max is the maximum value-1and the minimum values would be 0.
