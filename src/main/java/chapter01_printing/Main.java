package chapter01_printing;
/*
    src/main/java에서 java 우클릭
    new -> package 클릭
    chapter01_printing 패키지 생성
    chapter01_printing 우클릭 new -> java class 선택
    Main.java로 파일 생성

    앞으로 필기 내용에 해당하는 부분을 package와 public class 사이에 최대한 작성할 예정
    주석(comment) : 자바 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링하는데,
        거기서 오류가 하나라도 발견되면 실행 자체가 되지 않습니다.
        하지만 주석처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에
        오류가 발생하지 않습니다.

        즉, 주석이란, 컴퓨터가 읽어서 처리하는 부분이 아니라, 사람이 읽어서 정보를 얻을 수
            있도록 하는 데에 의의가 있습니다.

            1) 한 줄 주석 : //
            2) 다중 주석 : / + shift + 8
            3) 사후 주석 : 주석처리할 부분을 드래그 한 후 ctrl + /

    프로젝트, 패키지, 클래스
        프로젝트 -> 패키지들이 모여있는 가장 큰 사이즈이며 주로 프로그램 하나를 의미함.
        패키지 -> 클래스 들이 모여있는 일종의 디렉토리 : 소문자로 작성해야 함.
        클래스 -> 파일 단위로 코드를 작성하는 공간 : 첫글자는 대문자로 작성해야 함.

    Main.java -> 앞으로 실행될 프로그램인 경우에 해당 이름을 붙일 예정입니다.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
//        System.out.println(Hello, Java!);     이 코드는 오류가 발생합니다.

        System.out.println(1);      // 우리가 복사를 할 때 사용하는 방식은 드래그한 후에 ctrl + c / ctrl + v를 씁니다 하지만
        System.out.println(2);      // 복사하고자 하는 코드 라인에 커서를 두고 ctrl + d 하면 바로 밑에 복사가 됩니다.
        // window 기준 프로그램 실행시키기 : shift + f10
        // mac : ctrl + r

        System.out.println(1 + 2);      // 3이 출력됨.
        System.out.println("1" + "2");  // 12가 출력됨
        System.out.println("안" + "근" + "수");
    }
}
/*
    System.out.println() : () 안에 있는 내용을 콘솔창에 출력해달라는 명령어 / intellij에서는 sout으로 자동 완성 가능
    숫자를 출력하기 위해서는 -> 숫자를 그대로 사용하면 되지만,
    문자를 출력하기 위해서는 -> 큰 따옴표(")로 묶어줘야 실행이 가능합니다.
 */
