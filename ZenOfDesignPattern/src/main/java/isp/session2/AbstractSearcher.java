package isp.session2;

public abstract class AbstractSearcher {
    protected IGoodBodyGirl goodBodyGirl;
    protected IGreatTemperamentGirl greatTemperamentGirl;
    protected PettyGirl perfectGirl;

    public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
        this.greatTemperamentGirl = greatTemperamentGirl;
    }

    public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
        this.goodBodyGirl = goodBodyGirl;
    }

    public AbstractSearcher(PettyGirl perfectGirl) {
        this.perfectGirl = perfectGirl;
    }

    public abstract void show();
}
