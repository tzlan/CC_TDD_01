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

        return translations.size() == 0 && Objects.equals(this.name, "")  ;
        }





    public String getTranslation(String t) {
        if(translations.get(t)=="")
            return "Erreur de traduction ";

        else
        return translations.get(t);




    }




    public void addTranslation(String trans1, String trans2) {
        translations.put(trans1,trans2);
        translations.put(trans2,trans1);
    }


}
