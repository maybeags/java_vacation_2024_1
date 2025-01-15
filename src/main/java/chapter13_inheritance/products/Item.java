package chapter13_inheritance.products;
/*
    1. field로 private String name, private String category를 선언하세요.
    2. 필드 두 개 다 사용하는 생성자를 작성하세요.
    3. setter / getter도 각각 생성 하세요.
    4. Product.java로 가서 Item - 부모 클래스 / Product가 - 자식 클래스가 되도록
        명령어를 입력하세요.
 */
public class Item {
    private String name;
    private String category;

    // 생성자  -> name / category 하나만 가지는 생성자를 만드는게 불가능
    // 정확하게 얘기하자면 하나만 만드는 게 가능합니다
    // field의 자료형이 둘 다 String이기 때문에.
    public Item(String name, String category) {
        this.name = name;
        this.category = category;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
