package se.sigmatechnology.codingdojo.ddd02.r2operational;

import java.util.List;

public class Order extends AggregateRoot {
    public List<OrderItem> items;
}
