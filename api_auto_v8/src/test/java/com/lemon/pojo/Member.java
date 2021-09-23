package com.lemon.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Project: api_auto_v5
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: 2020 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2020-09-12 11:18
 * @Desc： 数据库member表映射类
 **/
public class Member {
    private int id;
    private String reg_name;
    private String pwd;
    private String mobile_phone;
    private int type;
    //BigDecimal java处理钱的数据类型
    private BigDecimal leave_amount;
    private Timestamp reg_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReg_name() {
        return reg_name;
    }

    public void setReg_name(String reg_name) {
        this.reg_name = reg_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getLeave_amount() {
        return leave_amount;
    }

    public void setLeave_amount(BigDecimal leave_amount) {
        this.leave_amount = leave_amount;
    }

    public Timestamp getReg_time() {
        return reg_time;
    }

    public void setReg_time(Timestamp reg_time) {
        this.reg_time = reg_time;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", reg_name='" + reg_name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", type=" + type +
                ", leave_amount=" + leave_amount +
                ", reg_time=" + reg_time +
                '}';
    }
}
