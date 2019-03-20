package com.jk.pojo;

import java.math.BigDecimal;

public class NewestGoods {
    private Integer id;
    //图片
    private String img;
    //姓名
    private String name;
    //规格
    private String specification;
    //价格
    private BigDecimal price;
    //功能
    private String function;
    //厂商
    private String manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "NewestGoods{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", specification='" + specification + '\'' +
                ", price=" + price +
                ", function='" + function + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
