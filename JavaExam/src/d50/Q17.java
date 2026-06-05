package d50;

public class Q17 {
    public static void main(String[] args) {
        float f = 7.8f;
        double d = 15.73;

        double x = f * d;
        System.out.println(x);//異なる型の計算はより大きい型に変換される
    }
}

