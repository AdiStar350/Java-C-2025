public class Main {
    public static void main(String[] args) {
        Shoe s1 = new Shoe();
        Shoe s2 = new Shoe("Nike", "speed007", 2015, 899);

        s2.discount();
        System.out.println(s2.getPrice());
    }
}
