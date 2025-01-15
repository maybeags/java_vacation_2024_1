package chapter13_inheritance.products;

public class Product extends Item{
    // 필드 선언
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        super(name, category);      // 부모의 field를 가져오는 super 키워드
        this.price = price;         // 자식 클래스의 필드의 생성자 만들 때 쓰던 대입 방식
        this.stock = stock;
        System.out.println("Product가 생성되었습니다.");
    }

    // getter / setter를 만드세요. 부모 클래스의 필드 / 자식 클래스의 필드 전부 다.

    // 자기 필드 getter / setter -> alt + insert -> getter and setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 부모 필드의 getter / setter를 가지고 올거라면
    // alt + insert -> override methods였습니다.

    public Product(String name, String category) {
        super(name, category);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    // 자기 고유의 메서드
    public void displayInfo() {
        System.out.println("제품명 : " + this.getName() + "\n카테고리 : " + this.getCategory());
        System.out.println("가격 : " + this.getPrice() + "\n재고 : " + this.getStock());
    }
}
