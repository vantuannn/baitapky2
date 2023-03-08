package baitaphotro_07032023;

public class thuchanhlophinhtron {
    private double radius;
    private String color;

    public static void main(String[] args) {
    }
    public thuchanhlophinhtron() {

        this.radius = 0;
        this.color = "";
    }

    public thuchanhlophinhtron(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}

