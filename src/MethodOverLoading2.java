public class MethodOverLoading2 {

    int summ(int a, int b){
        return a+b;
    }

    String summ(String s1, String s2){
        return s1+s2;
    }
}


class MethodOverLoading2Test{
    public static void main(String[] args) {
        MethodOverLoading2 m2 = new MethodOverLoading2();
        int a = m2.summ(5, 7);
        System.out.println(a);
        String s = m2.summ("привет, ", "мой друг!");
        System.out.println(s);
    }
}
