package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Calendar;

public class MagnetCalendar extends Calendar {
    public MagnetCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.MAGNET, deliveryMethod);
    }
}
