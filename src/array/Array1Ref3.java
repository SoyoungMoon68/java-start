package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int [] students = new int[] {90,80, 70, 60, 50}; //    배열 생성과 초기화, 라인 나누면 안되

        System.out.println(students);

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { //students.length - 현재 배열의 길이
            System.out.println("학생" + (i + 1) + "점수: " + students[i]); //(i +1) 괄호 주의
        }
    }
}
