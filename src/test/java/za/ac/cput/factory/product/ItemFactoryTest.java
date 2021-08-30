package za.ac.cput.factory.product;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.product.Item;

import static org.junit.jupiter.api.Assertions.*;

class ItemFactoryTest {

     @Test void test_create(){
         Item laptop = ItemFactory.createItem("Lenovo", "Memory 4 GB, Storage 500 GB", "Good",5412);
         assertNotNull(laptop);
         assertEquals("Good", laptop.getCondition());
     }
}