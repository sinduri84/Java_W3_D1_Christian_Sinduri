package Sinduri.A5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items("Item1", "Description1", 10));
        itemsList.add(new Items("Item2", "Description2", 5));
        itemsList.add(new Items("Item3", "Description3Description3Description3Description3", 7));
        Warehouse warehouseItem1 = new Warehouse();

        warehouseItem1.setItemsList(itemsList);

        Warehouse.printItems(warehouseItem1.getItemsList());
    }
}
