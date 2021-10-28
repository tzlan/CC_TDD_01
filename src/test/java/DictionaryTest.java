import org.junit.jupiter.api.Test;
import org.junit.*;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;



public class DictionaryTest {

    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }
}
