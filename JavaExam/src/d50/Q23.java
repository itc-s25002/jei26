package d50;

public class Q23 {
    String code;
    public static void main(String[] args) {
        Q23 obj = new Q23();
        System.out.println(obj.setCode("Code"));

    }
    String setCode(String c){
        code = c;
        return c;
    }
}
