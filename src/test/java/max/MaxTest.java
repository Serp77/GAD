package max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class MaxTest {
        @Test
        public void whenMax1To2Then2() {
            int result = Max.max(2, 2);
            assertThat(result, is(2));
        }
    }


