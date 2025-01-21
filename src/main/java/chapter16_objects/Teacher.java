package chapter16_objects;

import java.util.Objects;

public class Teacher {
    // 필드 설정
    private String name;
    private String shcoolName;

    public Teacher(String name, String shcoolName) {
        this.name = name;
        this.shcoolName = shcoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShcoolName() {
        return shcoolName;
    }

    public void setShcoolName(String shcoolName) {
        this.shcoolName = shcoolName;
    }

    // 바로 Object 클래스의 메서드 Override -> intellij기준 ctrl + o -> 하면 Object 클래스에 있는 것이 그대로 나오고
    // 재정의된 상태로 출력되지 않습니다.

    // 이 경우에는 alt + insert를 통해서 생성하게 되면 재정의된 버전으로 튀어나오게 됩니다.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(shcoolName, teacher.shcoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shcoolName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", shcoolName='" + shcoolName + '\'' +
                '}';
    }

    // ctrl + o로 불러낸 메서드들
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
}

