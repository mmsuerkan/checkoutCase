package com.project.interfaces;

import com.project.exception.ChartEmptyException;
import com.project.model.item.Item;

public interface CartInterface {
    boolean addItem(Item item);
    boolean removeItem(int itemId) throws ChartEmptyException;
    void resetCart();
    void applyPromotions();
    String displayCart();
}
