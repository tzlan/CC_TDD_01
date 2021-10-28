import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dictionary {

    private String name;
    private String translate1;
    private String translate2;
    Map<String, String> translations;

    public Dictionary(String name) {
        this.name = name;
        this.translations = new HashMap<>();
    }

    String getName() {
        return this.name;
    }

    public boolean isEmpty() {
        return Objects.equals(this.name, "");
    }


    public void addTranslation(String t1, String t2) {
        translate1 = t1;
        translate2 = t2;
    }


    public String getTranslation(String t) {
        if(Objects.equals(this.translate1, t))return this.translate2;
        if(Objects.equals(this.translate1, t))return this.translate1;

        return "against"; //FAKE IT


    }
    public String getTranslationbis(String t) {

        if(Objects.equals(this.translate1, t))return this.translate2;
        if(Objects.equals(this.translate1, t))return this.translate1;

        return "contre"; //FAKE IT


    }


}
