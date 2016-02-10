import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Nikhil on 1/1/2016.
 */
public class Day1DataTypes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        boolean b = true;
        double d = 0.00;
        String string = "a,b,c,d";
        String Array[]= new String [100];
        /*5.35
        'a'
        false
        100
        "I am a code monkey"
        true
        17.3
        'c'
        "derp"*/
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : int");
        System.out.println("Reference : String");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Reference : String");
        /*do{
            try {
                String temp = sc.nextLine();
                int i = 0;
                double d = 0.00;
                char c= '\n';
                i=Integer.parseInt(temp);
                d=Double.parseDouble(temp);
                c=Character


                if(i!=0) System.out.println("Primitive : int");
                if(d!=0.00) System.out.println("Primitive : double");


            }catch(Exception e){
                throw e;
            }

        }while(true);*/



    }
}

/*
Problem Statement :
Problem Statement

Welcome to Day 1! Check out the video tutorial here, or just jump right into the problem.

Let's talk about data types. In programming, a data type is a classification of types of data that determine the possible values and operations on that particular type.

Some typical examples of data types are:

int
double
boolean
char
String
Array
Remember, in languages like Java data types (like the ones above) can be classified into two main groups:

Primitive Types
Reference Types
For this challenge, consider the following inputs (you don't need to read any input):

5.35
'a'
false
100
"I am a code monkey"
true
17.3
'c'
"derp"
For each line above, print out if it is an instance of a primitive or referenced type as well as which data type it is (using the typical examples above).

Good luck!

Hint: In Java, String is a referenced type.

Output Format

Output nine lines. Print one line for each of the input given above in the following format:

MainDataTypeOfInstance : SpecificDataTypeOfInstance
For example, if the input is:

123
Your output should be:

Primitive : int
Make sure you spell everything correctly and capitalize your entries. Also, don't forget spaces and colon in between the main and specific data types!
 */