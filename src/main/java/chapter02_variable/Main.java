package chapter02_variable;
/*
    chapter02_variable 패키지 생성
    Main.java 생성    -> 사실 Main만 작성해도 됩니다.

    변수(variable) : 데이터를 담을 수 있는 바구니

    1. 논리 자료형(boolean) 변수 : 참 / 거짓
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(3.1415926623);

        // 원의 둘레를 구하는 공식 지름 * 원주율
        // 10번 라인에 있는 원주율을 이용하여 지름이 19인 원의 둘레를 구하시오

//        System.out.println(19 * 3.1415926623);

        // 이상의 코드를 봤을 때, 3.1415926623를 사람이 기억하고 있다가 매번 빼 쓰는 것은 비효율적으로 보입니다.
        // 그래서 우리는 변수를 선언하여 3.1415926623 값을 저장시키도록 할 예정입니다.

//        double pi = 3.1415926623;
        // 지름이 23인 원의 둘레를 구하시오.
//        System.out.println(23*pi);
        /*
            Java에서의 변수 표기 방식 :
                카멜 표기법(Camel Case) : 첫 문자는 소문자로 쓰고, 복수의 단어가 연결된 경우에는
                    두 번째 단어의 첫 문자만 대문자로 씁니다.
                    ex) 하나짜리 단어인 경우
                        String example;
                    ex) 복수의 단어로 조합된 경우
                        String exampleOfKorean
                특히 파이썬 배우신 분들의 경우는 스네이크 케이스로 쓰기 때문에 실수를 많이 하십니다.
                        example_of_korean
         */
//        1. 논리 자료형(boolean) 변수 : 참 / 거짓
        // boolean
//      자료형   변수명     = 데이터;            변수 선언 및 초기화 방식
//        boolean checkFlag = false;
//        System.out.println(checkFlag);
//        checkFlag = true;       // 데이터를 재 대입 할 시에는 자료형을 선언하지 않습니다.
//        System.out.println(checkFlag);
//
////        checkFlag2 = true;    // 해당 코드는 오류가 발생합니다.
//        // 즉 처음 변수명이 등장하는 시점에는 반드시 자료형과 함께 명시되어야 합니다.
//        boolean checkFlag2 = true;  // 이렇게 해야지만 오류가 발생하지 않습니다.
//
//        boolean checkFlag3;         // 변수 선언 방법
//        checkFlag3 = false;         // 초기화 방법
        // 변수 선언 : 변수의 자료형과 변수 이름을 처음으로 명시하는 것
        // 초기화 : 변수에 처음으로 데이터를 대입하는 것

//        최초로 변수를 선언할 때 자료형(data type)을 명시하고 값을 대입하여 초기화함.
//        추후 해당 변수에 값을 재 대입하는 경우에는 변수명 = (바뀐)값; 형태로 작성함.

        // 2. 문자 자료형 변수
//        char name1 = '안';       // 문자를 입력할 때는 작은 따옴표(')로 감싼다.
//        char name2 = '근';       // char는 character의 축약어로 알파벳 / 한글 / 숫자 하나를 의미합니다.
//        char name3 = '수';       // 문자열 =/= 문자
//
//        System.out.println(name1 + name2 + name3);  // 144732
//        System.out.println(name1 + name3 + name2);  // 144732
//
//        System.out.println("" + name1 + name2 + name3); // 안근수
//        System.out.println("" + name1 + name3 + name2); // 안수근

        // 이상의 코드에서 확인할 수 있는 것은 컴퓨터는 생각보다 멍청해서 우리가 하나하나 다 지정해줘야 한다는 점입니다.
        // 문자와 문자열이 서로 다른데 문자(하나짜리)를 세 번 더했을 경우 더이상 문자가 아니라 문자열로 바뀌는데,
        // 사람이라면 융통성있게 처리했겠지만 컴퓨터는 그렇지 않아서 61, 62번 라인에서는 자료형 불일치로 유니코드가 출력됩니다.
        // 문자들을 합쳐서 문자열로 출력하기 위해서 꼼수를 쓴 부분이 64, 65번 라인에 해당합니다.
        // java의 sout의 경우 괄호 안의 맨 앞 부분의 자료형을 따라가는 경우가 있습니다.
        // 즉, 큰 따옴표로 시작했을 경우 () 내에 있는 전체 자료형을 문자열로 보기 때문에 "안근수" 전체가 출력 가능합니다.
        /*
            지시 사항
            name4, name5, name6에 한 글자씩 여러분의 이름을 대입하고,
            콘솔창에 여러분 이름이 출력될 수 있도록 코드를 작성하세요.

            실행 예
            김철우
         */
//        char name4 = '김';
//        char name5 = '철';
//        char name6 = '우';
//        System.out.println("" + name4 + name5 + name6);


        // 3. 정수 자료형 변수
//        int width1 = 100;
//        int width2 = 200;
//        System.out.println(width1 + width2); // 숫자끼리는 연산이 가능합니다. chapter01에서 배웠습니다.
//
//        String width3 = "300";
//        String width4 = "400";
//
//        System.out.println(width3 + width4);    // 이것도 확인했었습니다. 300400
//        System.out.println(width1 + width3);    // 100300   정수 + 문자열 = 문자열로 나열
//        System.out.println(width4 + width2);    // 400200   문자열 + 정수 = 문자열로 나열
//
//        // 원래 자바 17 이전까지는 String에 한 줄씩만 가능했었습니다.
//        String name = "안근수";
//        String major = "영어교육과";
//        String job = "코리아it아카데미 자바 강사";
//
//        // 그런데 자바 17부터 다중 String을 지원하게 됐습니다.
//        String introduction = """
//                제 이름은 안근수입니다.
//                방학 특강으로 Java를 수업하며 여러분들과 함께 하게 되었습니다.
//                비전공자 출신이라 최대한 초심자들이 쉽게 이해할 수 있는 방향으로 수업할 수 있도록 하겠습니다.
//                앞으로 잘 부탁드립니다.
//                """;
//
//        System.out.println(introduction);

        /*
            String introduction2를 선언하고, 거기에 수강생 분들의
            이름
            전공
            직업
            mbti를 입력하고,

            sout을 통해서 콘솔창에 출력하세요.
         */
//        String introduction2 = """
//                이름 : 안근수
//                전공 : 영어교육과
//                직업 : 코리아it 아카데미 자바 강사
//                mbti : ESTJ
//                """;
//
//        System.out.println(introduction2);
//
//        String introduction3 = "이름 : 안근수\n전공 : 영어교육과";  // \n : 개행
//
//        System.out.println(introduction3);

        /*
            4. 실수 자료형 변수    -> 소수점 유무
         */

        double pi = 3.1415926623;

//        int pi2 = 3.14;   -> 자료형 선언에 대해 신중할 필요가 있습니다.

//        int longNum = 12345678901;      -> 오류가 발생함 : int가 포함할 수 있는 자리수를 벗어났음.

//        System.out.println(longNum);

        long longLongNum = 12345678901L;    // -> 오류가 발생하지 않는데, long으로 선언했을 시,
                                            // 숫자 맨 뒤에 L을 명시하여 long 타입임을 알 수 있게 함.

        /*
            int (4 바이트, 32 비트)
                최소값: -2,147,483,648 (−2^31)
                최대값: 2,147,483,647 (2^31 − 1)
            long (8 바이트, 64 비트)
                최소값: -9,223,372,036,854,775,808 (−2^63)
                최대값: 9,223,372,036,854,775,807 (2^63 − 1)

            5. 상수
         */
        // final 자료형 변수명 = 데이터;
        int number = 123;       // 일반적인 변수 선언 방식
        /*
           상수의 특징 :
            1) 한 번의 선언 및 초기화가 가능 -> 변수와는 달리 재대입이 불가능
            2) 이미 초기화가 끝난 상수를 한참 밑에서 불러올 경우 걔가 상수인지 아닌지
                가시적으로는 확인이 불가능하기 때문에
                개발자들끼리의 약속으로 상수의 명칭은 전부 다 대문자로 작성하고, 단어 사이의 경계를
                "_"로 연결함.

         */
        final int FINAL_NUM = 123;      // 특징을 모두 반영한 표기 방식
        final String FILE_PATH = "c:/ahngeunsu_java";       // 상수 선언 및 초기화
        System.out.println(FILE_PATH);

        final String EXAMPE_OF_FINAL;       // 상수 선언

        EXAMPE_OF_FINAL = "이것은 예시입니다";  // 초기화

        System.out.println(EXAMPE_OF_FINAL);

        /*
            chapter03_conversion package 생성
            Main.java 클래스 생성
         */

    }
}
