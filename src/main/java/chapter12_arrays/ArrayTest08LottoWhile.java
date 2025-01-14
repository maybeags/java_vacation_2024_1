package chapter12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoWhile {
    public static void main(String[] args) {
        // Random 클래스 import
        Random random = new Random();
        // 사용할 변수 선언
        int[] lottoNumbers = new int[6];
        int count = 5;
        boolean duplicate = false;
        int number;                     // 임시로 난수를 대입할 변수

        System.out.println("로또 번호 생성기에 오신 것을 환영합니다.");
        System.out.println("알아서 로고 집어넣으시면 됩니다.");
        while(count > 0) {
            // 이제 1 게임을 완성하는 코드
            for (int i = 0 ; i < lottoNumbers.length ; i++) {
                // 이대로 하면 오류가 발생하기는 하는데 일단 보여드리고 수정법 수업할 예정 -> 반복이 시작될 때마다 duplicate = false로 재대입해줘야 함.
                duplicate = false;
                // 임시로 난수 대입
                number = random.nextInt(45) + 1;
                for(int j = 0 ; j < i ; j++) {
                    if(lottoNumbers[j] == number) {
                        duplicate = true;                                               // 중복이 하나라도 있으면 duplicate = true;
                    }
                }
                // 중복이 되지 않으면 if 부분이 실행되서 배열에 값을 대입
                // 중복이라면 else가 실행돼서 다시 한 번 random.nextInt() 실행하도록 할겁니다.
                if(!duplicate) {
                    lottoNumbers[i] = number;
                } else {
                    i--;                                                                // 23이 한 번 일어나면 재대입이 없는 경우 계속 이부분이 실행돼서
                                                                                        // 무한 반복이 일어나는 상황
                }
            }
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));

            // 그냥 두면 무한루프이기 때문에 count를 게임이 끝날 때마다 1씩 감해줍니다.
            count--;
        }




    }
}
