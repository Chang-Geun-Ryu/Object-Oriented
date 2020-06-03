package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {

    public Calendar(CalendarType calendarType, ShippingOptionsType deliveryMethod) {
        super(calendarType.getSize(), 0xFFFFFF, calendarType.getPrice(), deliveryMethod);

        setWidth(calendarType.getWidth());
        setHeight(calendarType.getHeight());
        setName(calendarType.getName());
    }
}

final class DeskCalendar extends Calendar {
    public DeskCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.DESK, deliveryMethod);
    }
}

final class WallCalendar extends Calendar {
    public WallCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.WALL, deliveryMethod);
    }
}

final class MagnetCalendar extends Calendar {
    public MagnetCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.MAGNET, deliveryMethod);
    }
}
