package chapter16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest();
        objectTest1.setName("안근수");
        objectTest1.setAddress("부산광역시 연제구");

        objectTest1.displayInfo1();
        System.out.println();
        System.out.println(objectTest1.displayInfo2());
        System.out.println("-----toString()-----");
        System.out.println(objectTest1);
    }
}
