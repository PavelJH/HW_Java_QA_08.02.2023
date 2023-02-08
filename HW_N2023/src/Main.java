public class Main {
    public static void main(String[] args) {

        MyArr<Integer> name = new MyArr<>();
        name.add(0);
        name.add(21);
        name.add(24);
        name.add(1770);
        name.add(8596);
        name.print();

        //System.out.println(name.get(1));
        name.delete(1);
        name.delete(21);
        name.print();
        System.out.println(name.delete(21));
    }
}