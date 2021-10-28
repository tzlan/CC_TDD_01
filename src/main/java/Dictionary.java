import java.util.*;

public class Dictionary {

    private String name;
    private String translate1;
    private String translate2;
    private HashMap<String, List<String>> translationsMultiples;
    private final Map<String, List<String>> translations;




    public Dictionary(String name) {
        this.name = name;
        this.translations = new HashMap<String, List<String>>();
    }

    String getName() {
        return this.name;
    }

    public boolean isEmpty() {

        return translations.size() == 0 && Objects.equals(this.name, "")  ;
    }

    public void addTranslation(String t1, String t2) {
        // translations.put(t1,listTrad);
        if(getTranslation(t1)==null)
        {
            ArrayList<String> listTrad=new ArrayList<>();
            listTrad.add(t2);
            translations.put(t1,listTrad);
        }
        else
        {
            translations.get(t1).add(t2);
        }

    }




    public List<String> getTranslation(String t) {
        return (List<String>) translations.get(t);
    }
    public List getTranslationMultiple(String parm) {
        return translationsMultiples.get(parm);
    }

    public void addTranslationMultiples(String parm, List<String> lists) {
        translationsMultiples.put(parm, lists);

    }




}




