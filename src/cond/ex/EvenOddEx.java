package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 6;
        String result = (x % 2 == 0) ? "even" : "odd";
        System.out.println("x = " + x + ", " + result);
    }
}
