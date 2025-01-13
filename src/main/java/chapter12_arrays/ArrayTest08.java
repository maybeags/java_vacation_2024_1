package chapter12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    로또 번호 추첨기를 프로그래밍할 예정입니다.

    1. 1 - 45까지의 숫자를 임의로 생성한 후, lottoNumbers라는 배열에 저장할 예정

    2. 2차 배열을 만들건데요, 5번의 게임을 할 겁니다.
        로또 한 게임을 기준으로 하는 배열의 경우 -> 6이어야 할겁니다.

    3. nextInt()를 통해서 번호를 뽑게 되면 중복 번호가 생길 수 있습니다.
        -> getter / setter와 같은 파트에서 중복 제거와 관련된 로직을 확인할 수 있습니다.

    4. 배열 완성 후 오름차순을 통해서 숫자들을 정렬하여 출력하겠습니다.

    실행 예

    로또 번호 추첨기에 오신 것을 환영합니다.
    (로고 하나 출력할 것 -> text to ascii art 검색해보시면 됩니다.)
    이번 로또 당첨 번호는 다음과 같습니다.
        [ 3, 12, 25, 13, 24, 21 ]
        [ 3, 25, 7, 4, 6, 8 ]
        [ 4, 15, 22, 30, 36, 41 ]
        [ 7, 8, 19,  21, 34, 42 ]
        [ 5, 6, 14, 18, 27, 33 ]

 */
public class ArrayTest08 {
    public static void main(String[] args) {
        // 랜덤 클래스 import
        Random random = new Random();
        // random.nextInt()를 ctrl + shift + f 하시면 얘가 어떤 메서드인지 이해하실겁니다.
        // random.nextInt(한계값) = 0 ~ (한계값-1)의 int값을 반환
        // 1부터 45까지의 int값을 반환하려면 어떡해야할까요?

//        random.nextInt(46);       이 경우 0 ~ 45까지의 난수가 생성되기 때문에 0이 나올 확률이 있음.
//        random.nextInt(45) + 1  // 이경우 1 ~ 45까지의 난수 생성으로 로또 범위에 들어맞습니다.
        // 이상에서 배운 난수 생성방법을 이용해 lottoNumbers라는 배열에 값을 집어넣습니다 -> 현재는 중복 제거를 고려하지 않습니다.

        // 다 하신 분은 중복 제거를 위한 부분을 작성할건데, 현재 상황에서는 순서가 좀 중요합니다.
        // for문을 통해서 특정 index에 난수를 집어 넣습니다.
        // 이후 그 다음 생성된 난수가 중복인지 아닌지를 확인하기 위해서는
        // 이전에 생성됐던 난수들을 반복문을 통해 참조해야지만 확인할 수 있다는 점 때문입니다.

        // 난수를 배열에 집어넣는 방법
        int n = 0;
        while(n < 5) {
            int[] lottoNumbers = new int[6];
            for(int i = 0 ; i < lottoNumbers.length ; i++) {
                lottoNumbers[i] = random.nextInt(45) + 1;
            }
            // 오름차순 정리
            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
            n++;
        }
    }
}
