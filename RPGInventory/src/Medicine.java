public class Medicine extends Item{
    String name;
    int health;
    boolean used;

    public Medicine(String name){
        this.name = name;
        String type = "medicines";
        health = 100;
        used = false;

        super(name, type);
    }
    public boolean isUsed(){ return used;}

    public int getHealth(){
        System.out.println("\nYou have " + health + "% of " + getName() + " remaining!\n");
        return health;
    }

    public void use(){
        if(health == 0){
            used = true;
        }else{
            health = health - 20;
        }
        getHealth();
    }

}
