package chapter06_condition;
/*
    조건문
    1. if문 : if 다음에 있는 () 내의 조건문이 true일 때 {} 내의 실행문이 실행됨. false면 실행 안됨

    형식 :
    if(조건문) {           조건문 : true / false로 결론이 날 수 있는 식 혹은 문장
        실행문
    }

    2. if - else문 : if 다음에 있는 () 내의 조건문이 true일 때 {} 내의 실행문이 실행됨. false면 else 부분이 실행.

    형식 :
    if(조건문1) {
        실행문1
    } else {                    else의 경우 if가 false일 때만 실행되기 때문에 별도의 조건문이 없음.
        실행문2
    }
 */
public class Condition01 {
    public static void main(String[] args) {
        int num = -10;

        if(num < 0) {       // 조건문 : num < 0 - num이라는 변수가 0 미만이라면 -> true
            System.out.println("num은 음수입니다.");      // 실행문 : 15번 라인이 true이기 때문에 실행 예정
        } else {            // else가 명확히 실행되는지 여부는 if 내의 조건문의 해석에 달려있음.
            System.out.println("num은 0이거나 양수입니다.");// num >= 0 - num이 0 '이상'
        }
    }
}
/*
    Condition02.java -> main
 */
