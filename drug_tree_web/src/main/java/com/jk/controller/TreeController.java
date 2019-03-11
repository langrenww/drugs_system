package com.jk.controller;

import com.jk.pojo.Tree;
import com.jk.service.ITreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TreeController {

    @Resource
    private ITreeService treeService;

    @GetMapping("queryTreeAll")
    @ResponseBody
    public List<Tree> queryTreeAll(){
       return  treeService.queryTreeAll();
    }
}
