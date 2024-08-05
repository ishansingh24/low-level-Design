public class client {
    public static void main(String[] args) {
        IprotoTypeScorpio prototype = new Scorpio();
        IprotoTypeScorpio ScorpioN = prototype.clone();
        ScorpioN.setEngine(new ScorpioNengine());
        ScorpioN.start();
        ScorpioN.stop();

        IprotoTypeScorpio Scorpioclassic = prototype.clone();
        Scorpioclassic.setEngine(new ScorpioclassicEngine());
        Scorpioclassic.start();
        Scorpioclassic.stop();
        
    }
}
