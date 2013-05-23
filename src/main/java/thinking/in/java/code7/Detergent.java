/*
 * Detergent.java
 *
 * Created on 2009年4月25日, 下午12:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;



/**
 *
 * @author Owner
 */
public class Detergent extends Cleanser{
    
    /** Creates a new instance of Detergent */
    public void scrud()
    {
        append("Detergent.scrub()");
        super.scrub();
    }
    public void foam()
    {
        append("foam()");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Detergent x=new Detergent();
        x.dilute();
        x.apply();
        x.scrud();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
        // TODO code application logic here
    }
    
}
class Cleanser
{
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append(" dilute() ");}
    public void apply(){append(" apply ");}
    public void scrub(){append(" scrub ");}
    public String toString(){return s;}
    public static void main(String[] args)
    {
        Cleanser x=new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}