public class PokeBalls extends Item{
    String name;
    int health;
    boolean used;

    public PokeBalls(String name){
        this.name = name;
        String type = "poke balls";
        health = 100;
        used = false;

        super(name, type);
    }

    public void use(){
        health = 0;
        used = true;
        System.out.println("\nClick!\nYou've used " + getName() + "!\nYou didn't catch anything..\n");
    }
}
