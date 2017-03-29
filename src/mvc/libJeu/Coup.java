/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.libJeu;

/**
 *
 * @author eludia
 */
public class Coup {
    private Point debut, fin;

    public void setDebut(Point debut) {
        this.debut = debut;
    }

    public void setFin(Point fin) {
        this.fin = fin;
    }

    public Point getDebut() {
        return debut;
    }

    public Point getFin() {
        return fin;
    }
    
    public boolean getEtatCoup(){
        boolean res = false;
        return res;
    }
    
}
