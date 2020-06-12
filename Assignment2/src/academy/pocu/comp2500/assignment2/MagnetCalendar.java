package academy.pocu.comp2500.assignment2;

public class MagnetCalendar extends Calendar {
    public MagnetCalendar(ShippingOptionType deliveryMethod) {
        super(CalendarType.MAGNET, deliveryMethod);
    }
}
