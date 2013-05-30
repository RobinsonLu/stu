/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinking.in.java.code8;

/**
 *
 * @author Owner
 */
public class Music {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Wind wind = new Wind();
        tune(wind);
    }
    public static void tune(Instrument i)
    {
        i.play(Note.b_flat);
    }
}
