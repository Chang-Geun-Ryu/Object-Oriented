package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.parent.Calendar;

public class DeskCalendar extends Calendar {
    public DeskCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.DESK, deliveryMethod);
    }
}
