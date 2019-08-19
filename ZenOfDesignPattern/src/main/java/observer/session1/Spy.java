package observer.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 16:54
 * @description: 间谍
 **/
public class Spy extends Thread{
    private HanFeiZi hanFeiZi;
    private Lisi lisi;
    private String type;
    public Spy(HanFeiZi hanFeiZi, Lisi lisi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.lisi = lisi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true) {
            if (this.type.equals("breakfast")) {
                // 监控是否再吃早餐
                if (this.hanFeiZi.isHavingBreakfast()) {
                    this.lisi.update("韩非子在吃饭");
                    this.hanFeiZi.setHavingBreakfast(false);
                } else {
                    if (this.hanFeiZi.isHavingFun()) {
                        this.lisi.update("韩非子在娱乐");
                        this.hanFeiZi.setHavingFun(false);
                    }
                }
            }
        }
    }
}
