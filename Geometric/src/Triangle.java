public class Triangle extends GeometricFigure{
    private double area;
    public Triangle(int W, int H, String F){
        super (W,H,F);
    }

    @Override
    public double figureArea(int h, int w) {
        area = (double) (w*h*0.5);
        return area;
    }
}