public abstract class Insurance
{
    String Type;
    double Cost;
    public Insurance(String LH)
    {
        Type = LH;
        Cost = 0;
    }
    public String getType()
    {
        return Type;
    }
    public double getCost()
    {
        return Cost;
    }
    public abstract void setCost();
    public abstract void display();
}