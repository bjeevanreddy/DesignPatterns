package CreationalDesignPattern.FactoryDesignPattern.Phones;

import CreationalDesignPattern.FactoryDesignPattern.OS;

public class MacOS implements OS {

    @Override
    public void spec() {
        System.out.println("This phone runs with Mac OS");
    }
}
