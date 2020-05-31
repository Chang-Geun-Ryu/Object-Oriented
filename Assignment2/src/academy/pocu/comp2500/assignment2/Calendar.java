package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {

    public Calendar(CalendarType calendarType) {
        super(calendarType.getSize(), "#FFFFFF", calendarType.getPrice());

        setWidth(calendarType.getWidth());
        setHeight(calendarType.getHeight());
        setName(calendarType.getName());
    }
}
