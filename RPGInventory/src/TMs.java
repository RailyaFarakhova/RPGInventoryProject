public class TMs extends Item{
    String name;
    int health;
    boolean used;

    public TMs(String name){
        this.name = name;
        String type = "tms";
        health = 100;
        used = false;

        super(name, type);
    }

    public boolean isUsed(){ return used;}

    public void use(){
        health = 0;
        used = true;
        System.out.println("\nWoah!\nSome Pokemon learned " + getName() + "!\nYou should be careful.\n");
    }
}
