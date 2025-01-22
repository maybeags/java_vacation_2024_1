package chapter18_static;

public class ProductMain {
    public static void main(String[] args) {
        // 객체 생성
        Product product1 = new Product();

        product1.printCountInfo();  // 1 / 1

        // 객체 생성
        Product product2 = new Product();
        product2.printCountInfo();

//        System.out.println(Product.count);  // 클래스명.정적변수로 정적변수 확인 가능
//        System.out.println(product1.instanceCount);
        // 현재 Product와 ProductMain에서 작성한 코드를 기준으로 할 때
        // 만약에 정적 변수 및 인스턴스 변수에 private 달아버렸을 때
        // 14 - 15 라인이 실행이 불가능합니다.

        System.out.println(Product.getCount());
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();
        Product product9 = new Product();

        System.out.println(Product.getCount());
        System.out.println(product3.getInstanceCount());
        System.out.println(product4.getInstanceCount());
        System.out.println(product5.getInstanceCount());
        System.out.println(product6.getInstanceCount());
        System.out.println(product7.getInstanceCount());
        System.out.println(product8.getInstanceCount());
    }
}
