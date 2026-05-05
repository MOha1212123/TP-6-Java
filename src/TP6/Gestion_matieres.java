package TP6;

import java.util.HashSet;
import java.util.TreeSet;

public class Gestion_matieres {
    public static void main(String[] args){
        HashSet<String> matieres = new HashSet<>();

        matieres.add("Math");
        matieres.add("Francais");
        matieres.add("Arabic");

        for (String nom : matieres) {
            if (matieres.add(nom)) {
                System.out.println("Doublon detecte : " + nom);
            }else{
                System.out.println(" aucun Doublon  " );

            }
        }
        System.out.println("Contenu final : " + matieres);

        TreeSet<String> matieresTriees = new TreeSet<>(matieres);

        System.out.println("Matieres triees :");
        for (String m : matieresTriees) {
            System.out.println(m);
        }
    }

}
