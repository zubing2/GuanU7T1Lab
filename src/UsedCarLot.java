import java.util.ArrayList;

public class UsedCarLot {

    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car temp) {
        inventory.add(temp);
    }

    public boolean swap(int num1, int num2) {
        if (num1 < inventory.size() && num2 < inventory.size()) {
            Car car1 = inventory.get(num1);
            Car car2 = inventory.get(num2);
            inventory.set(num2, car1);
            inventory.set(num1, car2);
            return true;
        } else {
            return false;
        }
    }
}
