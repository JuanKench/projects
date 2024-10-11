import static org.junit.jupiter.api.Assertions.assertEquals;

class Rektangel implements Figure{
    public double Area(){
        double area = getArea();
        assertEquals(15, area);

        return area;
    }

    public double Circumfrence(){
        double circumfrence = getCircumfrence();
        return circumfrence;
    }
    int Length;
    int Width;
    public Rektangel(int Length, int Width){
        this.Length = Length;
        this.Width = Width;
    }
    @Override
    public double getArea() {
        return Width*Length;
    }

    @Override
    public double getCircumfrence() {
        return Width+Length;
    }
    public String toString(){
        return getArea();
    }
}
