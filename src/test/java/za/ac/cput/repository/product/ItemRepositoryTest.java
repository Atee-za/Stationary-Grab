package za.ac.cput.repository.product;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.product.Item;
import za.ac.cput.factory.product.ItemFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ItemRepositoryTest {

    private static ItemRepository repository = ItemRepository.getItemRepository();
    private Item book = ItemFactory.createItem("Advance SQL", "Cover all SQL skills needed in the industry",
            "Good",856.7);
    @Test
    void a_create() {
        Item created = repository.create(book);
        assertNotNull(created);
    }

    @Test
    void b_read() {
        assertEquals("Advanced SQl", repository.read(book.getItemId()));
    }

    @Test
    void c_update() {
        Item update = new Item.Builder().copy(book).itemName("SQL Master").build();
        Item x = repository.update(update);
        assertEquals(x.getItemId(), book.getItemId());
    }

    @Test
    void e_delete() {
        assertTrue(repository.delete(book.getItemId()));
    }

    @Test
    void d_getAll() {
        assertEquals(1, repository.getAll().size());
    }
}