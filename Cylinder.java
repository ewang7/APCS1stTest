
/**
 * Write a description of class Cylinder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cylinder extends Shape
{
    private double radius; 
    private double height;
   //----------------------------------
   //  Constructor: Sets up the cylinder.
   //----------------------------------
   public Cylinder(double r, double h)
   {  
      super("Cylinder");
      radius = r;
      height = h;
   }

   //-----------------------------------------
   //  Returns the surface area of the cylinder.
   //-----------------------------------------
   public double area()
   {
       return (Math.PI*(radius)*(radius) + 2*Math.PI*(radius)*height);
   }

   //-----------------------------------
   //  Returns the cylinder as a String.
   //----------------------------------- 
   public String toString()
   {
       return super.toString() + " of radius " + radius + " and height " + height;
   }

}
