package oop.composition.laptop;


import oop.composition.laptop.graphiccard.GraphicCard;
import oop.composition.laptop.processor.ProcessorP;


public class Laptop {
    protected float screen;
    protected String cacheMemory;
    protected GraphicCard graphicCard;
    protected ProcessorP processor;

    public Laptop(float screen, String cacheMemory, GraphicCard graphicCard, ProcessorP processor) {
        this.screen = screen;
        this.processor = processor;
        this.cacheMemory = cacheMemory;
        this.graphicCard = graphicCard;

    }

    public Laptop() {
        this.screen = 10.11F;
        this.processor = new ProcessorP();
        this.cacheMemory = "4";
        this.graphicCard = new GraphicCard();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", graphicCard=" + graphicCard +
                ", processor=" + processor +
                '}';
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop);
    }
}
