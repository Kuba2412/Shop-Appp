public class Electronics extends Product {
    private String type;

    public Electronics(int id, String name, double price, boolean isAvailable, String type) {
        super(id, name, price, isAvailable);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "type='" + type + '\'' +
                '}';
    }
}
