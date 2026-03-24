package br.edu.ifsp.ScheduleAMeeting;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;
    private List<Meeting> scheduledMeetings;

    public Schedule(LocalDate day, LocalTime startTime, LocalTime endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.scheduledMeetings = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        if (meeting == null) return;
        if (meeting.getStartTime().isBefore(this.startTime) || meeting.getEndTime().isAfter(this.endTime)) {
            System.out.println("Meeting out of schedule");
            return;
        }

        for (Meeting m : scheduledMeetings) {
            if (meeting.getStartTime().isBefore(m.getEndTime())) {
                System.out.println("Meeting time conflicting with another meeting.");
                return;
            }
        }
        scheduledMeetings.add(meeting);
    }

    public String scheduleAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Schedule ( ").append(day).append(" )\n");
        sb.append("Starting Time: ").append(startTime).append("| ").append("Ending Time: ").append(endTime).append("\n\n");
        for (Meeting m : scheduledMeetings) {
            sb.append("Time: ").append(m.getStartTime()).append(" ~ ").append(m.getEndTime()).append(", Reason: ").append(m.getDescription()).append("\n");
        }
        return sb.toString();
    }


}
