package academy.pocu.comp2500.lab4;

import java.time.OffsetDateTime;

public class Entry {
    private OffsetDateTime createTime;
    private OffsetDateTime usingTime;
    private int usingOrder;
    private String value;

    public Entry(String value) {
        this.createTime = OffsetDateTime.now();
        this.usingTime = this.createTime;
        this.value = value;
        this.usingOrder = 0;
    }

    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public OffsetDateTime getUsingTime() {
        return usingTime;
    }

    public int getUsingOrder() {
        return this.usingOrder;
    }

    public void updateOrder() {
        this.usingOrder++;
    }

    public String getValue() {
        this.usingOrder = 0;
        this.usingTime = OffsetDateTime.now();
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
        this.usingTime = OffsetDateTime.now();
        this.usingOrder = 0;
    }
}