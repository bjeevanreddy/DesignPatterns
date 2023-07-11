package CreationalDesignPattern.PrototypeDesignPattern;

public class Book{

    private int bid;

    private String bname;

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getBid() {
        return bid;
    }

    public String getBname() {
        return bname;
    }

}
