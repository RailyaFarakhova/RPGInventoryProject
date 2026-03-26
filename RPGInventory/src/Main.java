
public class Main{
    public static void main(String[] args){
        Satchel m_storage = new Satchel();

        // Creating items for the bag.
        Item coin = new Item("Amulet", "Items");
        KeyItem flute = new KeyItem("Poke Flute");
        PokeBalls ball = new PokeBalls("Great Ball");
        Berries berry = new Berries("Aspear Berry");
        Medicine antidote = new Medicine("Antidote");
        TMs tackle = new TMs("Tackle");

        m_storage.open();

        m_storage.addItem(0, coin);
        m_storage.addItem(0, flute);
        m_storage.addItem(0, ball);
        m_storage.addItem(0, berry);
        m_storage.addItem(0, antidote);
        m_storage.addItem(0, tackle);

        m_storage.open();

        flute.use();
        coin.use();
        ball.use();
        berry.use();
        antidote.use();
        tackle.use();

        m_storage.open();
        m_storage.close();
    }
}
