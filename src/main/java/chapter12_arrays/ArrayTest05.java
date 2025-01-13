package chapter12_arrays;

import java.util.Arrays;

/*
    다차원 배열(Multi Dimensional Array) 중 2차원 배열

    다차원 배열은 2차원 이상의 배열을 의미하지만, 개발 환경 상 2차원 배열 이상을 사용하는 경우는
    극히 드물기 때문에 2차원 배열을 기준으로 강의합니다.

    형식 :

    int[][] arr1 = new int[크기][크기]                   - 선언 방식 1
    int[][] arr2 = new int[크기][]                      - 선언 방식 2
    int[][] arr3 = { {1, 2}, {3, 4}, {5, 6} }           - 선언 방식 3

    2차원 배열 선언 시, 열의 크기는 지정하지 않아도 되지만, 행의 크기는 항상 지정해야 합니다.
        -> 2번 방식 참조
     1열 2열
      ↓  ↓
    ( 1, 2 )    -> 가로줄 : 행 - 1행
    ( 3, 4 )                  - 2행
    ( 5, 6 )                  - 3행
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        int[][] arr1 = { {1, 2}, {3, 4}, {5, 6} };      // -> 즉 arr1의 크기는 int[3][2]
        // 일차배열기준      0       1       2
//        System.out.println(arr1);               // 참조 자료형이기 때문에 주소값만 출력
//        System.out.println(arr1[0]);
//        System.out.println(arr1[0][0]);
//
//        // 4를 추출해보세요.
//        System.out.println(arr1[1][1]);
//        // 5를 추출해보세요.
//        System.out.println(arr1[2][0]);

        // 배열의 각 요소를 추출하는 반복문을 작성하시오.   -> 1차 배열 기준
        // 일반 for
//        for(int i = 0 ; i < arr1.length ; i++) {
//            // 이상의 반복문을 사용할 경우 배열 내부의 배열들이 출력됨 -> 주소값만 출력되고 element는 x
//            System.out.println("배열 내부의 배열 : " + i + " 인덱스 : " + arr1[i]);
//            // 여기서 다시 반복문을 작성하게 되면, 1, 2, 3, 4, 5, 6과 같은 element를 추출할 수 있게 됩니다.
//            for(int j = 0 ; j < arr1[i].length ; j++) {
//                System.out.println("배열 내부의 배열 내의 element : " + arr1[i][j]);
//                System.out.println();
//            }
//        }

        // 향상된 for      -> 1차배열 기준 해보시고, 2차배열 기준으로 element 뽑아내겠습니다.
        for ( int[] arr : arr1 ) {      // enhanced for에서 중요한점은
            System.out.println(arr);    // 배열 내부의 element의 data type이 뭔지가 매우 중요합니다.
                                        // 지금의 경우 배열 내부의 element가 배열이기 때문에 []를 명시
            // 2차 배열 내의 요소를 전부 추출하기 위한 이중 for문을 향상된 for 버전으로 작성
            for( int element : arr ) {
                System.out.println(element);
            }
        }

        // 요소를 추출하는 방법까지는 위에 수업했습니다
        // 근데 저희는 이미 배열을 추출하는 방법에 대해서 수업했었습니다 -> Arrays.toString()
        System.out.println("Arrays.toString() 적용 : " + Arrays.toString(arr1));
        // 이상의 코드의 실행 결과를 확인해보면 -> Arrays.toString() 적용 : [[I@36baf30c, [I@7a81197d, [I@5ca881b5]
        // 로 element가 정확하게 나오지 않고 주소값이 출력되는 것을 확인할 수 있습니다.

        // 이제 개념을 수정해야하는데, Arrays.toString()의 경우 1차 배열만 정확하게 추출할 수 있습니다.

        // 다차원 배열을 출력하는 방식 : Arrays.deepToString(배열이름)
        System.out.println(Arrays.deepToString(arr1));

        // 컴퓨터가 코드를 작성하는 방식 및 출력하는 방식이 사람들에게 항상
        // 가독성이 있는게 아닙니다.
        // 사람들이 보기 좋게 출력하는 방식 -> prettyPrinting이라고 하는데
        int[][] arr2 = {            // 해당 배열의 크기는 int[3][3]
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] arr3 = {            // 해당 배열의 크기는 int[3][2]
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
    }
}
