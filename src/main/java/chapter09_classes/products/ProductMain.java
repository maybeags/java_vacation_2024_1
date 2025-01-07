package chapter09_classes.products;
/*
    products package 생생
    -> Product.java / ProductMain.java

    여러 가지 생성자를 정의하세요.
    기본 생성자
    매개변수 생성자

    필드는

    int productNum;
    String productName;

    메서드는

    showInfo() -> productNum과 ProductName 정보가 콘솔에 출력되도록 작성

    즉 생성될 수 있는 생성자의 경우의 수는 4 가지.

    1. 기본 생성자를 사용해서 객체 생성하세요. product1
        productNum 123456
        productName LG엘패드

    2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해서 객체 생성하세요. product2
        productNum 987654
        productName 다이소충전기

    3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해서 객체 생성하세요. product3
        productNum 159357
        productName USB-C 케이블

    4. AllArgsConstructor를 이용해서 객체 생성하세요. product4
        productNum 951753
        productName GFlip6
 */
public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성
        // 기본 생성자 이용한 객체 생성
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        // 매개 변수 생성자를 이용한 객체 생성
        Product product2 = new Product(987654);
        product2.productName = "다이소충전기";

        Product product3 = new Product("USB-C 케이블");
        product3.productNum = 159357;

        Product product4 = new Product(951753, "GFlip6");

        product1.showInfo1();
        product2.showInfo1();
        product3.showInfo1();
        product4.showInfo1();

        System.out.println();
        System.out.println(product1.showInfo2());
        System.out.println(product2.showInfo2());
        System.out.println(product3.showInfo2());
        System.out.println(product4.showInfo2());
    }
}
