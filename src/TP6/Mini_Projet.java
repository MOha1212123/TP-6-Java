package TP6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class  Mini_Projet{
    protected String Titre;
    protected String Auteur;
    protected int ISBN;
    protected int Annee;
    public Mini_Projet(String Titre, String Auteur, int ISBN, int Annee){
        this.Titre=Titre;
        this.Auteur=Auteur;
        this.ISBN=ISBN;
        this.Annee=Annee; 
    }
    public String toString() {
        return Titre + " - " + Auteur + " - " + ISBN + " - " + Annee;
    }

    public static void main(String[] args){

    ArrayList<Mini_Projet> list = new ArrayList<>();
    list.add(new Mini_Projet("Newcasle", "Alex", 1200, 2000));
    list.add(new Mini_Projet("Arsenal", "Garcia", 2300, 2025));
    list.add(new Mini_Projet("Atlatico", "Simoine", 3000, 2008));

    HashSet<String> categories = new HashSet<>();
    categories.add("Informatique");
    categories.add("Réseaux");
    categories.add("Programmation");

    HashMap<String, Mini_Projet> emprunts = new HashMap<>();

    System.out.println("Recherche:");
    for (Mini_Projet l : list) {
         if (l.ISBN == 1200) {
            System.out.println("Livre trouve: " + l);
        }
    }

    list.removeIf(l -> l.ISBN == 2300);
    System.out.println("\nApres suppression:");

    for (Mini_Projet l : list) {
        System.out.println(l);
    }

    emprunts.put("Ahmed", list.get(0));

    System.out.println("\nEmprunts:");
    for (String nom : emprunts.keySet()) {
        System.out.println(nom + " -> " + emprunts.get(nom));
    }

    System.out.println("\nRapport:");
    System.out.println("Nombre de livres: " + list.size());
    System.out.println("Nombre de categories: " + categories.size());
    System.out.println("Nombre demprunts: " + emprunts.size());


    }
}
