package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.type.CalendarType;
import academy.pocu.comp2500.assignment2.type.ShippingOptionsType;

public class DeskCalendar extends Calendar {
    public DeskCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.DESK, deliveryMethod);
    }
}
