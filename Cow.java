public class Cow extends Animal {
    @Override
    public String sound(){
        return "moo";
    }

    public void give_milk(){
        System.out.println("Thank you!!!");
    }
}