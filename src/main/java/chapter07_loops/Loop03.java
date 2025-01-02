package chapter07_loops;

public class Loop03 {
    public static void main(String[] args) {
        /*
            중첩 for문(Nested for sentence)
            for(int i = 0 ; i < 10 ; i++) {
                실행문1
                for(int j = 0 ; j < 10 ; j++) {
                    실행문2
                }
                실행문3
            }
         */
//        int a = 0;
//        int b = 0;
//        for(int i = 0 ; i < 10 ; i++) {
//            a = i;
//            System.out.println("a의 값 : " + a);
//            for(int j = 0 ; j < 10 ; j++) {
//                b = j;
//                System.out.println("b의 값 : " + b);
//            }
//        }

        /*
            a의 값 : 0
            b의 값 : 0
            b의 값 : 1
            b의 값 : 2
            b의 값 : 3
            b의 값 : 4
            b의 값 : 5
            b의 값 : 6
            b의 값 : 7
            b의 값 : 8
            b의 값 : 9
            a의 값 : 1
            b의 값 : 0
         */
        /*
            실행 예
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 8 = 72
            9 x 9 = 81
         */

        for(int i = 2 ; i < 10 ; i++ ) {
            System.out.println(i + "단 출력 : ");// 실행문1 -> optional
            for (int j = 1 ; j < 10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("-----------------");// 실행문3 -> optional
        }

        // 이렇게 하지 마세요
//        for(int i = 0 ; i < 8 ; i++){
//            int dan = i + 2;
//            for (int j = 0; j < 9; j++){
//                int num  = j + 1;
//                System.out.println(dan + " x " + num + " = " + (dan*num));
//            }
//        }


    }
}
