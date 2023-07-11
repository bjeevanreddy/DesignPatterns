package CreationalDesignPattern.BuilderDesignPattern;


//Creational Design Pattern
public class ShopMain {
    public static void main(String[] args) {

        // Before Builder
//        Phone p= new Phone("ios","m2","iphone 13", 8);


        // After Builder
        Phone p= new PhoneBuilder()
                .setName("One PLus")
                .setOs("android")
                .setRam(16)
                .setProc("sanpdragon")
                .getPhone();
        System.out.println(p);
    }


}
