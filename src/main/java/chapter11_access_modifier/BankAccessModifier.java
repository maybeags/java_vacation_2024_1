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
                            안근수 님의 계좌 번호는 1234567이며, 현재 잔액은 100000원입니다.
 */
public class BankAccessModifier {
    // Setter / Getter를 통해서 입력하고, 조회할 예정이기 때문에 접근지정자를 설정
    private int accountNumber;
    private String accountHolder;
    private int balance;
    private int pinNumber;
    // updated version -> 1. balance, 입금 혹은 출금시 큰 금액 단위로 하기 위해 : int -> Long
    private Long balanceLong;

    // 생성자들 만들어야 합니다.

    public BankAccessModifier() {}

    public BankAccessModifier(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccessModifier(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccessModifier(int accountNumber, String accountHolder, Long balanceLong) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balanceLong = balanceLong;
    }

    public BankAccessModifier(int accountNumber, String accountHolder, Long balanceLong, int pinNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balanceLong = balanceLong;
        this.pinNumber = pinNumber;
    }

    // Setter / Getter 지정해야 합니다 -> 검증 로직 필요한 경우 있습니다.


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {       // 0 미만은 입력되지 않게끔 로직 작성
        if (balance < 0) {
            System.out.println("불가능한 입력 금액입니다.");
        } else {
            this.balance = balance;
        }
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {   // 0000 ~ 9999까지만 입력되도록 로직 작성
        if (pinNumber > -1 && pinNumber < 9999) {
            this.pinNumber = pinNumber;
        } else {
            System.out.println("불가능한 비밀번호입니다.");
        }
    }

    // Long version Setter / Getter


    public Long getBalanceLong() {
        return balanceLong;
    }

    public void setBalanceLong(Long balanceLong) {
        if (balanceLong < 0) {
            System.out.println("불가능한 입력 금액입니다.");
        } else {
            this.balanceLong = balanceLong;
        }
    }

    // deposit / withdraw 메서드를 정의
    // call2() 유형 메서드 정의 -> 콘솔창에 출력할 예정
    public void deposit(Long amount, int inputPinNumber){
        // amount이 0 초과 // inputPinNumber == pinNumber
        if (amount > 0 && inputPinNumber == pinNumber) {
            this.balance += amount;
            System.out.println("입금 성공! 현재 잔액 : " + this.balance);
        } else {
            System.out.println("입금 불가입니다.");
        }
    }

    public void withdraw(Long amount, int inputPinNumber){
        // amount가 0 초과일 것 / 비밀번호가 일치할 것 / 잔액이 0 이상일 것
        if (amount > 0 && inputPinNumber == pinNumber && (this.balance-amount) >= 0) {
            this.balance -= amount;
            System.out.println("출금 성공! 현재 잔액 : " + this.balance);
        } else {
            System.out.println("출금 불가입니다.");
        }
    }

    // call3() 유형 메서드 정의
    public String showAccountInfo() {
        return this.accountHolder + " 님의 계좌 번호는 " + this.accountNumber + "이며, 현재 잔액은 " + this.balance + "원입니다.";
    }
}
