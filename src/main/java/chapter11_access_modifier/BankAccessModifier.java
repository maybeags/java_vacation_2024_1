package chapter11_access_modifier;
/*
chapter11_access_modifier 패키지 생성
BankAccessModifier.java 클래스 생성
BankAccessModifierMain.java 클래스 생성

    접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수 등에 대한 접근 권한을 제어하는 데 사용되는 명령어

        종류 :
            1) public : 모든 클래스에서 접근할 수 있음
            2) protected : 같은 패키지 내의 클래스 및 이 클래스를 상속 받은
                자식 클래스에서 접근 가능
            3) default(package-private) : 접근 지정자를 명시하지 않으면
                default로 간주되며, 같은 패키지 내의 클래스에서만 접근 가능
            4) private : 같은 클래스 내에서만 접근 가능

    작성 가이드 라인
        1. BankAccessModifier
            1) 필드
                accountNumber(계좌번호, 정수)
                accountHolder(예금주 이름, 문자열)
                balance(잔액, 정수)
                pinNumber(비밀번호, 4자리 정수)

            2) 생성자
                기본생성자
                계좌번호만 받는 생성자
                계좌번호와 예금주를 받는 생성자
                계좌번호, 예금주, 초기잔액을 받는 생성자
                계좌번호, 예금주, 초기잔액, 비밀번호를 받는 생성자

            3) 메서드
                Setter/Getter
                    특히 Setter의 경우에는 유효성 검증 로직이 필요함
                        -> 잔액은 음수일 수 없음.
                        -> 비밀번호는 0000 ~ 9999 까지만 가능
                입출금 메서드
                    deposit(int amount, int inputPin)
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값)
                        - 콘솔창에
                            입금 성공! 현재 잔액 : 1000000원
                    withdraw(int amount, int inputPin)
                        - 올바른 비밀번호인지 확인
                        - 유효한 금액인지 검증(0보다 큰 값)
                        - 출금 후 잔액이 0 이상인지 확인
                        - 콘솔창에
                            출금 성공! 현재 잔액 : 40000원
                    showAccountInfo()
                        - 콘솔창에
                            안근수 님의 계좌 번호는 123456789이며, 현재 잔액은 100000원입니다.
 */
public class BankAccessModifier {
}
