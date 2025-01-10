package chapter12_arrays;

import java.util.Arrays;

/*
    현재까지 배운 대부분의 Java 클래스

    Scanner
    Arrays
    Integer
    Comparator
    String

    1. index가 10개인 배열을 만들고 Math.random()을 이용하여 값을 집어넣으세요 -> 1 ~ 10까지의 int 배열을
    2. 값이 입력된 배열을 출력할 것
        1) 배열 전체 출력
        2) 각 요소를 한 줄에 출력
    3. 해당 배열의 합의 구할 것
    4. 짝수만 추출해서 합을 구할 것
 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        double a = Math.random();       // Math.random() -> 0.0 초과 1.0 미만의 난수를 생성해서 반환
//        System.out.println(a);

        // 빈 배열 선언
        int[] numbers = new int[10];
        // 전체 합을 대입할 변수 선언 및 초기화
        int sum = 0;
        // 짝수들의 합을 대입할 변수 선언 및 초기화
        int even_sum = 0;
//        int b = (int) (Math.random() * 10) + 1;
//        System.out.println(b);

        numbers[0] = (int) (Math.random() * 10) + 1;
        // 이상의 과정을 반복문으로 줄일 수 있습니다.
        for (int i = 0 ; i < numbers.length ; i++) {
            numbers[i] = (int) (Math.random() * 10) + 1;
            //합 구할겁니다.
            sum += numbers[i];
            // 짝수 합 구하는 조건문 작성
            if (numbers[i] % 2 == 0) {
                even_sum += numbers[i];
            }
            // 요소 하나씩 출력하는 부분 -> 한줄로 출력하라고 println -> print
            System.out.print(numbers[i] + " ");
        }
        // 배열 전체 출력
        System.out.println("\n" + Arrays.toString(numbers));
        // 반복문을 쓰건 하나씩 출력하건 element들을 하나씩 뽑아낼 수 있습니다.
        // 추출된 요소들을 가지고 합을 구할 수 있고, 짝수만 뽑아내는 조건문을 작성
        System.out.println("numbers 요소들의 합 : " + sum);
        System.out.println("numbers 요소들 중 짝수들의 합 : " + even_sum);
    }

}
