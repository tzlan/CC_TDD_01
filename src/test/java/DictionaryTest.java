import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;



public class DictionaryTest {








    private Dictionary dict;

    @Test
    public void testDictionaryName() {
        dict = new Dictionary();
        assertThat(dict.getName(), equalTo("Example"));
    }






}
