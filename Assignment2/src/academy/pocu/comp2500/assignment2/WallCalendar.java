package academy.pocu.comp2500.assignment2;

public class WallCalendar extends Calendar {
    public WallCalendar(ShippingOptionsType deliveryMethod) {
        super(CalendarType.WALL, deliveryMethod);
    }
}
