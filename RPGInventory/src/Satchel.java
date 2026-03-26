public class Satchel extends Storage{
    int totalSpace;
    boolean open;

    public Satchel(){
        int spaceAvailable = 35;
        totalSpace = spaceAvailable;
        open = false;

        super(spaceAvailable);
    }
}
