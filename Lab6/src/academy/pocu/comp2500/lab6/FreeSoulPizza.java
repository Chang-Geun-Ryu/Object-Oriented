package academy.pocu.comp2500.lab6;

public class FreeSoulPizza extends Pizza {

    public FreeSoulPizza() {
        super(MenuPrice.FREE_SOUL_PIZZA);
    }

//    public boolean addTopping(Topping topping) {
//        if ((isMeat(topping) && this.meatCount >= MAX_MEAT_COUNT)
//                || (isVeggie(topping) && this.veggieCount >= MAX_VEGGIE_COUNT)
//                || (isCheese(topping) && this.isCheeseAdded)) {
//            return false;
//        }
//
//        super.addTopping(topping);
//
//        if (isMeat(topping)) {
//            ++this.meatCount;
//        }
//
//        if (isVeggie(topping)) {
//            ++this.veggieCount;
//        }
//
//        if (isCheese(topping)) {
//            this.isCheeseAdded = true;
//        }
//
//        return true;
//    }

//    public boolean removeTopping(Topping topping) {
//        boolean isRemoved = super.removeTopping(topping);
//
//        if (isRemoved) {
//            if (isMeat(topping)) {
//                --this.meatCount;
//            }
//
//            if (isVeggie(topping)) {
//                --this.veggieCount;
//            }
//
//            if (isCheese(topping)) {
//                this.isCheeseAdded = false;
//            }
//        }
//
//        return isRemoved;
//    }


}