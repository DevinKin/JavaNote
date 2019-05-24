package lod.session2;


import java.util.List;

public class GroupLeader {
    private List<Girl> listGirls;

    // 传递全班的女生进来
    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    // 清查女生数量
    public void countGirls() {
        System.out.println("女生的数量是：" + this.listGirls.size());
    }
}
