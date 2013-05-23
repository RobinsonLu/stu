/*
 * CADsystem.java
 *
 * Created on 2009年4月25日, 下午5:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package thinking.in.java.code7;


/**
 *
 * @author Owner
 */
public class CADsystem extends Shape{
    
    /** Creates a new instance of CADsystem */
    private Circle c;
    private Triangle t;
    private Line[] lines=new Line[3];
    public CADsystem(int i) 
    {
        super(i+1);
        for(int j=0;j<lines.length;j++)
            lines[j]=new Line(j,j*j);
        c=new Circle(1);
        t=new Triangle(1);
        System.out.println("Combined constructor");
    }
    public void dispose()
    {
        t.dispose();
        c.dispose();
        for(int i=lines.length-1;i>=0;i--)
            lines[i].dispose();
        super.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CADsystem x=new CADsystem(47);
        try
        {
            
        }
        finally
        {
            x.dispose();
        }
        // TODO code application logic here
    }
    
}
class Shape
{
    Shape(int i){System.out.println("Shape constructor");}
    void dispose(){System.out.println("Shape dispose");}
}
class Circle extends Shape
{
    Circle(int i)
    {
        super(i);
        System.out.println("Drawing Circle");
    }
    void dispose()
    {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}
class Triangle extends Shape
{
    Triangle(int i)
    {
        super(i);
        System.out.println("Drawing Triangle");
    }
    void dispose()
    {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}
class Line extends Shape
{
    private int start,end;
    Line(int start,int end)
    {
        super(start);
        this.start=start;
        this.end=end;
        System.out.println("Drawing Line:"+start+","+end);
    }
    void dispose()
    {
        System.out.println("Erasing Line:"+start+","+end);
        super.dispose();
    }
}