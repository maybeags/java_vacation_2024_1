package chapter12_arrays;

import java.util.Arrays;

public class ArrayTest07 {
    public static void main(String[] args) {
        // 빈 배열 하나 선언
        int[][] numbers = new int[5][5];
        int num = 0;

        // 1부터 25까지의 숫자를 numbers 배열에 순서대로 값을 넣으시오.

        /*
            [
                [1,2,3,4,5],
                [6,7,8,9,10],
                [11,12,13,14,15],
                [16,17,18,19,20],
                [21,22,23,24,25]
            ]

            위에 입력을 다 하신 분들은
            System.out.println(Arrays.deepToString(names))를 통해서
            제대로 값이 입력 됐는지 확인하시구요.

            각 요소들을 출력할 때
            1 2 3 4 5
            6 7 8 9 10
            11 12 13 14 15
            16 17 18 19 20
            21 22 23 24 25
         */
        // element 입력
        for(int i = 0 ; i < numbers.length ; i++) {
            //저희가 2차배열을 선언했기 때문에 이 상태에서 바로 element 대입이 불가능
            for(int j = 0 ; j < numbers[i].length ; j++) {
                numbers[i][j] = ++num;
            }
        }
        /*
            향상된 for문의 주의할 점 :
                향상된 for문은 기본적으로 배열의 요소를 '읽기'만 할 수 있고,
                '배열의 인덱스 접근 및 수정'에서는 사용 불가합니다.

            특히 이상의 과제의 경우에는
            직접적으로 인덱스 넘버를 사용해서 정해진 위치에 정해진 값을 대입해야 하기 때문에
            인덱스를 명시할 수 없는 향상된 for문을 사용할 수 없습니다.
         */
        System.out.println(Arrays.deepToString(numbers));

        // 일반 2중 for문으로 출력
        for(int i = 0 ; i < numbers.length ; i++) {
            for (int j = 0 ; j < numbers[i].length ; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // 향상된 2중 for문으로 출력
        // 배열 내의 배열로 들어가기 위한 반복문
        for( int[] row : numbers ) {     // row : 행(가로줄)     // column : 열(세로줄)
            // 2배열 내로 들어가기 위한 반복문
            // 실행문1 영역
            for ( int number : row ) {
                // 실행문2 영역
                System.out.print(number + " ");
            }
            // 실행문3 영역
            System.out.println();
        }


    }
}
