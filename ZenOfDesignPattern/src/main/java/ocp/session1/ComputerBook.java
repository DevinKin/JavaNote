package ocp.session1;

public class ComputerBook implements IComputerBook{
    private String name;
    private String scope;
    private String author;
    private int price;

    public ComputerBook(String name, String scope, String author, int price) {
        this.name = name;
        this.scope = scope;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getScope() {
        return scope;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
