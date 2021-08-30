package za.ac.cput.factory.product;

import za.ac.cput.entity.product.Item;
import za.ac.cput.util.GenericHelper;

public class ItemFactory {

    public static Item createItem(String itemName, String itemDetails, String condition,
                                  double itemPrice){
        if(GenericHelper.isEmptyOrNull(itemName) || GenericHelper.isEmptyOrNull(itemDetails) || GenericHelper.isEmptyOrNull(condition) || itemPrice < 1)
            return new Item.Builder().build();
        String itemId = GenericHelper.generateId();
        return new Item.Builder().itemId(itemId).itemName(itemName).itemDetails(itemDetails).condition(condition)
                .itemPrice(itemPrice).isSold(false).build();
    }
}
