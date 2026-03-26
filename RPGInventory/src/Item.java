public class Item {
    String name;
    String type;
    int health;
    boolean used;

    protected Item(String name, String type){
        this.name = name;
        this.type = type;
        used = false;
        health = 100;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public boolean isUsed(){ return used;}

    public int getHealth(){
        return health;
    }

    public void use(){
        health = 0;
        used = true;
        System.out.println("\nYou've used " + getName() + "!\n");
    }
}
