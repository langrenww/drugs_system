package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("tree-service")
public interface ITreeService extends ITreeServiceApi{
}
