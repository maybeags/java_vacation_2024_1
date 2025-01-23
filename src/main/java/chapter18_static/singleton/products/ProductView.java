package chapter18_static.singleton.products;

public class ProductView {
    private static ProductView instance = null;

    private ProductView() {
        int counter = 1;
        System.out.println(counter + "번째 ProductView 객체가 생성되었습니다.");
        counter++;
    }

    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();   // 기본생성자는 디폴트라서
        }
        return instance;
    }

    public void showMainView() {
        System.out.println("상품 정보를 보여주는 메인 화면");
    }

    public void showOrderView() {
        System.out.println("주문 정보를 보여주는 화면");
    }
}
