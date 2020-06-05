package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Calendar;

public class WallCalendar extends Calendar {
    public WallCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.WALL, deliveryMethod);
    }
}
