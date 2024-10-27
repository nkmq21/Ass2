package Reader;

public class Reader {
    protected String rcode;
    protected String name;
    protected int byear;

    public Reader(String rcode, String name, int byear) {
        this.rcode = rcode;
        this.name = name;
        this.byear = byear;
    }

    public String getRcode() {
        return rcode;
    }

    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getByear() {
        return byear;
    }

    public void setByear(int byear) {
        this.byear = byear;
    }

    @Override
    public String toString() {
        return "Reader.Reader{" +
                "rcode='" + rcode + '\'' +
                ", name='" + name + '\'' +
                ", byear=" + byear +
                '}';
    }
}
