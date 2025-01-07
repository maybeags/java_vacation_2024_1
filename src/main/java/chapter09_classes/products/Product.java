package chapter09_classes.products;

public class Product {

    // 필드
    int productNum;
    String productName;

    // 기본 생성자
    Product() {
        System.out.println("Product가 생성되었습니다.");
    };
    // RequiredArgsConstructor 매개변수 생성자
    // 1)
    Product(int productNum) {
        System.out.println("Product가 생성되었습니다.");
        this.productNum = productNum;
    }
    // 2)
    Product(String productName) {
        System.out.println("Product가 생성되었습니다.");
        this.productName = productName;
    }
    // AllArgsConstructor 매개변수 생성자
    Product(int productNum, String productName) {
        System.out.println("Product가 생성되었습니다.");
        this.productNum = productNum;
        this.productName = productName;
    }

    // showInfo() 메서드 정의
    void showInfo1() {
        System.out.println("시리얼 넘버 : " + productNum + "\n" + "제품 명 : " + productName);
    }

    String showInfo2() {
        return "시리얼 넘버 : " + productNum + "\n" + "제품 명 : " + productName;
    }
}
