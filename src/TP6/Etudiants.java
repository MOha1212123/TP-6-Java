package TP6;

import java.util.*;

public class Etudiants {

    protected int Id;
    protected String Nom;
    protected double Moyenne;

    public Etudiants(int Id, String Nom, double Moyenne){
        this.Id=Id;
        this.Nom=Nom;
        this.Moyenne=Moyenne;
    }

    public String toString() {
        return Id + " - " + Nom + " - " + Moyenne;
    }

    public static void main(String[] args) {

    ArrayList<Etudiants> list = new ArrayList<>();
    list.add(new Etudiants(1,"Aya",22));
    list.add(new Etudiants(2,"Mohamed",23));
    list.add( new Etudiants(3,"Ayoub",90));
    list.add(new Etudiants(4,"Maryam",34));
    list.add(new Etudiants(5,"Sara",254));
    
    for (Etudiants e: list) { System.out.println(e); }
    
    String search = "Sara";
        for (Etudiants e : list) {
            if (e.Nom.equalsIgnoreCase(search)) {
                System.out.println("Trouve: " + e);
            }
        }

    int idToRemove = 3;
    for (Etudiants e : list) {
        if (e.Id == idToRemove) {
            list.remove(e);
            break; 
        }
    }
    
    list.sort(Comparator.comparingDouble(e -> e.Moyenne));

    Etudiants best = list.get(0);
    for (Etudiants e : list) {
        if (e.Moyenne > best.Moyenne) {
            best = e;
        }
    }

    System.out.println("Meilleur etudiant: " + best); 
} }
