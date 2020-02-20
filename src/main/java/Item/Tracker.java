package Item;
import javax.swing.*;
import java.util.*;

public class Tracker {
    private final Item[] items = new Item[100];    //Массив для хранения заявок.
    private int position = 0;    //Указатель ячейки для новой заявки

    public Item add(Item item) {//Метод добавления заявки в хранилище @param item новая заявка
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < items.length; index++) {
            Item it = items[index];
            if (it.getId().equals(id)) {
                result = it;
                break;
            }
        }
        return result;
    }

    public Item findByName(String name) {
        Item result = null;
        for (int index = 0; index < items.length; index++) {
            Item it = items[index];
            if (it.getName().equals(name)) {
                result = it;
                break;
            }
        }
        return result;
    }

   /* public Item findAll() {
        Item[] itemsWithOutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item it = items[index];
            if (it != null) {
                itemsWithOutNull[size] = it;
                size++;
            }
        }
        itemsWithOutNull = Arrays.copyOf(itemsWithOutNull, size);
        for (int index = 0; index < itemsWithOutNull.length; index++) {
            Item result = itemsWithOutNull[index]);


        }*/
    }
}
