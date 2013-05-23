/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinking.in.java.code7;

/**
 *
 * @author Owner
 */
public class Hide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Bart b = new Bart();
        b.doh(1);
        b.doh('d');
        b.doh(1.0f);
        b.doh(new Milhouse());
    }

}
