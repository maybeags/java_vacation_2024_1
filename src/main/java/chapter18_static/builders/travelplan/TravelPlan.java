package chapter18_static.builders.travelplan;

import lombok.Builder;
import lombok.ToString;

/*
    tavelplan 패키지 생성
    TravelPlan.java
    TravelPlanMain.java

    응용 과제 :
        여행 계획 객체 생성

    다음과 같은 속성을 가진 여행 계획 객체를 생성해야 함.
        1. 여행지(destination) : 파리
        2. 출발일(depatureDate) : 2025-01-23
        3. 귀국일(returnDate) : 2025-01-30
        4. 여행자 수(numOfTravelers) : 2
        5. 호텔 이름(hotelName) : 아난티코브
        6. 비행편번호(flightNum) : AF123

    지시 사항
        1. @Builder 및 @ToString을 이용할 것
        2. 위의 속성 예시에 적어둔 데이터를 기준으로 객체를 생성할 것
        3. 생성된 객체인 travelPlan1을 sout을 통해 콘솔에 출력할 것
 */
@Builder
@ToString
public class TravelPlan {
    private String destination;
    private String depatureDate;
    private String returnDate;
    private int numOfTravelers;
    private String hotelName;
    private String flightNum;
}
