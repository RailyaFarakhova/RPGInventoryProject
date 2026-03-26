public class Backpack extends Storage{
    int totalSpace;
    boolean open;

    public Backpack(){
        int spaceAvailable = 50;
        totalSpace = spaceAvailable;
        open = false;

        super(spaceAvailable);
    }
}
