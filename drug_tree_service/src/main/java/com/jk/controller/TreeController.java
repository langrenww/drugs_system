package com.jk.controller;

import com.jk.pojo.Tree;
import com.jk.service.ITreeService;
import com.jk.service.ITreeServiceApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TreeController implements ITreeServiceApi {

    @Resource
    private ITreeService treeService;

    @GetMapping("queryTreeAll")
    @ResponseBody
    public List<Tree> queryTreeAll(){
        System.out.println("进入service");
        return treeService.queryTreeAll();
    }
}
