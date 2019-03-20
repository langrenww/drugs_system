package com.jk.pojo;

import java.util.List;

public class Goods {
    private Integer id;
    private String text;
    private Integer goodsLevel;
    private Integer goodsPid;
    private List<Goods> nodes;

    public List<Goods> getNodes() {
        return nodes;
    }

    public void setNodes(List<Goods> nodes) {
        this.nodes = nodes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Integer goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public Integer getGoodsPid() {
        return goodsPid;
    }

    public void setGoodsPid(Integer goodsPid) {
        this.goodsPid = goodsPid;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", goodsLevel=" + goodsLevel +
                ", goodsPid=" + goodsPid +
                ", nodes=" + nodes +
                '}';
    }
}
