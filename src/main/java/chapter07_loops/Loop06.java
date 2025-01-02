package chapter07_loops;

public class Loop06 {
    public static void main(String[] args) {
        /*
            while 반복문
            형식 :
            while(조건식) {
                반복실행문
            }

            while 뒤에 나오는 소괄호 내의 영역 조건식을 보면
            if(조건식) 형태와 유사함을 확인할 수 있습니다.

            즉, while() 내에 있는 조건식이 true일 때 {}내의 영역이 반복 실행됩니다.

            그래서 for문을 쓸 때와 달리 while문을 작성할 때 유의할 점으로는 :
                for문은 한계값을 for() 내에 작성하지만,
                while문은 그렇지 않기 때문에
                미리 특정 시점에 조건식이 false가 되게끔 개발자가 염두해둘 필요가 있다는 점
         */

//        int n = 1;
//        while(n<100) {
//            System.out.println(1);
//            n++;
//        }

        // 1부터 5까지의 합을 구하는 for문
//        int sum = 0;
//        for(int i = 0 ; i < 6 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // 1부터 5까지의 합을 구하는 while문
//        int i = 0;
//        int total = 0;
//        while (i < 6) {
//            total += i;
//            i++;
//        }
//        System.out.println(total);

    }
}
/*
    for문의 경우 한계값을 설정하기 때문에 정확한 횟수의 반복을 요구할 때 사용하는 편
    while문의 정확한 횟수는 모르지만 특정한 조건 하에서의 반복을 요구할 때 사용하는 편
 */