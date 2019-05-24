package lod.session1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    // 老师对学生发布命令，清一下女生
    public void command(GroupLeader groupLeader) {
        List listGirls = new ArrayList();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        // 告诉体育委员开始执行清查任务
        groupLeader.countGirls(listGirls);
    }
}
