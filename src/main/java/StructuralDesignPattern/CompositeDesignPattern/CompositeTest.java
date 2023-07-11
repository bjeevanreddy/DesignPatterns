package StructuralDesignPattern.CompositeDesignPattern;

public class CompositeTest {

    public static void main(String[] args) {
        Component hd = new Leaf(4000, "hdd");
        Component mouse = new Leaf(1000, "mouse");
        Component monitor = new Leaf(2000, "monitor");
        Component ram = new Leaf(3000, "ram");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb= new Composite("MB");
        Composite computer = new Composite("Computer");

        mb.addComponent(ram);
        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);


        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }


}
