public class Life extends Insurance
{
    public Life()
    {
        super("Life Insurance");
        setCost();
    }
    public void setCost()
    {
        this.Cost = 36;
    }
    public void display()
    {
        System.out.println(Type + "Cost per month: $" + String.format("%.2f",this.getCost()));
    }
}
