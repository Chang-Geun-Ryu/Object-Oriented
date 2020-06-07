package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {
    private CalendarType type;

    protected Calendar(CalendarType calendarType, ShippingOptionsType deliveryMethod) {
        super();
        setName(calendarType.getName());
        setPrice(calendarType.getPrice());

        if (deliveryMethod == null) {

        } else {
            setShippingOptions(deliveryMethod);
        }
    }

    public CalendarType getType() {
        return this.type;
    }

    public int getWidth() {
        return this.type.getWidth();
    }

    public int getHeight() {
        return this.type.getHeight();
    }
}