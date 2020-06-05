package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Calendar;
import academy.pocu.comp2500.assignment2.type.CalendarType;
import academy.pocu.comp2500.assignment2.type.ShippingOptionsType;

public class WallCalendar extends Calendar {
    public WallCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.WALL, deliveryMethod);
    }
}
