package loop.Ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 3;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
