package academy.pocu.comp2500.assignment2;

public class Calendar extends Product {
    private CalendarType type;

    protected Calendar(CalendarType calendarType, ShippingOptionType deliveryMethod) {
        super();
        this.type = calendarType;
        setName(calendarType.getName());
        setPrice(calendarType.getPrice());
        setWidth(type.getWidth());
        setHeight(type.getHeight());
        setColor(0xFFFFFF);
        if (deliveryMethod == null) {

        } else {
            setShippingOption(deliveryMethod);
        }
    }

    public CalendarType getType() {
        return this.type;
    }
}