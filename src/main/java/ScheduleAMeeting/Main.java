package br.edu.ifsp.src.main.java.ScheduleAMeeting;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html
        // https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        final LocalDate workingDay = LocalDate.now();
        final LocalTime startingHour = LocalTime.of(7, 30);
        final LocalTime endingHour = LocalTime.of(18,30);

        Schedule scheduleToday = new Schedule(workingDay, startingHour, endingHour);

        Meeting meetingOne = new Meeting("Meeting to discuss the working flow",
                LocalTime.of(8,30),
                LocalTime.of(9,30));
        Meeting meetingTwo = new Meeting("Meeting to be the working flow",
                LocalTime.of(9,30),
                LocalTime.of(11,30));
        Meeting meetingThree = new Meeting("Meeting to try the working flow",
                LocalTime.of(12,30),
                LocalTime.of(13,30));

        System.out.println(meetingOne.durationInMinutes());
        scheduleToday.addMeeting(meetingOne);
        scheduleToday.addMeeting(meetingTwo);
        scheduleToday.addMeeting(meetingThree);

        scheduleToday.removeMeeting(meetingTwo);

        System.out.println(scheduleToday.scheduleAsString());

        final LocalDate workingDay2 = LocalDate.now();
        final LocalTime startingHour2 = LocalTime.of(10, 0);
        final LocalTime endingHour2 = LocalTime.of(10,50);

        Schedule scheduleToday2 = new Schedule(workingDay2, startingHour2, endingHour2);

        Meeting meetingFour = new Meeting("Meeting to discuss the working flow",
                LocalTime.of(10,0),
                LocalTime.of(10,25));

        scheduleToday2.addMeeting(meetingFour);

        System.out.println("Percentage of Time Spent in Meetings: " + scheduleToday2.percentageSpentInMeetings() + "%");
        // TODO → Menu de adição de meeting, testar criar LocalTime.
    }
}
