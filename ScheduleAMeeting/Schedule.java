package br.edu.ifsp.ScheduleAMeeting;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime; //TODO idem
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
        if (meetingAcc >= 10)
            return; // TODO não lembro dessa regra. Na prova não inventa requisito não. No caso, como não há limite, mete uns 100 no array e boa
        if (isOutOfWorkingShift(meeting))
            return; // TODO dá para extrair ifs complicados em métodos, para auemntar a legibildiade
        //TODO isso também se aplica aqui. Você pode inclusive adicionar um método "collides(meet) em Meeting, para ver se um bate com o outro. Ai você chama isso no for.
        //TODO também dá para transformar isso em um método que retorna bool se colide com qualquer dos existentes - isColliding()
        for (int i = 0; i < meetingAcc; i++) {
            if (meeting.getStartTime().isBefore(scheduledMeetings[i].getEndTime())) { // TODO dá uma conferida se é só isso mesmo. Acho que tem mais coisa.
                return;
            }
        }
        scheduledMeetings[meetingAcc++] = meeting;
    }

    private boolean isOutOfWorkingShift(Meeting meeting) {
        return meeting.getStartTime().isBefore(this.startTime) || meeting.getEndTime().isAfter(this.endTime);
    }

    private int meetIndex(Meeting meeting) {
        for (int i = 0; i < scheduledMeetings.length; i++) {
            if (scheduledMeetings[i].equals(meeting)) return i;
        }
        return -1;
    }

    private long scheduleDurationInMinutes() {
        return Duration.between(startTime, endTime).toMinutes();
    }

    public double percentageSpentInMeetings() {
        double timeInMeetings = 0;
        for (int i = 0; i < meetingAcc; i++) {
            timeInMeetings += scheduledMeetings[i].durationInMinutes();
        }
        return timeInMeetings / scheduleDurationInMinutes() * 100;
    }

    public void removeMeeting(Meeting meeting) {
        // Fazer ordenação depois.
        int indexPos = meetIndex(meeting);
        if (indexPos == -1) return;

        for (int i = indexPos; i < scheduledMeetings.length - 1; i++) {
            scheduledMeetings[i] = scheduledMeetings[i + 1];
        }
        scheduledMeetings[meetingAcc--] = null; // TODO como não tá ordenado, dá para trocar pelo último, mais rápido.
    }

    //TODO isso mesmo
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
