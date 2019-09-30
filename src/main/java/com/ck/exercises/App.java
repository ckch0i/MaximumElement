package com.ck.exercises;

import java.util.Scanner;
import java.util.Stack;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        for (int i = 0; i < N; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int item = sc.nextInt();
                    stack.push(item);
                    if (item > maxStack.peek() || maxStack.empty()) {
                        maxStack.push(item);
                    } else {
                        maxStack.push(maxStack.peek());
                    }
                    break;
                case 2:
                    stack.pop();
                    maxStack.pop();
                    if (maxStack.size() > 2) {
                        maxStack.remove(0);
                    }
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
            }
        }

    }
}
