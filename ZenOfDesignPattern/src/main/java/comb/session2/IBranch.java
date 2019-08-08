package comb.session2;

import java.util.ArrayList;

public interface IBranch extends ICorp{
    void addSubordinate(ICorp corp);
    ArrayList<ICorp> getSubordinate();
}
