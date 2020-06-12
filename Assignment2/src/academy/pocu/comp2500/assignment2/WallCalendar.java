package academy.pocu.comp2500.assignment2;

public class WallCalendar extends Calendar {
    public WallCalendar(ShippingOptionType deliveryMethod) {
        super(CalendarType.WALL, deliveryMethod);
    }
}
