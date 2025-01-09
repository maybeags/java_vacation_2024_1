package chapter11_access_modifier;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        // 테스트용 객체 생성
        BankAccessModifier bankAccount01 = new BankAccessModifier(123456,
                "안근수");

        // 초기 금액 설정하는데, 음수 입력했을 때 실패하는지 확인
//        bankAccount01.setBalance(-1);                 -> 성공
        // 비밀번호 설정하는데, 다섯자리수 입력했을 때 실패하는지 확인
//        bankAccount01.setPinNumber(12345);              -> 성공
        bankAccount01.setBalance(10000);                    // 초기 계좌 잔액 설정
        bankAccount01.setPinNumber(1234);                   // 초기 비밀번호 설정

//        bankAccount01.deposit(-1, 1234);      // 입금금액이 음수이고, 비밀번호 맞았을 때 테스트 코드    -> 성공
//        bankAccount01.deposit(10000, 4567);   // 입금금액은 정상이고, 비밀번호가 틀렸을 때 테스트 코드   -> 성공
        bankAccount01.deposit(10000L, 1234);

        System.out.println(bankAccount01.showAccountInfo());

        System.out.println();

//        bankAccount01.withdraw(-1, 1234);   // 출금금액이 음수이고, 비밀번호 맞았을 때 -> 성공
//        bankAccount01.withdraw(5000, 1235); // 출금금액 정상, 비밀번호 틀렸을 때  -> 성공
        bankAccount01.withdraw(50000L, 1234);    // 출금금액 정상, 비밀번호 정상, 잔액보다 많이 출금 -> 성공
        bankAccount01.withdraw(5000L, 1234);     // 전부 정상, -> 성공

        // Long 수정 이후

        Long longNum = 12234596789456513L;



    }
}
