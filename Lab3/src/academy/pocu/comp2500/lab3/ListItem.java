package academy.pocu.comp2500.lab3;

import java.util.ArrayList;

final public class ListItem {
    private String text;
    private ArrayList<ListItem> sublistItems;
    private char bulletStyle;

    public ListItem(String text) {
        this.text = text;
        this.bulletStyle = '*';
        this.sublistItems = new ArrayList<>();
    }

    public ListItem(String text, char bulletStyle) {
        this(text);
        this.bulletStyle = bulletStyle;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setBulletStyle(char bulletStyle) {
        this.bulletStyle = bulletStyle;
    }
    public char getBulletStyle() {
        return this.bulletStyle;
    }

    public void addSublistItem(ListItem sublistItems) {
        this.sublistItems.add(sublistItems);
    }

    public void removeSublistItem(int index) {
        sublistItems.remove(index);
    }

    public ListItem getSublistItem(int index) {
        return this.sublistItems.get(index);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append(this.bulletStyle);
        s.append(" ");
        s.append(this.text);
        s.append(System.lineSeparator());
        sublistItems.forEach(e -> {
            s.append("\t");
            s.append(e.toString());
        });

        System.out.print(s);
        System.out.println("------)");
        return s.toString();
    }
}
