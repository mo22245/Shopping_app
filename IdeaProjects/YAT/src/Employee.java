public abstract class Employee {
    private String name;
    private int id;

    public abstract void printSalary();

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getId() {
        System.out.println(id);
    }

    public void setId(int id) {
        this.id = id;
    }
}
