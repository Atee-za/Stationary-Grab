package za.ac.cput.repository.product;

import za.ac.cput.entity.product.Item;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IItemRepository extends IRepository<Item, String> {
    List<Item> getAll();
}
