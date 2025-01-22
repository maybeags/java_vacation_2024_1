package chapter18_static;
/*
    static(정적) :
        클래스 수준에서 변수를 정의하거나 메서드를 선언할 때 사용.
        static으로 선언된 변수나 메서드는 클래스의 인스턴스에
        속하지 않고, 클래스 자체에 속하게 됩니다.

        이는 인스턴스를 생성하지 않고 접근이 가능하다는 점에서
        일반적인 멤버 변수(필드)나 메서드와 구분 됩니다.

    특징 :
        1. 클래스 수준의 변수 및 메서드 : static 변수와 메서드는 클래스 로드시
            메모리에 할당(객체가 생성될 때가 아니라).
        2. 공유 : 모든 인스턴스가 동일한 static 변수에 접근합니다. 따라서 데이터를 공유하거나
            상태를 저장하는 데 유용.
        3. 인스턴스 필요 없음 : 객체를 생성하지 않고도 클래스명.변수 / 클래스명.메서드명() 형태로
            직접 접근이 가능.
        4. 메모리 효율성 : static 변수는 프로그램이 종료될 때까지 한 번만 메모리에 할당.
 */
public class Product {
    // static 변수 -> 모든 클래스가 공유하는 변수
    private static int count = 0;

    // 인스턴스 변수 -> 객체마다 서로 다른 값을 가지는 변수
    private int instanceCount = 0;      // 인스턴스 변수에도 바로 초기화 가능

    public Product() {  // 기본 생성자
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        count++;        // 모든 객체가 공유하는 변수
        instanceCount++; // 각 객체마다 독립적으로 증가
    }

    public void printCountInfo() {
        System.out.println("클래스 변수 확인 : " + count);
        System.out.println("인스턴스 변수 확인 : " + instanceCount);
    }
    // 다 하신 분들은 ProductMain으로 넘어가세요.


    public static int getCount() {      // static 변수를 확인하기 위한 static 메서드
        return count;
    }

    public int getInstanceCount() {
        return instanceCount;
    }
}
