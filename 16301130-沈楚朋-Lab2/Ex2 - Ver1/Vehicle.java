public class Vehicle
{
    public double load;
    public double maxLoad;
    public Vehicle(double maxLoad)
    {
        this.maxLoad=maxLoad;
    }
    public void getLoad(double load)
    {
        this.load=load;
    }
    public void getMaxLoad(double maxLoad)
    {
        this.maxLoad=maxLoad;
    }
}
