package chapter12_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest08LottoFor {
    public static void main(String[] args) {
        Random random = new Random();

        // 이번에는 2차배열을 통해서 만들겁니다.
        int[][] lottoNumbers = new int[5][6];       // -> 숫자 6개 뽑는 배열이 5개가 있다는 의미
        boolean duplicate;
        int number;
        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
        // 5번 반복            -> 2차 배열로 만들기 때문에 시작부터 세팅이 이루어져야합니다.
        for (int i = 0 ; i < lottoNumbers.length ; i++) {
            // 각 게임마다 6개의 로또 번호가 생성
            for (int j = 0 ; j < lottoNumbers[i].length ; j++) {
                duplicate = false;
                number = random.nextInt(45) + 1;
                // 현재 게임에서 중복을 검사
                for (int k = 0 ; k < j ; k++) {
                    if (lottoNumbers[i][k] == number) {
                        duplicate = true;
                    }
                }
                // 중복되지 않으면 저장해주고, 중복되면 반복문 실행
                if (duplicate) {
                    j--;
                } else {
                    lottoNumbers[i][j] = number;
                }
            }
            Arrays.sort(lottoNumbers[i]);
            // 정리를 위해 여기에 좀 있다 작성 예정
            System.out.println(Arrays.toString(lottoNumbers[i]));
        }
//        System.out.println("로또 번호 추첨기에 오신 것을 환영합니다.");
//        System.out.println(Arrays.deepToString(lottoNumbers));  // 2차 배열 형태로 5게임을 한줄에 전부 출력
    }
}
