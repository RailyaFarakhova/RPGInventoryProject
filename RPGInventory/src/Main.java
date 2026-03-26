//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        Satchel m_storage = new Satchel();
        Medicine antidote = new Medicine("Restore");
        m_storage.open();
        m_storage.addItem(0, antidote);
        m_storage.open();
        antidote.use();
    }
}
