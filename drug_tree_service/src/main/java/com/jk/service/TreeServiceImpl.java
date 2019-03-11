package com.jk.service;

import com.jk.dao.ITreeDao;
import com.jk.pojo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TreeServiceImpl implements  ITreeService {

    @Autowired
    private ITreeDao treeDao;

    public List<Tree> queryTreeAll() {
        int pid=0;
        List<Tree> list = findNodes(pid);
        return list;
    }

    private List<Tree> findNodes(int pid) {
        List<Tree> list = treeDao.queryTreeAll(pid);
        for (Tree treeBean : list) {
            Integer id = Integer.parseInt(treeBean.getId());
            List<Tree> nodes = findNodes(id);
            if(nodes.size()<=0){
                treeBean.setSelectable(true);
            }else{
                treeBean.setSelectable(false);
                treeBean.setNodes(nodes);
            }
        }
        return list;
    }
}
