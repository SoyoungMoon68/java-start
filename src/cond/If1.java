package cond;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자 나이

        if (age >= 18) {
            System.out.println("성입입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
