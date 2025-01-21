package chapter16_objects.teachers;

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

    // 바로 Object 클래스의 메서드 Override -> intellij기준 ctrl + o


    @Override
    public int hashCode() {
        // 재정의 할겁니다.
        return Objects.hash(name, shcoolName);
    }

    @Override
    public boolean equals(Object o) {
        // 재정의 할겁니다
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) o;  // 명시적 다운 캐스팅
        return Objects.equals(name, teacher.name) && Objects.equals(shcoolName, teacher.shcoolName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
