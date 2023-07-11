package CreationalDesignPattern.BuilderDesignPattern;

public class Phone {

    private String os;
    private String proc;
    private String name;
    private int ram;

    public Phone(String os, String proc, String name, int ram) {
        this.os = os;
        this.proc = proc;
        this.name = name;
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", proc='" + proc + '\'' +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }
}
