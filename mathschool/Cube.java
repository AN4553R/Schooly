package mathschool;

public class Cube extends Shape {
    String volumelaw;
    private double side;
    public Cube(double side)
    {
        this .side=side;
    }
    @Override
    public double getArea()
    {
        return (6*side*side);
    }
    @Override
    public double getPerimeter()
    {
        return (12*side);
    }
    public double getVolume()
    {
        return side*side*side;
    }
     @Override
        public String toString()
        {
            arealaw="Cube area law = 6*side*side";
            volumelaw ="side*side*side";
            return arealaw+" ^^^ "+" ^^^ "+volumelaw;
        }
        @Override
        public String getShapeName()
        {
            return "Cube :";
        }
}
