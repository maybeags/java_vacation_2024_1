package chapter18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        // 객체 생성
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();

        productView1.showMainView();
        productView2.showMainView();
        productView3.showMainView();
        productView4.showMainView();
    }
}
