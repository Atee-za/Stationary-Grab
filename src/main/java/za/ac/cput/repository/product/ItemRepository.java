package za.ac.cput.repository.product;

import za.ac.cput.entity.product.Item;

import java.util.LinkedList;
import java.util.List;

public class ItemRepository implements IItemRepository{
    private static ItemRepository repository = null;
    private List<Item> itemDB;

    private ItemRepository(){
        itemDB = new LinkedList<>();
    }

    public static ItemRepository getItemRepository(){
        if(repository == null) repository = new ItemRepository();
        return repository;
    }

    @Override
    public Item create(Item item) {
        itemDB.add(item);
        return item;
    }

    @Override
    public Item read(String itemId) {
        for(Item item : itemDB){
            if(item.getItemId().equalsIgnoreCase(itemId))
                return item;
        }
        return null;
    }

    @Override
    public Item update(Item item) {
        Item update = read(item.getItemId());
        if(update != null){
            itemDB.remove(update);
            itemDB.add(item);
            return item;
        }
        return null;
    }

    @Override
    public boolean delete(String itemId) {
        Item delete = read(itemId);
        if(delete != null){
            itemDB.remove(delete);
            return true;
        }
        return false;
    }

    @Override
    public List<Item> getAll() {
        return itemDB;
    }
}
