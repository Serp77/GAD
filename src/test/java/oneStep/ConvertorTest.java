package oneStep;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertorTest {
    @Test
    public void when70RubleToEuroThen1() {
        Convertor testDate;
        testDate = new Convertor();
        int result = testDate.rubleToEuro(70);
        assertThat(result, is(1));
    }
}
