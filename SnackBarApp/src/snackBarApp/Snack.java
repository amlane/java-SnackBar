package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public String getVendingMachineName(int id) {
        if (id == 1) {
            return "Food";
        } else if (id == 2) {
            return "Drink";
        } else {
            return "Office";
        }
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int addQuantity(int newQuantity) {
        this.quantity = this.quantity + newQuantity;
        return this.quantity;
    }

    public int removeQuantity(int reduceQuantity) {
        this.quantity = this.quantity - reduceQuantity;
        return this.quantity;
    }

    public double getTotalCost(int quantity) {
        return this.cost * quantity;
    }

    @Override
    public String toString() {
        String rtnStr = "Snack: " + name + "\nQuantity: " + quantity + "\nTotal Inventory: $"
                + getTotalCost(getQuantity()) + "\nVending Machine: " + getVendingMachineName(getVendingMachineId());
        return rtnStr;
    }

}