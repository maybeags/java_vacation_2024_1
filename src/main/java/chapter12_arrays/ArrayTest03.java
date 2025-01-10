package chapter12_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
    배열의 출력

    이전 수업에서 System.out.println(arr)을 이용하게 되면 배열은 참조자료형이기 때문에 주소값만 나온다는 것을 확인했습니다.
    그리고 반복문을 통해서 각 인덱스(주소값)에 저장된 요소(element)들을 불러올 수는 있지만
    배열 전체를 출력하는 방법은 수업하지 않았습니다.

    이번에는 배열 전체 출력 방법을 배울 예정입니다.

    'Arrays' 클래스를 이용하여, 정적 메서드 .toString(배열명)을 사용하면 배열 전체를 출력할 수 있습니다.
    클래스명.메서드명()이라는 점에 주목해야합니다 -> scanner.nextInt() 형태와는 다릅니다.
    toString() 이라는 메서드 역시 객체명.toString() 형태로 이미 사용했습니다.

    여기서 기억해야 할 점은
    동일한 method 명이라고 하더라도 어떤 클래스에 종속돼있는가에 따라서 다른 결과값을 가지고 올 수 있다는 점입니다.
    ex)
    random.nextInt()와 scanner.nextInt()는 서로 다릅니다.
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 배열 전체 출력 방법
        System.out.println(Arrays.toString(arr));   // .toString()의 argument로 배열명을 받음.

        Integer[] arr2 = { 4, 2, 8, 10, 1, 5, 9, 3, 7, 6 };
        System.out.println("정렬 전 배열 : " + Arrays.toString(arr2));

        // 오름 차순 배열
        Arrays.sort(arr2); // 이 경우에는 기존의 arr2를 오름차순으로 정렬된 배열로 아예 바꿔버리기 때문에 새로운 변수에 대입 x
        System.out.println("오름 차순 정렬 배열 : " + Arrays.toString(arr2));

        // 내림 차순 배열
        Arrays.sort(arr2, Comparator.reverseOrder());   // 마찬가지로 재대입하지 않아도 이미 내림차순 정렬됨.
        // Comparator.reverseOrder() 메서드를 적용하기 위해서는 제네릭이라는 개념인 <T>가 요구되는데,
        // T에 해당하는 것은 기본 자료형은 불가능하고, 클래스여야만 하기 때문에
        // int라는 기본 자료형으로 만들어진 배열 arr2를 Integer로 바꿔놨습니다.
        System.out.println("내림 차순 정렬 배열 : " + Arrays.toString(arr2));

        // ArrayTest04 클래스 만드세요
    }
}
