package CreationalDesignPattern.FactoryDesignPattern;

import CreationalDesignPattern.FactoryDesignPattern.Phones.FactoryDesignFactory;

public class FactoryMain {

    public static void main(String[] args) {

        FactoryDesignFactory obj = new FactoryDesignFactory();

        OS phoneOS = obj.getInstanceOs("weird");

        phoneOS.spec();
    }
}
