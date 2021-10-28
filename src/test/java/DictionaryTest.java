import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;


public class DictionaryTest {

    private Dictionary dict;


        @BeforeEach
        public void initialize () {
            dict = new Dictionary("");

        }

        @Test
        public void testDictionaryName() {
            assertThat(dict.getName(), equalTo(""));
        }

        @Test
        public void testEm(){
            assertThat(dict.isEmpty(), equalTo(true));
        }

        @Test public void testOneTranslation() {
            dict.addTranslation("contre", "against");
            assertThat(dict.getTranslation("contre"), equalTo("against"));

        }

        @Test public void testOneBisTranslation() {
            dict.addTranslation("against", "contre");
            assertThat(dict.getTranslation("against"), equalTo("contre"));
        }


}
