package snackBarApp;

public class Main {

        private static void workWithData() {
                Customer cus1 = new Customer("Jane", 45.25);
                Customer cus2 = new Customer("Bob", 33.14);

                VendingMachine vm1 = new VendingMachine("Food");
                VendingMachine vm2 = new VendingMachine("Drink");
                VendingMachine vm3 = new VendingMachine("Office");

                Snack sn1 = new Snack("Chips", 36, 1.75, vm1.getId());
                Snack sn2 = new Snack("Chocolate Bar", 36, 1.0, vm1.getId());
                Snack sn3 = new Snack("Pretzel", 30, 2.0, vm1.getId());
                Snack sn4 = new Snack("Soda", 24, 2.5, vm2.getId());
                Snack sn5 = new Snack("Water", 20, 2.75, vm2.getId());

                System.out.println("*** Welcome to Snack Bar ***");

                cus1.purchase(sn4.getTotalCost(3));
                sn4.removeQuantity(3);
                System.out.println(cus1.getName() + " has $" + cus1.getCashOnHand());
                System.out.println("There are " + sn4.getQuantity() + " " + sn4.getName() + "s left.");

                cus1.purchase(sn3.getTotalCost(1));
                sn3.removeQuantity(3);
                System.out.println(cus1.getName() + " has $" + cus1.getCashOnHand());
                System.out.println("There are " + sn3.getQuantity() + " " + sn3.getName() + "s left.");

                cus2.purchase(sn4.getTotalCost(2));
                sn4.removeQuantity(2);
                System.out.println(cus2.getName() + " has $" + cus2.getCashOnHand());
                System.out.println("There are " + sn4.getQuantity() + " " + sn4.getName() + "s left.");

                cus1.addCash(10.0);
                System.out.println(cus1.getName() + " has $" + cus1.getCashOnHand());

                cus1.purchase(sn2.getTotalCost(1));
                sn2.removeQuantity(2);
                System.out.println(cus1.getName() + " has $" + cus1.getCashOnHand());
                System.out.println("There are " + sn2.getQuantity() + " " + sn4.getName() + "s left.");

                sn3.addQuantity(12);
                System.out.println("There are " + sn3.getQuantity() + " " + sn3.getName() + "s left.");

                cus2.purchase(sn3.getTotalCost(3));
                sn3.removeQuantity(3);
                System.out.println(cus2.getName() + " has $" + cus2.getCashOnHand());
                System.out.println("There are " + sn3.getQuantity() + " " + sn3.getName() + "s left.");

                // Stretch
                System.out.println();
                System.out.println(sn1.toString());
                System.out.println(sn2.toString());
                System.out.println(sn3.toString());
                System.out.println(sn4.toString());
                System.out.println(sn5.toString());
                System.out.println();

                // Alternative Stretch
                System.out.println("Snack: " + sn1.getName() + "\nQuantity: " + sn1.getQuantity()
                                + "\nTotal Inventory: $" + sn1.getTotalCost(sn1.getQuantity()) + "0"
                                + "\nVending Machine: " + vm1.getName());
                System.out.println("Snack: " + sn2.getName() + "\nQuantity: " + sn2.getQuantity()
                                + "\nTotal Inventory: $" + sn2.getTotalCost(sn2.getQuantity()) + "0"
                                + "\nVending Machine: " + vm1.getName());
                System.out.println("Snack: " + sn3.getName() + "\nQuantity: " + sn3.getQuantity()
                                + "\nTotal Inventory: $" + sn3.getTotalCost(sn3.getQuantity()) + "0"
                                + "\nVending Machine:" + vm1.getName());
                System.out.println("Snack: " + sn4.getName() + "\nQuantity: " + sn4.getQuantity()
                                + "\nTotal Inventory: $" + sn4.getTotalCost(sn4.getQuantity()) + "0"
                                + "\nVending Machine: " + vm2.getName());
                System.out.println("Snack: " + sn5.getName() + "\nQuantity: " + sn5.getQuantity()
                                + "\nTotal Inventory: $" + sn5.getTotalCost(sn5.getQuantity()) + "0"
                                + "\nVending Machine: " + vm2.getName());
                System.out.println();

        }

        public static void main(String[] args) {
                workWithData();

        }
}