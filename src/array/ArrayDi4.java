package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2*3 2차원 배열을 만든다
        int[][] arr = new int[3][4];

        int i = 1;
        //순서대로 1씩 증가하는 값을 입력
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }
        //2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 헹이 끝나면 라인을 변경한다
        }
    }
}
