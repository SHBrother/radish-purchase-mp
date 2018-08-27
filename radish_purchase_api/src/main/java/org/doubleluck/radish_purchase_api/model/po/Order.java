package org.doubleluck.radish_purchase_api.model.po;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Builder
@ToString
@NoArgsConstructor
public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.buyer_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.remark
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Byte deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.buyer_id
     *
     * @return the value of order.buyer_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.buyer_id
     *
     * @param buyerId the value for order.buyer_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.status_id
     *
     * @return the value of order.status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.status_id
     *
     * @param statusId the value for order.status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.remark
     *
     * @return the value of order.remark
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.remark
     *
     * @param remark the value for order.remark
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.created_at
     *
     * @return the value of order.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.created_at
     *
     * @param createdAt the value for order.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.delete_flag
     *
     * @return the value of order.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.delete_flag
     *
     * @param deleteFlag the value for order.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}