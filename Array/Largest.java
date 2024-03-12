package Array;
import java.util.*;

public class Largest{
    public static int Sum(int num[] ){
        int largest = Integer.MIN_VALUE;
        for(int i=1;i<num.length;i++){
            if (largest<num[i]) 
            {
             largest = num[i];   
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,3,5,7,8};
        System.out.print("largest element"+ Sum(num));
    }
}