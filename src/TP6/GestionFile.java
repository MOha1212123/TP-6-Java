package TP6;

import java.util.LinkedList;

public class GestionFile {
    protected int Numero;
    protected String Nom;

    public GestionFile(int Numero, String Nom){
        this.Numero=Numero;
        this.Nom=Nom;
    }
    public String toString() {
        return Numero + " - " + Nom;
    }

    public static void main(String[] args){

        LinkedList<GestionFile> liste= new LinkedList<>();
        liste.add(new GestionFile(1, "Ayman"));
        liste.add(new GestionFile(2, "Ahmed"));
        liste.add(new GestionFile(3, "Kamal"));

        for (GestionFile nom : liste) {
            System.out.println(nom);
        }

        GestionFile servi = liste.poll(); 
        System.out.println("Servi: " + servi);

        
        liste.addLast(new GestionFile(32, "Yassmin"));

        System.out.println("Premier: " + liste.peek());





    }
}
