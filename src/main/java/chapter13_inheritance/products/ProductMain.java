package chapter13_inheritance.products;
/*
    chapter13_inheritance 패키지 내부에 products 패키지 생성
    ProductMain
    Product
    Item
 */
public class ProductMain {
    public static void main(String[] args) {

        // Item 객체 생성
        Item item1 = new Item("일반 상품", "일반 카테고리");
//        item1.displayInfo();
        // 이상의 코드가 오류가 난다는 점에서 알 수 있는 점 :
        // 자식은 부모의 필드 및 메서드를 사용할 수 있으나(정의했다면),
        // 부모 클래스의 객체는 자식 클래스의 필드 및 메서드를 사용할 수 없음.
        // 실행 예
        // 이 상품은 일반 상품입니다.
        // 이 상품은 일반 카테고리입니다.
        // -> Item 클래스 손대지말고, 해당 출력문이 콘솔에 나오도록 작성하시오.
//        System.out.println("이 상품은 일반 상품입니다.");    -> 이거 안됩니다.
        System.out.println("이 상품은 " + item1.getName() + "입니다.");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다.");

        //전자 제품->이름, 가전->카테고리, 100000, 10 으로 객체를 생성하세요.
        // displayInfo()를 통해 콘솔에 정보를 출력하세요.
        // setter 사용을 통해 이름을 "가전 제품"으로 바꾸고, getter를 통해 바뀐 정보를 콘솔에 출력하세요.
        Product product1 = new Product("전자 제품", "가전", 100000, 10);
        product1.displayInfo();             // 자식 클래스가 자신의 메서드를 사용한 예시 -> 부모는 사용 불가능
        product1.setName("가전 제품");      // 부모 클래스의 메서드를 사용한 예시1
        System.out.println(product1.getName()); // 부모 클래스의 메서드를 사용한 예시2
    }
}
