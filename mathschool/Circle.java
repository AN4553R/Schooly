package mathschool;

public class Circle extends Shape {
    
   protected double radius;
   
    public  Circle(double radius)
    { 
        this .radius=radius;
    }
    @Override
	public double getArea()
	{
                return (Math.PI*radius*radius);
	}
        @Override
	public double getPerimeter()
	{
                return (2*Math.PI*radius);
	}
        @Override
        public String toString()
        {
            arealaw="Circle Area Law = Pi*radius*radius";
            perimeterlaw="Circle perimeter Law = 2*Pi*radius";
            return arealaw+" ^^^ "+perimeterlaw;
        }
        @Override
        public String getShapeName()
        {
            return "Circle :";
        }
}