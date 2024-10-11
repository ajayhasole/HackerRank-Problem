import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
    
             int l=arr.size();
             double c=0,c1=0,c2=0;
             double s=0,s1,s2;
             for(Integer ele:arr){
                 if(ele>0){
                     c++;
                 }
                 else if(ele<0){
                     c1++;
                     
                 }
                 else{
                     c2++;
                 }
             }
             s=c/l;
             s1=c1/l;
             s2=c2/l;
             System.out.println(s);
    System.out.println( s1);
    System.out.println(s2);


     }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
