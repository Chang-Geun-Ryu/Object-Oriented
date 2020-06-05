package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.type.CalendarType;
import academy.pocu.comp2500.assignment2.type.ShippingOptionsType;

public class Calendar extends Product {
    private CalendarType type;

    public Calendar(CalendarType calendarType, ShippingOptionsType deliveryMethod) {
//        super(calendarType.getSize(), 0xFFFFFF, calendarType.getPrice(), deliveryMethod);
//        super(0xFFFFFF, calendarType.getPrice(), deliveryMethod);
        super();
        setName(calendarType.getName());
        setPrice(calendarType.getPrice());

        if (deliveryMethod == null) {

        } else {
            setShippingOptions(deliveryMethod);
        }
    }

    private void setup(CalendarType calendarType, ShippingOptionsType deliveryMethod) {
        setName(calendarType.getName());
        setPrice(calendarType.getPrice());

        if (deliveryMethod == null) {

        } else {
            setShippingOptions(deliveryMethod);
        }
    }

    public void setType(CalendarType type) {
        this.type = type;
    }

    public CalendarType getType() {
        return this.type;
    }

//    public Calendar deskCalendar(ShippingOptionsType deliveryMethod) {
//        setup(CalendarType.DESK, deliveryMethod);
//        return this;
//    }
//
//    public Calendar wallCalendar(ShippingOptionsType deliveryMethod) {
//        setup(CalendarType.WALL, deliveryMethod);
//        return this;
//    }
//
//    public Calendar magnetCalendar(ShippingOptionsType deliveryMethod) {
//        setup(CalendarType.MAGNET, deliveryMethod);
//        return this;
//    }
}

//final class DeskCalendar extends Calendar {
//    public DeskCalendar(ShippingOptionsType deliveryMethod) {
//        super(CalendarType.DESK, deliveryMethod);
//    }
//}
//
//final class WallCalendar extends Calendar {
//    public WallCalendar(ShippingOptionsType deliveryMethod) {
//        super(CalendarType.WALL, deliveryMethod);
//    }
//}
//
//final class MagnetCalendar extends Calendar {
//    public MagnetCalendar(ShippingOptionsType deliveryMethod) {
//        super(CalendarType.MAGNET, deliveryMethod);
//    }
//}
