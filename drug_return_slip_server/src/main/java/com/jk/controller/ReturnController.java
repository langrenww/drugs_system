package com.jk.controller;

import com.jk.pojo.ReturnSlip;
import com.jk.service.ReturnService;
import com.jk.service.ReturnServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReturnController implements ReturnServiceApi {

    @Autowired
    private ReturnService returnService;
    @ResponseBody
    @Override
    public void SaveReturn(@RequestBody ReturnSlip returnSlip) {
        returnService.SaveReturn(returnSlip);
    }
}
