package chapter07_loops;
/*
    java 우클릭 -> new -> package -> chapter07_loops

    chapter07 우클릭 -> new -> file -> java class -> Loop01.java
 */
public class Loop01 {
    public static void main(String[] args) {
        /*
            for 반복문
            대부분의 경우에는 명확한 횟수가 고정되어 있을 때 사용하는 반복문

            형식 :
            for(시작값 ; 종료값 ; 증감값) {
                실행문
            }
         */
        int sum = 0;

        for (int i = 0 ; i < 101 ; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지 더한 값 : " + sum);
    }
}
