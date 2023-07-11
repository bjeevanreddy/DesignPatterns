package StructuralDesignPattern.AdapterDesignPattern;


// Structural Design Pattern
public class School {
    public static void main(String[] args) {
        AssignmentWork aw= new AssignmentWork();

        Pen pa= new PenAdapter();
        // we cannot pass pen object here, because we dnt have implementaion of Pen interface
        // SO we create a Adapter class which takes help from another marker class to provide us pen
        // with that marker object which gives us pen instance we can pass the object to setPen method.
        // see PenAdapater class
        aw.setP(pa);

        aw.writeAssignment("I am about to complete my assignment today");

    }


}
