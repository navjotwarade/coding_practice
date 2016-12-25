package TemporaryPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jessieandcookie {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), k = sc.nextInt();
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for (int i = 0; i < n; i++) {
        pq.add(sc.nextInt());
    }
    sc.close();

    int s = 0;
    while (pq.size() >= 2) {
        if (pq.peek() >= k) {
            break;
        }
        s++;
        int t = 1 * pq.poll() + 2 * pq.poll();
        pq.add(t);
    }

    System.out.println(!pq.isEmpty() && pq.peek() >= k ? s : -1);
    }
}