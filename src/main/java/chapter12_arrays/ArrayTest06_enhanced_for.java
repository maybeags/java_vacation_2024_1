package chapter12_arrays;
/*
    향상된 for문(enhanced for sentence)

    일반 for문과의 차이점 :
        일반 for문의 경우 인덱스 넘버를 명확하게 알고 있어야만 합니다.
        하지만, 일일이 element의 숫자를 세는 것이 번거롭기 때문에
        arr1.length와 같은 방식으로 int 값을 추출해서 대입했습니다.

    향상된 for문의 형식 :
    for ( 자료형 변수명 : 반복가능객체 ) {
        실행문
    }

 */
public class ArrayTest06_enhanced_for {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0 ; i < 10 ; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0 ; i < arr1.length ; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        // 향상된 for문 적용 버전
//        for( int element : arr1 ) {
//            System.out.print(element + " ");
//        }
//        int[] mathScores = { 100, 90, 80, 70 };
//
//        for( int mathScore : mathScores ) {
//            System.out.print(mathScore + " ");
//        }
        // 배열 선언 및 초기화
        String[] names = {"허수지", "정승민" ,"장소정", "이현아", "윤현지", "윤지희",
                "성재원", "백지흔", "박종현", "노소정", "김민지", "김민성", "김민서", "김경준"};

        // 일반 for문으로 요소 출력
        for (int i = 0 ; i < names.length ; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();   // 개행
        // 향상된 for문으로 요소 출력
        for ( String name : names ) {
            System.out.print(name + " ");
        }

        /*

    여태까지는 arr1과 같은 방식으로 배열의 이름을 지었지만,
    실제 개발환경 상에서는 복수형을 쓰는 경우가 많습니다.

    ex) 수학 점수들을 모아둔 배열이 있다고 가정하면
    mathScores와 같은 방식으로 작성하게 됩니다.

           허수지, 정승민 ,장소정, 이현아, 윤현지, 윤지희, 성재원, 백지흔, 박종현, 노소정, 김민지, 김민성, 김민서, 김경준

            를 names라는 배열에 담은 뒤 요소를 하나씩 출력하는데,
            한줄로 출력하시오.
         */



    }


}
