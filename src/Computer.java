public class Computer extends Product {
    private String processor;
    private int ramSize;
    private String graphicCard;
    private String mainBoard;

    private String disk;

    public Computer(int id, String name, double price, boolean isAvailable, String processor, int ramSize, String graphicCard,
                    String mainBoard, String disk) {
        super(id, name, price, isAvailable);
        this.processor = processor;
        this.ramSize = ramSize;
        this.graphicCard = graphicCard;
        this.mainBoard = mainBoard;
        this.disk = disk;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", graphicCard='" + graphicCard + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }

}
