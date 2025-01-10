package chapter12_arrays;
/*
    chapter12_arrays 생성
    ArrayTest01.java 생성

    배열의 필요성 :
        여태까지의 수업을 기준으로 하면 10 개의 정수형 데이터를 저장하려면 int 변수를
        10 개 선언해서 저장해야 했습니다.
        배열은 '같은' 자료형의 데이터를 하나의 변수에 저장해서 처리하는 방식입니다.

        선언 방식 :
        자료형[] 변수명 =
        ex)
        int[] arr1 = new int[5];     // 배열 선언 방식 1 -> 배열을 선언만 하고 값은 나중에 대입하는 방식
        int[] arr2 = {1,2,3,4,5};    // 배열 선언 방식 2 -> 배열 선언 및 초기화
        System.out.println(arr2);를 통해서 출력해보면, [I@36baf30c 와 같은 이상한 값이 출력되고
        {1,2,3,4,5}와 같은 방식으로 출력되지 않습니다.

        여기서 일반 변수와 참조 변수 개념에 대해 짚고 넘어갈 필요가 있습니다.

        일반 변수 : 데이터를 직접 가지는 변수
            byte, short, int, double 등 기본 데이터 타입(자료형)(Primitive type)을 가지는 경우
        참조 변수 : 데이터가 위치한 주소값을 가지는 변수로 해당 주소를 통해서 데이터에 접근하여 값을 가져오거나
            변경하는 경우
            String, 배열, 객체(클래스), Collections -> Collections는 추후 수업 예정
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        String strExample1 = "안녕하세요";
        String strExample2 = new String("날씨가 춥습니다.");       // 객체 생성 방식
        System.out.println(strExample1);
        System.out.println(strExample2);
        String strExample3 = new String("안녕하세요");

        if(strExample1 == "안녕하세요") {
            System.out.println("실행");
        }

        if(strExample1.equals(strExample3)) {
            System.out.println("실행2");
        }

        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr2);

        // {1,2,3,4,5}에서 각 숫자 1,2,3,4,5 하나하나를 element라고 부릅니다.
        // 한국어로는 요소

        int[] thisAges = {20, 29, 30, 38};

        System.out.println(thisAges[0]);        // []내에 있는 숫자를 index라고 부르고 0부터 시작
        System.out.println(thisAges[1]);
        System.out.println(thisAges[2]);
        System.out.println(thisAges[3]);

        if (thisAges[0] > 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        // 배열의 각 element들을 추출하기 위한 방법
        // 1. thisAges[0]       : 배열명[index]
        // 2. 반복문
        //      1) 배열의 요소 개수(길이)를 명확하게 알고 있어야지만 한계값을 설정
        for(int i = 0 ; i < 4 ; i++) {
            System.out.println(thisAges[i] + 1);
        }
        //      2) 배열의 요소 개수(길이)를 알지 못할 때 사용하는 방법 = 배열명.length
        for(int i = 0 ; i < thisAges.length ; i++) {
            System.out.print(thisAges[i] + " ");
        }

        /*
            ArrayTest02.java 클래스를 만드세요
         */


    }
}
