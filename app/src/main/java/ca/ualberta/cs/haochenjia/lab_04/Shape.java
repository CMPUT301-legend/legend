package ca.ualberta.cs.haochenjia.lab_04;

public abstract class Shape {
    protected int x;
    protected int y;
    String color = "green";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
