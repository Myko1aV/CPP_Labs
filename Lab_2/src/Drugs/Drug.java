package Drugs;

public abstract class Drug {
    protected String type;
    protected Integer Price;
    protected String name;

    public String getType() {
        return type;
    }

    public Integer getPrice() {
        return Price;
    }

    public String getName(){
        return name;
    }

    public abstract String toString();

    public abstract int getNumber();
}

