package Item;

import org.hamcrest.core.Is;
import org.junit.Test;
//import static org.hamcrest.Matchers.is;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenAddNewItemThenTrackerHasSameItem1() {
        Tracker tracker = new Tracker();
        Item item = new Item("ошибка от Пети");
        Item item1 = new Item("ошибка от Сережи");
        Item item2 = new Item("ошибка от Егора");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        Item result = tracker.findById(item2.getId());
        assertThat(result.getName(), is(item2.getName()));
    }
    @Test
    public void whenAddNewItemNooo() {
        Tracker tracker = new Tracker();
        Item item = new Item("ошибка от Пети");
        Item item1 = new Item("ошибка от Сережи");
        Item item2 = new Item("ошибка от Егора");
        Item item3 = new Item("error");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        Item error = null;
        Item result = tracker.findById(item3.getId());
        assertThat((result.getName()), is(error));
    }
    @Test
    public void Name() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findByName(item.getName());
        assertThat(result.getId(), is(item.getId()));
    }
    /*@Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("ошибка от Пети");
        Item item1 = new Item("ошибка от Сережи");
        Item item2 = new Item("ошибка от Егора");
        Item item3 = new Item();
        Item item4 = new Item();
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);*/
}

