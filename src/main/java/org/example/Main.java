package org.example;

import java.util.Scanner;

public class Main {
    public static int birthday(int[] s, int d, int m) {
        int count = 0;
        for (int i = 0; i <= s.length - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(birthday(s, d, m));
    }
}
