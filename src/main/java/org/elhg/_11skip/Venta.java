package org.elhg._11skip;

import java.time.Month;

public class Venta {
    private Month month;
    private Double total;

    public Venta(Month month, Double total) {
        this.month = month;
        this.total = total;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "month=" + month +
                ", total=" + total +
                '}';
    }
}
