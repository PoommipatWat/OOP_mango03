import java.io.Serial;

public class Pig extends Animal {
    @Override
    public String sound(){
        return "oink";
    }

    public void sleep_all_day(){
        System.out.println("Chillll");
    }
}