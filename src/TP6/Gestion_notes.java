package TP6;

import java.util.HashMap;

public class Gestion_notes {
    public static void main(String[] args){

    HashMap<String, Double> notes = new HashMap<>();
    notes.put("Ahmed", 10.1);
    notes.put("Kamal", 14.5);
    notes.put("Maryam", 19.1);
    notes.put("Yassine", 12.5);

    System.out.println(notes);
    System.out.println("-------------------------------------------");

    String nom = "Ahmed"; // étudiant à rechercher

        if (notes.containsKey(nom)) {
            System.out.println("la note de " + nom + " est : " + notes.get(nom));
        } else {
            System.out.println("Etudiant non trouve");
        }

        notes.put("Kamal", 20.1);

        System.out.println(notes);
        notes.remove("Maryam");
        System.out.println("-------------------------------------------");
        System.out.println(notes);
        System.out.println("-------------------------------------------");
         double somme=0;
        for (double note : notes.values()) {
            somme += note;
        }
        double moyenne = (double) somme / notes.size();

        System.out.println("-------------------------------------------");
        System.out.println("La moyenne est : " + moyenne);




    }

}
