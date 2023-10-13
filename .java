import java.util.Arrays;
import java.util.Random;//gives random
//Generate a list (array) of 32 random numbers. As usual, print the list, find the
//sum, average, largest and smallest number. Display these with appropriate labels.
//Also display the sorted list. Note: many languages have built in sort, max, and
//min functions and more. Check out Java to see which ones exist and will save you
//work.
public class Main {
public static void main(String[] args) {
// make list of random numbers
int[] num = new int[32];//array of 32
Random random = new Random();
for (int i = 0; i < num.length; i++) //give an array of 32 from random numbers
between 0 and 100
{
num[i] = random.nextInt(100); // numbers between 0 and 100
}
// print list
System.out.println("List of random numbers: " + Arrays.toString(num));
// calculate the sum
int sum = 0;
for (int i = 0; i < num.length; i++)//int i : num)
{
sum += i;
}
System.out.println("Sum: " + sum);//print sum
// calculate average
int avg = sum / num.length;
System.out.println("Average: " + avg);
//the largest number
int largest = num[0];
for (int i = 1; i < num.length; i++)
{
if (num[i] > largest)
{
largest = num[i];
}
}
System.out.println("Largest number: " + largest);
// smallest number
int smallest = num[0];
for (int i = 1; i < num.length; i++)
{
if (num[i] < smallest)
{
smallest = num[i];
}
}
System.out.println("Smallest number: " + smallest);
// Sort the list
Arrays.sort(num);
System.out.println("Sorted list: " + Arrays.toString(num));
}
}
