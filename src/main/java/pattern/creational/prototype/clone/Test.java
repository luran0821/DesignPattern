package pattern.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);


        /*
        *
        * 如果不单独克隆属性，在对象克隆后，
        * 克隆出来的对象不一致但属性值会相同
        * */
        pig1.getDate().setTime(6666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
