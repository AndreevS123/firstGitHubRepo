package org.example;
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

    public static boolean IsPrime(int x){
        for(int d=2; d*d<=x; ++d){
            if (x%d == 0) return false;
        }
        return true;
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
