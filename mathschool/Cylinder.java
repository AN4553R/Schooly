package mathschool;

public class Cylinder extends Circle {
    private double height;
    String wholearea,sidearea,volumelaw;
    public Cylinder(double radius,double height)
    {
        super(radius);
        this.height=height;
    }
    @Override
     public double getArea()
     {
         return 2*Math.PI*radius*(radius+height);
     }
    public double getVolume()
    {
        return Math.PI*radius*radius*height;
    }
     @Override
        public String toString()
        {
             volumelaw ="side*side*side";
             wholearea="Cylinder whole area law = 2*Pi*radius*(radius+height)";
             sidearea="Cylinder side area law = 2*Pi*radius*radius";
            return sidearea+" ^^^ "+wholearea+" ^^^ "+volumelaw;
        }
        @Override
        public String getShapeName()
        {
            return "Cylinder :";
        }
}