package academy.pocu.comp2500.lab3;
import java.util.ArrayList;
public class Program {

    public static void main(String[] args) {
        ListItem item1 = new ListItem("1");
        ListItem sublistItem1 = new ListItem("2");
        ListItem subSublistItem1 = new ListItem("3");
        ListItem subSublistItem2 = new ListItem("4");

        sublistItem1.addSublistItem(subSublistItem1);
        sublistItem1.addSublistItem(subSublistItem2);
        item1.addSublistItem(sublistItem1);

        String s = item1.toString();
        System.out.print(s);
//        s = sublistItem1.toString();
//        System.out.print(s);
    }

    private static String toString(ArrayList<ListItem> list) {
        StringBuilder sb = new StringBuilder();
        for (ListItem item : list) {
            sb.append(item);
        }

        return sb.toString();
    }
}
