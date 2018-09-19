package ex.lib;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Date;

public final class DateProviderT4
    implements
    DateProvider {

    @Override
    public Date now() {
        int year = 2000;
        Month month = Month.DECEMBER;
        int day = 31;
        int hour = 23;
        int minute = 59;
        int second = 59;
        int nanoSecond = 999999999;
        LocalDateTime.of(year, month, day, hour, minute, second, nanoSecond);
        LocalDateTime time = LocalDateTime.of(year, month, day, hour, minute, second, nanoSecond);
        Instant instant = time.toInstant(ZoneOffset.UTC);
        return Date.from(instant);
    }
}
