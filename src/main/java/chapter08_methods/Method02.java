package chapter08_methods;

import java.util.Scanner;

public class Method02 {
    /*
        반복문에서 배웠던 별찍기를 기준으로 메서드를 구현
     */
    public static String getStar(int select, int n) {   // main 보시면 select가 줄 수 / n이 어떤 별모양
        String result = "";

        if (n == 1) {
            // 왼쪽으로 증가하는 별찍기 반복문
            for (int i = 0 ; i < select ; i++) {
                for (int j = 0 ; j < i + 1 ; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (n == 2) {
            // 오른쪽으로 증가하는 별찍기 반복문
            for (int i = 0 ; i < select ; i++) {
                // 공백 삽입
                for (int j = 0 ; j < select - i - 1 ; j++){
                    result += " ";
                }
                // 별 찍기
                for (int k = 0 ; k < i + 1 ; k++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if ( n == 3) {
            // 왼쪽으로 감소하는 별찍기 반복문
            for (int i = 0 ; i < select ; i++) {
                for (int j = 0 ; j < select - i ; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if ( n == 4 ) {
            // 오른쪽으로 감소하는 별찍기 반복문
            for ( int i = 0 ; i < select ; i++) {
                // 공백을 표시하는 반복문
                for (int j = 0 ; j < i ; j++) {
                    result += " ";
                }
                // 별 찍는 반복문
                for (int k = 0 ; k < select - i ; k++) {
                    result += "*";
                }
                // 개행하는 실행문
                result += "\n";
            }
        } else {
            System.out.println("입력 오류입니다!! 😂");
        }


        return result;
    }

    public static void main(String[] args) {
        // 별찍기를 할 때 줄 수를 입력 받았던 방식을 사용할겁니다.
        // 그리고 입력 받은 숫자를 getStar() argument로 사용할 예정
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);
        // 입력을 저장할 변수 선언 및 초기화
        int rowOfStars;
        int choice;

        System.out.print("별의 줄 수 입력 : ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴를 선택하세요 >>> ");
        choice = scanner.nextInt();

        String starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);







    }
}
