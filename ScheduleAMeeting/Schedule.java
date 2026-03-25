package br.edu.ifsp.ScheduleAMeeting;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;
    private final Meeting[] scheduledMeetings;
    private int meetingAcc = 0;

    public Schedule(LocalDate day, LocalTime startTime, LocalTime endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.scheduledMeetings = new Meeting[10];
    }

    public void addMeeting(Meeting meeting) {
        if (meeting == null) return;
        if (meeting.getStartTime().isBefore(this.startTime) || meeting.getEndTime().isAfter(this.endTime)) {
            return;
        }
        for (int i = 0; i < scheduledMeetings.length; i++) {
            if (meeting.getStartTime().isBefore(scheduledMeetings[i].getEndTime())) {
                return;
            }
        }
        scheduledMeetings[meetingAcc++] = (meeting);
    }

    public String scheduleAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Schedule ( ").append(day).append(" )\n");
        sb.append("Starting Time: ").append(startTime).append("| ").append("Ending Time: ").append(endTime).append("\n\n");
        for (int i = 0; i < meetingAcc; i++) {
            sb.append("Time: ").append(scheduledMeetings[i].getStartTime())
                    .append(" ~ ").append(scheduledMeetings[i].getEndTime())
                    .append(", Reason: ").append(scheduledMeetings[i].getDescription()).append("\n");
        }
        return sb.toString();
    }


}
