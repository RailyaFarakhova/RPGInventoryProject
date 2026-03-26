public class Medicine extends Item{
    String name;
    int health;
    boolean used;

    public Medicine(String name){
        this.name = name;
        String type = "medicine";
        health = 100;
        used = false;

        super(name, type);
    }

    public void use(){
        if(health == 0){
            used = true;
        }else{
            health-=20;
        }
        System.out.println("\nYou've used " + getHealth() + "% of " + getName() + "!\n");
    }

}
