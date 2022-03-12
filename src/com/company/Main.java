package com.company;

import java.util.Scanner;
import java.util.Stack;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean res;
            boolean stat;
            for (int j = 0; j < 15; j++) {
                Stack<Character> stack = new Stack<>();
                System.out.println("Введите текст: ");
                stack.push(' ');
                String str = scan.nextLine();
                res = true;
                stat = true;
                for (int i = 0; i < str.length(); i++) {
                    switch (str.charAt(i)) {
                        case '(':
                        case '<':
                        case '[':
                        case '{':
                            stack.push(str.charAt(i));
                            break;
                        case ')':
                            if ((stack.peek() != '(') || stack.empty()) {
                                stat = false;
                                break;
                            } else stack.pop();
                            break;
                        case ']':
                            if ((stack.peek() != '[') || stack.empty()) {
                                stat = false;
                                break;
                            } else stack.pop();
                            break;
                        case '}':
                            if ((stack.peek() != '{') || stack.empty()) {
                                stat = false;
                                break;
                            } else stack.pop();
                            break;
                        case '>':
                            if ((stack.peek() != '<') || stack.empty()) {
                                stat = false;
                                break;
                            } else stack.pop();
                            break;
                    }
                    if (!stat) {
                        res = false;
                        break;
                    }
                }
                stack.pop();
                if (!stack.empty()) res = false;
                System.out.print(res + "\n");
            }
        }
    }



