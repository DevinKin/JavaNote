package cor.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:12
 * @description: 古代妇女类
 **/
public class Women implements IWomen {
    /**
     * 1-未嫁
     * 2-出嫁
     * 3-夫死
     */
    private int type = 0;
    // 妇女的请示
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
