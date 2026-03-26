public class KeyItem extends Item{
    String name;
    int health;
    boolean used;

    public KeyItem(String name){
        this.name = name;
        String type = "key item";
        health = 100;
        used = false;

        super(name, type);
    }
    public boolean isUsed(){ return used;}

    public void use(){
        health = 0;
        used = true;
        System.out.println("\n**.*` You've used " + getName() + "!\n      I wonder what it did.. `*.**\n");
    }
}
