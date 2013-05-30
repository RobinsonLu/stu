/*
 * SprinklerSystem.java
 *
 * Created on 2009年4月1日, 下午12:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;



/**
 *
 * @author Owner
 */
public class SprinklerSystem {
    
    /** Creates a new instance of SprinklerSystem */
   private String value1,value2,value3,value4;
   private WaterSource source = new WaterSource();
   private int i;
   private float f;
   public String toString()
   {
       return "value1="+value1+" "+"value2="+value2+" "+"value3="+value3+" "+"value4="+value4+"\n"+
               "i="+i+" "+"f="+f+" "+"source="+source;
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);
        // TODO code application logic here
    }
    
}
class WaterSource
{
    private String s;
    WaterSource()
    {
        System.out.println("WaterSource()");
        s="Constructed";
    }
    public String toString()
    {
        return s;
    }
}
