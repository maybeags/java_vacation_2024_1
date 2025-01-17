package chapter15_casting.centralcontrol;

public class CentralControl {

    // 필드 선언
    private Power[] deviceArray;        // 필드를 배열로 선언한 경우가 처음이기 때문에 주목해서 보겠습니다.

    // 매개변수 생성자를 만드세요. alt + insert
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // 전자 제품들을 CentralControl의 객체의 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device) {   // 왜 Computer/LED/Speaker가 아니라 상위 클래스인 Power인지가 문제
        // checkEmpty()는 밑에서 정의할겁니다. 지금 작성 중에 빨간줄 뜰겁니다.
        // 개발 환경에서는 만들다보면 추가적으로 메서드 구현이 필요한 경우가 있어
        // 일부러 checkEmpty()를 먼저 작성한 후 addDevice()를 구현하는게 아니라
        // 순서를 지금 같이 꼬아서 제시하게 됐습니다.

        int emptyIndex = checkEmpty();  // checkEmpty()의 리턴값이 addDevice에서 이용되는 함수형 프로그래밍

        if(emptyIndex == -1) {  // java에서는 마이너스인덱스 개념이 없기 때문에 checkEmpty()
                                // 메서드에서 -1을 반환시킨 이유는
                                // 비어있는 배열이 없다는 의미이기 때문에 다음과 같이 조건식을 설정했습니다.
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;             // return; : 해당 메서드를 종료한다는 의미.
        }
    }
    public int checkEmpty() {   // 비어있는 배열의 index를 반환하도록 할 것이기 때문에 return type int
        // 그리고 그 비어있는 배열의 index에 addDevice()를 통해
        // 새로운 전자 제품을 등록하는 방식으로 코딩할 예정

        // 배열 내부를 탐색하여 비어있는 '첫 번째' 인덱스를 리턴할 예정
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
