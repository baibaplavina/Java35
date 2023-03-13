package basics;

import java.time.*;
//Tools for easyer work set upper - Class name

public class DateAndTimeExamples {
    public static void main(String[] args) {

        //LocalTime Class - Create object / take time from local mashine / .withNano - set nanoseconds to 0 - do
        // not show it
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is " + localTime);
        //Attēlo ar slash atdalījumu laiku
             System.out.println(localTime.getHour() + "/" +localTime.getMinute() + "/"+ localTime.getSecond());


        LocalTime localTime1 = LocalTime.now().withNano(0);
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until " + localTime1);

        System.out.println("Now is " + localTime.getHour() + " full hours");

        //LocalDate need create object

        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        System.out.println("Year is " + localDate.getYear());
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
        System.out.println("Day of the year: " + localDate.getDayOfYear());

        //Month 12 or drop list
        LocalDate startOfCovid = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("First case of Covid was on " + startOfCovid);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now: " + localDateTime.withNano(0));

        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(2002,8,8,10,45,40,0);
        System.out.println("International cat's day was started on: " + firstInternationalCatsDay);

        // Classes: Duration - converting 10h to minutes/
        System.out.println(Duration.ofHours(10).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(),localDateTime.now().plusDays(2)).toMinutes());

        //Period
        System.out.println(Period.between(startOfCovid, LocalDate.now()).toTotalMonths());


    }
}
