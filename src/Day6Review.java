import java.util.Scanner;

/**
 * Created by Nikhil on 1/15/2016.
 */
public class Day6Review {
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();
        char a = '#';

        //try 1
        /*for(int i=0;i<n;i++){
            System.out.format("%"+(--n)+"s%n",new String(new char[i]).replace("\0","#"));
        }*/

        //revision test
        //long b = 123456;
        //System.out.printf("%10d",b);

        //final
        for(int i=0;i<n;i++){
            for(int k=i;k<n-1;k++)
                System.out.print(" ");

            for(int j=0;j<=i;j++){
                System.out.print("#");
            }
            System.out.println(" ");
        }

    }
}

/*
Welcome to Day 6! Review everything we've learned so far by making a MadLibs program in this video, or just jump right into the problem.

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?
Note: The last line has zero spaces before it.

Good luck!

Constraints
1≤N≤100
Input Format

You are given an integer N depicting the height of the staircase.

Output Format

Print a staircase of height N that consists of # symbols and spaces as given in Sample Output.

Sample Input

6

Sample Output

     #
    ##
   ###
  ####
 #####
######
 */