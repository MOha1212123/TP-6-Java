package TP6;

import java.util.Map;
import java.util.TreeMap;
public class Classement_automatique {
    public static void main(String[] args){
    TreeMap<String, Integer> notes = new TreeMap<>();
    notes.put("Mohamed", 101);
    notes.put("Yassine", 121);
    notes.put("Aya", 19);
    System.out.println(notes);
    System.out.println("----------------------------------------------------");
    System.out.println(notes.firstKey());
    System.out.println("----------------------------------------------------");
    System.out.println(notes.lastKey());
    System.out.println("----------------------------------------------------");

    for(int m : notes.values()){
        if(m>100){
            //System.out.println(m);
            
        }
    }

    for (Map.Entry<String, Integer> e : notes.entrySet()) {
        if (e.getValue() > 100) {
            System.out.println(e.getKey());
        }
    }
   }
}
