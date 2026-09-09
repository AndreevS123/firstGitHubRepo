package org.example;
import java.util.ArrayList;
import java.util.Scanner;

class MyMath{
    public static int Gcd(int a, int b){
        if (a>b){
            a+=b;
            b = a-b;
            a-=b;
        }
        if (a==0) return b;
        return Gcd(b%a, a);
    }

    public static ArrayList<Integer> Factor(int x){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int d = 2; d*d<=x; ++d){
            if (x%d == 0){
                factors.add(d);
                while (x%d == 0){
                    x/=d;
                }
            }
        }
        return factors;
    }
}

public class Main {
    public static void main(String[] args) {
        CalculateGcd();
    }

    private static void CalculateGcd(){
        MyMath mm = new MyMath();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(mm.Gcd(a, b));
    }
}
