package chapter08_methods;

import java.util.Scanner;

public class Method03 {
    /*
        Method02.java 파일을 확인하시면 별찍기 관련한 method를 구현했습니다.
        getStar() 메서드를 보면 내부에 if - else if - else 형태의 구문으로
        매개변수를 1-4까지를 받아서 왼쪽으로 증가하는 별, 오른쪽으로 증가하는 별 등을
        출력하게끔 구현돼있습니다.

        하지만 if문을 사용한 방식이 가독성이 떨어지기 때문에,
        이를 switch문으로 교체하여 동일한 기능을 하게끔
        Refactoring(리팩토링) 과정을 가지고자 합니다.
     */

    public static String getStar(int totalLine, int menuSelect) {
        String result = "";

        // Method02.java의 if문 부분을 switch문으로 교체해서 코드를 작성하시오.
        switch (menuSelect) {
            case 1 :
                for (int i = 0 ; i < totalLine ; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2 :
                for (int i = 0 ; i < totalLine ; i++) {
                    for (int j = 0; j < totalLine - i - 1; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < i + 1; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3 :
                for (int i = 0 ; i < totalLine ; i++) {
                    for (int j = 0 ; j < totalLine - i ; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4 :
                for ( int i = 0 ; i < totalLine ; i++) {
                    for (int j = 0 ; j < i ; j++) {
                        result += " ";
                    }
                    for (int k = 0 ; k < totalLine - i ; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                System.out.println("입력 오류입니다 😂");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
