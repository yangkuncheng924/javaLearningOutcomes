package E_adapter;

/**
 * @City
 * 被适配的类
 * @City
 */
public class Voltage220V {
    //输出220v的电压
    public  int output220V(){
        int src=220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
