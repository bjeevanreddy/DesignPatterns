package CreationalDesignPattern.FactoryDesignPattern.Phones;

import CreationalDesignPattern.FactoryDesignPattern.OS;

public class AndoridOS implements OS {

    @Override
    public void spec() {
        System.out.println("This phone runs with Andorid OS");
    }
}
