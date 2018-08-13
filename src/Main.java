public class Main {
    public static void main(String[] args) {
        Logger1 log = new Logger1();
        DBLogger dblog = new DBLogger();
        XMLLogger xmllog = new XMLLogger();
        Bank bank = new Bank(xmllog);
        bank.deposit(100);

    }
}
