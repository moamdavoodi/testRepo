public class SubClass extends SupperClass {
    public SubClass(String name, int nom) {
        super(name, nom);
    }

    private int money;
    private int a;

    public int getMoney() {

        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
