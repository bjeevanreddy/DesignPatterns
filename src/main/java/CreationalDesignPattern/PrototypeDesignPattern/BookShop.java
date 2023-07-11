package CreationalDesignPattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopName;

    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for(int i=5;i<10;i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book"+i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\n'+
                ", books=" + books;
    }

    // shallow cleaning
    // overriding existing clone method from cloneable marker interface
//    @Override
//    public BookShop clone() {
//        BookShop clone = new BookShop();
//        for(Book b: this.getBooks()){
//            clone.getBooks().add(b);
//        }
//
//        return clone;
//    }


    // deep cloning, for book of old object, creating a new book object and setting it to getBooks list
    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop bs = (BookShop) super.clone();
//        BookShop bs = new BookShop();
        for(Book b: this.getBooks()){
            Book deepB = new Book();
            deepB.setBname(b.getBname());
            deepB.setBid(b.getBid());
            bs.getBooks().add(deepB);

        }

//        ---------OR--------------
        // try cloning book directly instead of creating object and using setters

        return bs;
    }
}
