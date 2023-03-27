/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_protected;

/**
 *
 * @author invitado
 */
public class EVA2_16_PROTECTED {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SuperClase objSuper=new SuperClase();
        
        objSuper.dato=100;
        //se puede ver a nivel de paquete
    }
}

//protected te permite tener visibilidad entre las clases heredadas
class SuperClase{
    protected int dato;
}

class SubClase extends SuperClase{
    public void impDato(){
        System.out.println("Dato: "+dato);
    }
}