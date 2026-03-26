import java.util.HashMap;

public class Storage {
    HashMap<Integer, Item> Items = new HashMap<>();
    HashMap<Integer, Item> PokeBalls = new HashMap<>();
    HashMap<Integer, Item> TMs = new HashMap<>();
    HashMap<Integer, Item> Berries = new HashMap<>();
    HashMap<Integer, Item> Medicines = new HashMap<>();
    HashMap<Integer, Item> KeyItems = new HashMap<>();

    int spaceAvailable;
    int totalSpace;
    int displaySpace = 14;
    int pattern = 92;
    int nameLength = 0;
    boolean open;

    protected Storage(int spaceAvailable){
        this.spaceAvailable = spaceAvailable;
        totalSpace = spaceAvailable;
        open = false;

        Items.put(0, null);
        PokeBalls.put(0, null);
        TMs.put(0, null);
        Berries.put(0, null);
        Medicines.put(0, null);
        KeyItems.put(0, null);
    }

    public void close(){
        open = false;
        System.out.println("\nThis bag is now closed.");
    }

    public int getSpace(){
        return totalSpace - spaceAvailable;
    }

    public void addItem(int slot, Item item){
        if(!open){
            System.out.println("\nYou can't add items when your bag is closed. Please open your bag.");
        }else {
            switch (item.getType().toUpperCase()) {
                case "ITEMS":
                    Items.put(slot, item);
                    break;
                case "POKE BALLS":
                    PokeBalls.put(slot, item);
                    break;
                case "TMS":
                    TMs.put(slot, item);
                    break;
                case "BERRIES":
                    Berries.put(slot, item);
                    break;
                case "MEDICINES":
                    Medicines.put(slot, item);
                    break;
                default:
                    KeyItems.put(slot, item);
                    break;
            }
        }
        --spaceAvailable;

        if(spaceAvailable == 0){
            System.out.println("You're out of space!");
        }
    }

    public void removeItem(int slot, Item item){
        if(!open){
            System.out.println("You can't remove items when your bag is closed. Please open your bag.");
        }else {
            switch (item.getType().toUpperCase()) {
                case "ITEMS":
                    Items.remove(slot, item);
                    break;
                case "POKE BALLS":
                    PokeBalls.remove(slot, item);
                    break;
                case "TMS":
                    TMs.remove(slot, item);
                    break;
                case "BERRIES":
                    Berries.remove(slot, item);
                    break;
                case "MEDICINES":
                    Medicines.remove(slot, item);
                    break;
                default:
                    KeyItems.remove(slot, item);
                    break;
            }
            // This is having a bug.
            ++spaceAvailable;
        }
    }

    public void empty(){
        Items.clear();
        PokeBalls.clear();
        TMs.clear();
        Berries.clear();
        Medicines.clear();
        KeyItems.clear();
        System.out.println("Your bag is now empty..");
        spaceAvailable = totalSpace;
    }

    public void open(){
        open = true;

        System.out.println("\nThis is your bag: ");
        for(int m = 1; m < pattern; m++) {
            System.out.print("_");
        }

        System.out.print("\nITEMS");
        for(int j = 1; j < displaySpace - 5; j++){
            System.out.print(" ");
        }
        System.out.print("POKE BALLS");
        for(int j = 1; j < displaySpace - 8; j++){
            System.out.print(" ");
        }
        System.out.print("TMS");
        for(int j = 1; j < displaySpace - 3; j++){
            System.out.print(" ");
        }
        System.out.print("BERRIES");
        for(int j = 1; j < displaySpace - 5; j++){
            System.out.print(" ");
        }
        System.out.print("MEDICINES");
        for(int j = 1; j < displaySpace - 8; j++){
            System.out.print(" ");
        }
        System.out.println("KEY ITEMS");

        for(Integer i : Items.keySet()){
            if(Items.get(i) == null){
                System.out.print(".");
                nameLength = 1;
            } else if(Items.get(i).isUsed()){
                addItem(i, new Item(".", "items"));
                System.out.print(Items.get(i).getName());
                nameLength = 1;
                removeItem(i, new Item(".", "items"));
            } else {
                String item = Items.get(i).getName();
                nameLength = item.length();
                System.out.print(item);
            }
        }
        for(int k = 1; k < displaySpace-nameLength; k++){
            System.out.print(" ");
        }
        for(Integer i : PokeBalls.keySet()){
            if(PokeBalls.get(i) == null){
                System.out.print(".");
                nameLength = 1;
            } else if(PokeBalls.get(i).isUsed()){
                addItem(i, new Item(".", "poke balls"));
                System.out.print(PokeBalls.get(i).getName());
                nameLength = 1;
                removeItem(i, new Item(".", "items"));
            } else {
                String item = PokeBalls.get(i).getName();
                nameLength = item.length();
                System.out.print(item);
            }
        }
        for(int k = 1; k < (displaySpace+2)-nameLength; k++){
            System.out.print(" ");
        }
        for(Integer i : TMs.keySet()){
            if(TMs.get(i) == null){
                System.out.print(".");
                nameLength = 1;
            } else if(TMs.get(i).isUsed()){
                addItem(i, new Item(".", "tms"));
                System.out.print(TMs.get(i).getName());
                nameLength = 1;
                removeItem(i, new Item(".", "items"));
            } else {
                String item = TMs.get(i).getName();
                nameLength = item.length();
                System.out.print(item);
            }
        }
        for(int k = 1; k < displaySpace-nameLength; k++){
            System.out.print(" ");
        }
        for(Integer i : Berries.keySet()){
            if(Berries.get(i) == null){
                System.out.print(".");
                nameLength = 1;
            } else if(Berries.get(i).isUsed()){
                addItem(i, new Item(".", "berries"));
                System.out.print(Berries.get(i).getName());
                nameLength = 1;
                removeItem(i, new Item(".", "items"));
            } else {
                String item = Berries.get(i).getName();
                nameLength = item.length();
                System.out.print(item);
            }
        }
        for(int k = 1; k < (displaySpace+2)-nameLength; k++){
            System.out.print(" ");
        }
        for(Integer i : Medicines.keySet()){
            if(Medicines.get(i) == null){
                System.out.print(".");
                nameLength = 1;
            } else if(Medicines.get(i).isUsed()){
                addItem(i, new Item(".", "medicines"));
                System.out.print(Medicines.get(i).getName());
                nameLength = 1;
                removeItem(i, new Item(".", "items"));
            } else {
                String item = Medicines.get(i).getName();
                nameLength = item.length();
                System.out.print(item);
            }
        }
        for(int k = 1; k < (displaySpace+1)-nameLength; k++){
            System.out.print(" ");
        }
        for(Integer i : KeyItems.keySet()){
            if(KeyItems.get(i) == null){
                System.out.print(".");
                nameLength = 1;
            }else if(KeyItems.get(i).isUsed()){
                addItem(i, new Item(".", "key items"));
                System.out.print(KeyItems.get(i).getName());
                nameLength = 1;
                removeItem(i, new Item(".", "items"));
            } else {
                String item = KeyItems.get(i).getName();
                nameLength = item.length();
                System.out.print(item);
            }
        }
        for(int k = 1; k < displaySpace-nameLength; k++){
            System.out.print(" ");
        }
        System.out.println();
        for(int m = 1; m < pattern; m++){
            System.out.print("_");
        }

        int spaceUsed = totalSpace - spaceAvailable;
        System.out.println(spaceAvailable);
        System.out.println("\nSPACE USED: " + spaceUsed + "/" + totalSpace);
    }


}
