package C_Inversion;

/**
 * @City
 *
 * @City
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person peerson = new Person();
        peerson.receive(new Email());
    }
}
//完成一个Person接受消息的功能
/*
* 方式1分析
* 1.简单 比较容易实现做到
* 2.如果我们获取的是短信，微信等等，则新增类 同时Persons也要增加相应的接收方法
* 3.解决思路：引入一个抽象的接口IReceiver，表示接受者，这样Person类与接口IReceiver发生依赖
*   因为Email，weixin等等属于接受的范围，他们各自实现IReceiver接口就ok 这样我们就符号依赖倒转原则
* */
class Person{
    public void receive(Email email){
        System.out.println(email.getinfo());
    }
}
class Email{
    public String getinfo(){
        return "hello world";
    }
}
