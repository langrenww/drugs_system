package com.jk.pojo;

public class District {
    private Integer id;
    private String district;
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "District{" +
                "id=" + id +
                ", district='" + district + '\'' +
                ", pid=" + pid +
                '}';
    }
}
