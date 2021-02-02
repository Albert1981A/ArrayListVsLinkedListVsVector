import java.time.LocalDate;

public class FactoryUtils {

    public static LocalDate createLocalDateTime() {
        int year = (int)(Math.random()*22)+2000;
        int month = (int)(Math.random()*12)+1;
        int day = (int)(Math.random()*28)+1;
        return LocalDate.of(year, month, day);
    }
}
