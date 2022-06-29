import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeClass {
    LocalDate date;
    LocalTime time;
    LocalDateTime dateTime;
    DateTimeFormatter formatter;
    public TimeClass() {
        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    }
}

class someClass {
    public static void main(String[] args) {
        TimeClass myTime = new TimeClass();
        P.print("date: " + myTime.date);
        P.print("time: " + myTime.time);
        P.print("datetime: " + myTime.dateTime);
        P.print("formatted output: " + myTime.dateTime.format(myTime.formatter));
    }
}
