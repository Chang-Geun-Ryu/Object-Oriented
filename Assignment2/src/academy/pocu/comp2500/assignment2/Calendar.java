package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {

    public Calendar(CalendarType calendarType, ShippingOptionsType delivery) {
        super(calendarType.getName(), calendarType.getSize(), "#FFFFFF", calendarType.getPrice(), delivery);

        setWidth(calendarType.getWidth());
        setHeight(calendarType.getHeight());
        setName(calendarType.getName());
    }
}

final class DeskCalendar extends Calendar {
    public DeskCalendar(ShippingOptionsType delivery) {
        super(CalendarType.DESK, delivery);
    }
}

final class WallCalendar extends Calendar {
    public WallCalendar(ShippingOptionsType delivery) {
        super(CalendarType.WALL, delivery);
    }
}

final class MagnetCalendar extends Calendar {
    public MagnetCalendar(ShippingOptionsType delivery) {
        super(CalendarType.MAGNET, delivery);
    }
}
