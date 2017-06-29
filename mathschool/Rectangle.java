package mathschool;

public class Rectangle extends Shape {
    private double s1,s2;
    public Rectangle(double s1,double s2)
    {
        this.s1=s1; this.s2=s2;
    }
    @Override
    public double getArea()
    {
        return (s1*s2);
    }
    @Override
    public double getPerimeter()
    {
        return (s1+s2)*2;
    }
     @Override
        public String toString()
        {
            arealaw="Rectangle Area Law = side1*side2";
            perimeterlaw="Rectangle perimeter Law = 2*(side1+side2)";
            return arealaw+" ^^^ "+this.perimeterlaw;
        }
        @Override
        public String getShapeName()
        {
            return "Rectangle :";
        }
}
