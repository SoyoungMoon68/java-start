package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntDver = 2147483648L; //int 최고값 +1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntDver;
        System.out.println("maxIntDver casting= " + intValue);
    }
}
