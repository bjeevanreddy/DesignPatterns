package CreationalDesignPattern.BuilderDesignPattern;

public class PhoneBuilder {

    private String os;
    private String proc;
    private String name;
    private int ram;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProc(String proc) {
        this.proc = proc;
        return this;
    }

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,proc,name,ram);
    }
}
