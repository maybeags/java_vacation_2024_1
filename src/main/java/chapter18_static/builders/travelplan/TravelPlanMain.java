package chapter18_static.builders.travelplan;

public class TravelPlanMain {
    public static void main(String[] args) {
        TravelPlan travelPlan1 = TravelPlan.builder()
                .flightNum("AF-123")
                .hotelName("아난티코브")
                .numOfTravelers(2)
                .returnDate("2025-01-30")
                .depatureDate("2025-01-23")
                .destination("파리")
                .build();

        System.out.println(travelPlan1);

    }
}
