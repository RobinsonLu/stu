/*
 * Cartoon.java
 *
 * Created on 2009年4月25日, 下午1:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;



/**
 *
 * @author Owner
 */
public class Cartoon extends Drawing {
    
    /** Creates a new instance of Cartoon */
    /*
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cartoon x =new Cartoon();
        // TODO code application logic here
    }
    
}
class Drawing extends Art
{
    Drawing(){System.out.println("Drawing constructor");}
}
class Art
{
    Art(){System.out.println("Art constructor");}
}