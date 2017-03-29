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
public class Plateau implements Cloneable {

   
    private Piece[][] tabPiece;
    
    public boolean libere(Point p){
        boolean res= false;
        return res;
    }
    
    
   
    public Object clone() throws CloneNotSupportedException{
        Object o = null;
        try{
            o=super.clone();
        }catch(CloneNotSupportedException cnse){
            cnse.printStackTrace(System.err);
        }
        return o;
    }
    
}
