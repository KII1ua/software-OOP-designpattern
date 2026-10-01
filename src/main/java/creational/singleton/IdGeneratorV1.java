package creational.singleton;

public class IdGeneratorV1 {
    private long id = 1;

    private static IdGeneratorV1 instance;

    private IdGeneratorV1() {

    }

    public static IdGeneratorV1 getInstance() {
        if(instance == null) {
            instance = new IdGeneratorV1();
        }

        return instance;
    }

    public void nextId() {
        this.id++;
    }

    public long getId() {
        return id;
    }

    public void setOrderNumber(long id) {
        this.id = id;
    }

    public void addOrderNumber() {
        this.id++;
    }
}
