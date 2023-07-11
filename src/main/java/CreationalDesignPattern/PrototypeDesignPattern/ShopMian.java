package CreationalDesignPattern.PrototypeDesignPattern;

public class ShopMian {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Shop1");
        bs.loadData();


// this is shallow cloning,
//        BookShop bs1 = bs.clone();
//        bs1.setShopName("shop2");
//        bs.getBooks().get(0).setBname("book00"); // changing name for first book in bs1 or bs changes in both



        // deep cloning
        BookShop bs2 = bs.clone();
        bs2.setShopName("shop3");
        bs.getBooks().get(0).setBname("book00"); // changing name for first book in bs  changes in both bs only not bs2

        System.out.println(bs2);
//        System.out.println(bs1);
        System.out.println(bs);
    }
}
