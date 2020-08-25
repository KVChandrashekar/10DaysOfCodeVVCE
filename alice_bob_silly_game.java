import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    static int start(int follow){
        int primes = 0;
        boolean[] catch_ = new boolean[follow+1];
        for (int x = 2; x <= follow; x++){
            if (catch_[x] == false){
                primes++;
                for (int i = x; i <= follow; i += x){
                    catch_[i] = true;
                    }
                }
            }
        return primes;
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            if(start(n) % 2 == 0)
                System.out.println("Bob");
            else
                System.out.println("Alice"); 
        }
    }
}