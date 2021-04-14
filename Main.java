public class Main {
    public static void main(String[] args) {
        Exercises table1 = new Exercises();
        Exercises table2 = new Exercises();

        table1.exercise1(table1.getTreeMap(), 1);
        table2.exercise1(table2.getTreeMap(), 2);

        table1.exercise2(table1.getTreeMap(), table2.getTreeMap());
        table1.exercise3(table1.getTreeMap(), "Veth");
        table1.exercise4(table1.getTreeMap(), 3);
    }
}
