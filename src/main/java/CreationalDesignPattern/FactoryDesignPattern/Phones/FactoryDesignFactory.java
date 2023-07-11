package CreationalDesignPattern.FactoryDesignPattern.Phones;

import CreationalDesignPattern.FactoryDesignPattern.OS;

public class FactoryDesignFactory {

    public OS getInstanceOs(String s){

        if(s.equals("open")) return new AndoridOS();
        else if(s.equals("closed")) return new MacOS();
        else if(s.equals("weird")) return new WindowsOS();
        else return new OtherOS();

    }
}
