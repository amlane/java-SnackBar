package snackBarApp;

public class Main {

    private static void workWithData() {
        Customer cus1 = new Customer("Jane", 45.25);
        Customer cus2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack sn1 = new Snack("Chips", 36, 1.75, vm1.getName());
        Snack sn2 = new Snack("Chocolate Bar", 36, 1.0, vm1.getName());
        Snack sn3 = new Snack("Pretzel", 30, 2.0, vm1.getName());
        Snack sn4 = new Snack("Soda", 24, 2.5, vm2.getName());
        Snack sn5 = new Snack("Water", 20, 2.75, vm2.getName());

    }

    public static void main(String[] args) {
        workWithData();

    }
}