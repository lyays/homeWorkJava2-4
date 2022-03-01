package java2hw.hw4;

import java.util.HashMap;
import java.util.Map;

public class WordList {
    private String [] arrayWordList;

    public WordList(String[] arrayWordList) {
        this.arrayWordList = arrayWordList;
    }

    public void doArrayWordList() {
        HashMap<String,Integer> mapWordList = getMapWordList(arrayWordList);
        for (Map.Entry entry: mapWordList.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private HashMap<String, Integer> getMapWordList(String[] arrayWordList) {
        HashMap<String, Integer> mapWordList = new HashMap<>();
        for (int i = 0; i < arrayWordList.length; i++) {
            if (mapWordList.containsKey(arrayWordList[i])) {
                mapWordList.put(arrayWordList[i], mapWordList.get(arrayWordList[i]) + 1);
            }
            else {
                mapWordList.put(arrayWordList[i],1);
            }
        }
        return mapWordList;
    }
}


