/*
 * Bath.java
 *
 * Created on 2009年4月1日, 下午12:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;



/**
 *
 * @author Owner
 */
public class Bath {
    
    /** Creates a new instance of Bath */
   private String s1="Happy",s2="Happy",s3,s4;
   private Soap castille;
   private int i;
   private float toy;
   public Bath()
   {
       System.out.println("Inside Bath()");
       s3="joy";
       toy=3.14f;
       castille=new Soap();
   }
   {i=47;}
   public String toString()
   {
       if(s4==null)
           s4="joy";
       return "s1="+s1+"\n"+"s2="+s2+"\n"+"s3="+s3+"\n"+"s4="+s4+"\n"+
               "i="+i+"\n"+"toy="+toy+"\n"+"castille="+castille;
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Bath bath=new Bath();
        System.out.println(bath);
        // TODO code application logic here
    }
    
}
class Soap
{
    private String s;
    Soap()
    {
        System.out.println("Soap()");
        s="Constructed";
    }
    public String toString()
    {
        return s;
    }
}