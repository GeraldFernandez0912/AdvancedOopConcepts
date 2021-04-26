public abstract class GeometricFigure {
    int Height;
    int Width;
    String Figure;

    public GeometricFigure(int H,int W, String F){

        this.Height=H;
        this.Width=W;
        this.Figure=F;

    }
    public int getHeight(){
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public String getFigure() {
        return Figure;
    }
    public abstract  double figureArea(int h, int w);
}