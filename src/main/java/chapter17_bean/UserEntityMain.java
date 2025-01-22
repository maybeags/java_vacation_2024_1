package chapter17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();

        // username에 qwer
        // password 1234
        // email a@test.com
        // name에 여러분 이름을 입력한 뒤에
        // toString을 override해서 콘솔에 출력하세요.

        user1.setUsername("qwer");
        user1.setPassword("1234");
        user1.setEmail("a@test.com");
        user1.setName("김일");

        System.out.println(user1);

        // UserEntityLombok 객체 생성
        UserEntityLombok user2 = new UserEntityLombok();

//        user2.setUsername("abcd");
//        user2.setPassword("4321");
//        user2.setEmail("b@test.com");
//        user2.setName("이이");
//        user2.setAge(13);

    }
}
