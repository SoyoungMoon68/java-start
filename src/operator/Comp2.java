package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = "String2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("String1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); //문자열 변수 비교
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
