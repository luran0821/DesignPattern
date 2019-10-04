package pattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Mail mail = new Mail();
        System.out.println("初始化mail:"+ mail);
        mail.setContent("初始化模版");
        for(int i = 0; i <10; i++){
            Mail mailT = (Mail) mail.clone();
            mailT.setName("姓名" + i);
            mailT.setEmailAddress("姓名" + i + "@imooc.com");
            mailT.setContent("恭喜您，中奖了～");
            MailUtil.sendMail(mailT);
            System.out.println("克隆mailT:" + mailT);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
