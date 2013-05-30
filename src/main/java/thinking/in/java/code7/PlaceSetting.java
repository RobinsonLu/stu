/*
 * PlaceSetting.java
 *
 * Created on 2009年4月25日, 下午2:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;



/**
 *
 * @author Owner
 */
public class PlaceSetting extends Custom{
    
    /** Creates a new instance of PlaceSetting */
    private Spoon sp;
    private Fork fk;
    private Knife kn;
    private DinnerPlate pl;
    
    public PlaceSetting(int i) 
    {
        super(i+1);
        sp=new Spoon(i+2);
        fk=new Fork(i+3);
        kn=new Knife(i+4);
        pl=new DinnerPlate(i+6);
        System.out.println("PlaceSetting constructor");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlaceSetting x=new PlaceSetting(9);
        // TODO code application logic here
    }
    
}
class Custom
{
    Custom(int i){System.out.println("Custom constructor");}
}
class Plate
{
    Plate(int i){System.out.println("Plate constructor");}
}
class DinnerPlate extends Plate
{
    DinnerPlate(int i)
    {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}
class Utensil
{
    Utensil(int i){System.out.println("Utensil constructor");}
}
class Spoon extends Utensil
{
    Spoon(int i)
    {
        super(i);
        System.out.println("Spoon constructor");
    }
}
class Fork extends Utensil
{
    Fork(int i)
    {
        super(i);
        System.out.println("Fork constructor");
    }
}
class Knife extends Utensil
{
    Knife(int i)
    {
        super(i);
        System.out.println("Knife constructor");
    }
}