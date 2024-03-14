public class Smartphone extends Product {
    private String color;
    private int batteryCapacity;
    private String accessories;

    public Smartphone(int id, String name, double price, boolean isAvailable, String color, int batteryCapacity, String accessories) {
        super(id, name, price, isAvailable);
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.accessories = accessories;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "color='" + color + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", accessories='" + accessories + '\'' +
                '}';
    }
}
