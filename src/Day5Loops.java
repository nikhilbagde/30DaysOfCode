import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Nikhil on 1/15/2016.
 */
public class Day5Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int j=0; j<T; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            int sum=0;
            for( int i =0; i<N; i++){
                //sum = (int) (sum + (a + (Math.pow(2,i)*b)));
                if(i==0){
                    sum = (int)(a + (Math.pow(2,i)*b));
                }else{
                    sum = (int) (sum + (Math.pow(2,i)*b));
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
