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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
             
            
// Write your code here
int maxOfFirst=Integer.MIN_VALUE,minOfSecond=Integer.MAX_VALUE;
for(int i=0;i<a.size();i++)
{
    if(a.get(i)>maxOfFirst)
    maxOfFirst = a.get(i);
}
for(int i = 0;i<b.size();i++)
{
    if(b.get(i)<minOfSecond)
    minOfSecond = b.get(i);
}
int countMultiple = 0, countFactor = 0, countNum = 0;
while(maxOfFirst<=minOfSecond)
{
    for(int i=0;i<a.size();i++)
    {
        if(maxOfFirst%a.get(i)==0)
        countMultiple++;
        else
        continue;
    }
    if(countMultiple==a.size())
    {
        for(int i=0;i<b.size();i++)
        {
            if(b.get(i)%maxOfFirst==0)
            countFactor++;
            else
            continue;
        }
        if(countFactor==b.size())
        countNum++;
        else
        continue;

    }
    maxOfFirst++;
    countFactor = countMultiple = 0;

}
return countNum;
}
}



    



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
