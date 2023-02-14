package oop.composition.laptop.graphiccard;

public class GraphicCard {

    private String graphicName;
    private  float price;

    public GraphicCard(String graphicName, float price) {
        this.graphicName = graphicName;
        this.price = price;
    }

    public GraphicCard() {
        this.graphicName = "AMD";
        this.price = 16600F;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "graphicName='" + graphicName + '\'' +
                ", price=" + price +
                '}';
    }
}
