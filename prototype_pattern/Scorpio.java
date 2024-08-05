import java.io.IOException;

public class Scorpio implements IprotoTypeScorpio, Cloneable{
    private scorpioEngine ScorpioEngine;

    public Scorpio()
    {
        this.ScorpioEngine = new scorpioEngine();
    }

    private Scorpio(scorpioEngine engine)
    {
        this.ScorpioEngine = new scorpioEngine(engine);
    }

    @Override
    public IprotoTypeScorpio clone()
    {
        //return new Scorpio();
        IprotoTypeScorpio cloneScorpio = new Scorpio(this.ScorpioEngine);
        return cloneScorpio;
        
    }

    @Override
    public void start()
    {
        System.out.println("Car started");
    }

    @Override
    public void stop()
    {
        System.out.println("Car Stopped");
    }

    @Override
    public void setEngine(scorpioEngine engine)
    {
        this.ScorpioEngine = engine;
    }

}
