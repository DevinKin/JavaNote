package cor.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-31 17:36
 * @description: 处理抽象类
 **/
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    // 能处理的级别
    private int level = 0;

    // 责任传递，下一个人责任人是谁
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    // 处理请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.HandleMessage(women);
            } else {
                System.out.println("---没有地方请示了，按不同意处理\n");
            }
        }
    }

    public void setNextHandler(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
