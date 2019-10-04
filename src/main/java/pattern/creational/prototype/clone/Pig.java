package pattern.creational.prototype.clone;

import java.util.Date;

public class Pig implements Cloneable {
    private String name;
    private Date date;


    public Pig(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        /*
        * 深克隆
        * 如果不单独克隆属性，在对象克隆时，
        * 克隆出来的对象不一致但属性值会相同
        * */
        pig.date = (Date)pig.date.clone();

        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}'+ super.toString();
    }
}
