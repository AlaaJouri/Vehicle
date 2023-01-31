public class Bicycle extends Vehicle{
public int accelerate(int accelertion)
{
    if (getSpeed()<35)
    {
        setSpeed(getSpeed()+accelertion);
    }
    else {
        System.out.println("Fehlerrr");
    }
    System.out.println("speed"+getSpeed());
    return getSpeed();
}
}

