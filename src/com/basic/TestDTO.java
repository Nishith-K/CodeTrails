package com.basic;

import java.io.Serializable;

public class TestDTO implements Serializable {
    Long id;
    String remarks;
    Long foremanId;
    Long subId;
    Integer chitgrpId;
    Integer instNum;
    Double amount;
    Double totalAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getForemanId() {
        return foremanId;
    }

    public void setForemanId(Long foremanId) {
        this.foremanId = foremanId;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Integer getChitgrpId() {
        return chitgrpId;
    }

    public void setChitgrpId(Integer chitgrpId) {
        this.chitgrpId = chitgrpId;
    }

    public Integer getInstNum() {
        return instNum;
    }

    public void setInstNum(Integer instNum) {
        this.instNum = instNum;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public TestDTO() {
    }

    public TestDTO(Long subId, Double amount, Integer chitgrpId, Integer instNum) {
        this.subId = subId;
        this.chitgrpId = chitgrpId;
        this.amount = amount;
        this.instNum = instNum;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "id=" + id +
                ", remarks='" + remarks + '\'' +
                ", foremanId=" + foremanId +
                ", subId=" + subId +
                ", chitgrpId=" + chitgrpId +
                ", instNum=" + instNum +
                ", amount=" + amount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
