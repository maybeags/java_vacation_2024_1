package chapter07_loops;

public class Loop05 {
    public static void main(String[] args) {
        /*
                    *
                    **
                    ***
                    ****
                    *****
                    *****
                    ****
                    ***
                    **
                    *
         */
//        //증가하는 패턴
//        for( int i = 0 ; i < 5 ; i++) {
//            for( int j = 0 ; j < i + 1 ; j ++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // 감소하는 패턴
//        for(int i = 5 ; i > 0 ; i--) {          // 감소 패턴의 경우에는 잘 쓰지 않는 i--와 int i = 0부터가 아니라는 점
//            for (int j = 0 ; j < i ; j++) {     // j에서는 j++를 적용한다는 점 때문에 구조를 파악할 필요가 있다는 점이 중요
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
             *
             **
             ***
             ****
             *****
             ****
             ***
             **
             *
         */
        //증가하는 패턴
        for( int i = 0 ; i < 5 ; i++) {
            for( int j = 0 ; j < i + 1 ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 감소하는 패턴
        for(int i = 4 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
