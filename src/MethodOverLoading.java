public class MethodOverLoading {


    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is integer");
    }

    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }

    void show(String s1){
        System.out.println(s1);
        System.out.println("Data type is string");
    }

    void show(String s, int a){
        System.out.println("String: " + s + ", int: " + a);
    }

    void show (int a, String s){
        System.out.println("Какой хороший день!");
    }
}


class MethodOverLoadingTest{
    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();
        int a = 500;
        m.show(a);
        boolean b = true;
        m.show(b);
        String s = "Privet!!!!";
        m.show(s);
        m.show("privet", 10);
        m.show(10, "privet");
    }
}