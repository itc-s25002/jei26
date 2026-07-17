package d52.Q2;

public class Cooker {
    private Cooking c1 = new Cooking("ステーキ",20);
    private Cooking c2 = new Cooking("ミニサラダ",10);

    public void showcoking(){
        System.out.println(c1.getName());
        System.out.println(c2.getName());
    }
}
