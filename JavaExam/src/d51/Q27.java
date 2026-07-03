package d51;

enum Doneness {RARE,MEDIUM,WELLDONE}
enum Light {赤,青,黄色}
public class Q27 {
    public static void main(String[] args) {
        Doneness done = Doneness.MEDIUM;
        System.out.println(done);
        Light light = Light.赤;
        System.out.println(light);
    }
}
