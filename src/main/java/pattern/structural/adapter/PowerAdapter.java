package pattern.structural.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    public int outputDC5() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput/44;

        System.out.println("使用电源输入AC：" + adapterOutput + "V");
        return adapterOutput;
    }
}
