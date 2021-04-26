public class Square extends GeometricFigure{
    private double area;
    public Square(int W,int H, String F){

        super(W,H,F);
    }

    @Override
    public double figureArea(int h, int w) {
        return w*h;
    }
}