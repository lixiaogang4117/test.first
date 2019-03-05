package com.example.demo.pojo;

import lombok.Data;
import lombok.Getter;

import java.sql.Timestamp;

@Data
public class Products {
    @Getter
    private Integer pid;
    private String pname;
    private String type;
    private double price;
    private String createTime;
    private String modifyTime;


    @Override
    public String toString() {
        return "Products{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
