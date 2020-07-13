package Sinduri.A5;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Items> itemsList = new ArrayList<>();

    public Warehouse() {
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public static void printItems(List<Items> itemsList) {
        System.out.printf("%-16s %-64s %-16s %n", "Item Name", "Item Description", "Item Quantity");
        for (Items item: itemsList) {
            System.out.printf("%-16s %-64s %-16d %n", item.getItemName(), item.getItemDescription(), item.getItemQuantity());
        }

    }
}
