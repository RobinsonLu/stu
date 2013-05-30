/*
 * Chess.java
 *
 * Created on 2009年4月25日, 下午1:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;



/**
 *
 * @author Owner
 */
public class Chess extends BoardGame{
    
    /** Creates a new instance of Chess */
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chess x=new Chess();
        // TODO code application logic here
    }
    
}
class BoardGame extends Game
{
    BoardGame(int i)
    {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
class Game
{
    Game(int i)
    {
        System.out.println("Game constructor");
    }
}