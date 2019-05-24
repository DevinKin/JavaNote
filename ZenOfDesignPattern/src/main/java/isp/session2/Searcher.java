package isp.session2;

import isp.session2.AbstractSearcher;
import isp.session2.PettyGirl;

public class Searcher extends AbstractSearcher{

    public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
        super(greatTemperamentGirl);
    }

    public Searcher(IGoodBodyGirl goodBodyGirl) {
        super(goodBodyGirl);
    }

    public Searcher(PettyGirl perfectGirl) {
        super(perfectGirl);
    }

    public void show() {
        System.out.println("--------------美女的信息如下：--------------");
        if (super.goodBodyGirl != null) {
            // 展示面容
            super.goodBodyGirl.goodLooking();
            // 展示身材
            super.goodBodyGirl.niceFigure();
        }
        if (super.greatTemperamentGirl != null) {
            // 展示气质
            super.greatTemperamentGirl.greatTemperament();
        }

        if (super.perfectGirl != null) {
            super.perfectGirl.goodLooking();
            super.perfectGirl.niceFigure();
            super.perfectGirl.greatTemperament();
        }
    }
}
