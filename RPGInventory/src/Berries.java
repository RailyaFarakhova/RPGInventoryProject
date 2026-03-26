public class Berries extends Item{
    String name;
    String stat;
    int health;
    boolean used;

    public Berries(String name){
        this.name = name;
        String type = "berries";
        health = 100;
        used = false;

        super(name, type);
    }

    public void getStat(){
        switch(name.toUpperCase()){
            case "CHERI BERRY":
                stat = "recover paralysis";
                break;
            case "CHESTO BERRY":
                stat = "recover sleep";
                break;
            case "PECHA BERRY":
                stat = "recover poison";
                break;
            case "RAWST BERRY":
                stat = "recovers burn";
                break;
            case "ASPEAR BERRY":
                stat = "defrosts";
                break;
            case "LEPPA BERRY":
                stat = "restores a move's PP by 10";
                break;
            case "ORAN BERRY":
                stat = "heals by 10 HP";
                break;
            case "PERSIM BERRY":
                stat = "recovers confusion";
                break;
            case "LUM BERRY":
                stat = "recovers status problem";
                break;
            default:
                stat = null;
                break;
        }
        if(stat == null){
            System.out.println("\nI don't know this berry :(");
        } else{
            System.out.println("\nThe " + name + " will " + stat + "!!");
        }
    }

    public boolean isUsed(){ return used;}

    public void use(){
        health = 0;
        used = true;
        System.out.println("\n*Crunch Crunch*\nYou ate a " + getName());
        getStat();
    }
}
