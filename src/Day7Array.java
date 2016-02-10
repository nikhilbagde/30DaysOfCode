import java.util.Scanner;

/**
 * Created by Nikhil on 1/15/2016.
 */
public class Day7Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalElement = sc.nextInt();
        int [] array = new int[totalElement];

        for(int i = 0; i<totalElement ; i++){
            array[i] = sc.nextInt();
        }
        for (int i=array.length-1 ; i>=0 ; i--){
            System.out.print(array[i] + ",");
        }
    }
}
