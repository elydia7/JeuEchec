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
public class Piece extends Pion {
    public Piece(){
        
    }
    public Point[] getPos(Coup coup){
        
    }
    public boolean getDisValide(Coup coup){
        
    }
    public void appliquerCoup(Coup coup){
        
    }
    public boolean coupValide(Coup coup){
        if(getDisValide(coup)){
            for(Point p:getPos(coup)){
                if(!plateu.libere())
            }
        }
        
        
    }
    
}
