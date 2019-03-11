package com.jk.service;

import com.jk.pojo.Tree;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ITreeServiceApi {

    @GetMapping("queryTreeAll")
    List<Tree> queryTreeAll();
}
