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
        println("date: " + myTime.date);
        println("time: " + myTime.time);
        println("datetime: " + myTime.dateTime);
        println("formatted output: " + myTime.dateTime.format(myTime.formatter));
    }

    static void println(Object input) {
        System.out.println(input);
    }
}
