import java.util.List;

public class CountItemsMatching {
    public static void main(String[] args) {

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++){
            for (int j = 0; j < items.get(i).size(); j++){
                if (ruleKey == "type"){
                    if (items.get(i).get(j) == "ruleValue"){
                        count++;
                    }
                }
                if (ruleKey == "color"){
                    if (items.get(i).get(j) == "ruleValue"){
                        count++;
                    }
                }
                if (ruleKey == "name"){
                    if (items.get(i).get(j) == "ruleValue"){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
