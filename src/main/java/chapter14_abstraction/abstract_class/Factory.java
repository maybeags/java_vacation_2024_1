package chapter14_abstraction.abstract_class;

public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }
    /*
        추상 메서드 정의
        추상 메서드란? -> {} 없는 애다 // 구현부가 없다 // method body가 없다
        access modifier와 return type 사이에 abstract를 삽입해주면 추상 메서드로 선언
     */
    public abstract void produce(String model);
    public abstract void manage();

    // setter / getter를 정의하세요

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("공장의 정보를 출력합니다\n공장 이름 : " + name);
    }
}
