public class Car extends Vehicle{
public int accelerate(int accelertion){
    setSpeed(getSpeed()+accelertion);
    System.out.println("speed"+getSpeed());
    return getSpeed();
}

}
