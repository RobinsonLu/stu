/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinking.in.java.code7;

/**
 *
 * @author Owner
 */
public class Car
{
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(),right = new Door();
    public Car()
    {
        for(int i=0;i<4;i++)
        {
            wheel[i] = new Wheel();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Car car = new Car();
        car.left.window.rolddown();
        car.wheel[0].inflate(71);
    }
}
