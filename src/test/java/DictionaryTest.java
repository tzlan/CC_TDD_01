import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.equalTo;


public class DictionaryTest {

    private Dictionary dict;
    private List<String> lists;


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

        @Test public void testaddTranslationMultiples() {


            dict.addTranslationMultiples("pour", List.of("for","to","towards"));
            dict.addTranslationMultiples("depuis", List.of("since"));
            assertThat(dict.getTranslationMultiple("pour"), equalTo(List.of("for","to","towards")));
            assertThat(dict.getTranslationMultiple("depuis"), equalTo(List.of("since")));

        }

   /* @Test
    public void testOneTranslationbis() {
        lists.add("hello");
        lists.add("word");
        dict.addTranslationMultiples("my", lists);
        assertThat(dict.getTranslationMultiple("contre"), equalTo(lists));
    }*/







}
