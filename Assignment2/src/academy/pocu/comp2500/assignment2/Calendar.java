package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {

    public Calendar(CalendarType calendarType) {
        super(calendarType.getSize(), "#FFFFFF", calendarType.getPrice());

        setWidth(calendarType.getWidth());
        setHeight(calendarType.getHeight());
        setName(calendarType.getName());
    }
}

final class DeskCalendar extends Calendar {
    public DeskCalendar() {
        super(CalendarType.DESK);
    }
}

final class WallCalendar extends Calendar {
    public WallCalendar() {
        super(CalendarType.WALL);
    }
}

final class MagnetCalendar extends Calendar {
    public MagnetCalendar() {
        super(CalendarType.MAGNET);
    }
}
