package org.doubleluck.radish_purchase_api.model.po;

import java.util.Date;

public class OrderOperationLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_operation_log.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_operation_log.order_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_operation_log.user_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_operation_log.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_operation_log.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Byte deleteFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_operation_log.desc
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_operation_log.id
     *
     * @return the value of order_operation_log.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_operation_log.id
     *
     * @param id the value for order_operation_log.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_operation_log.order_id
     *
     * @return the value of order_operation_log.order_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_operation_log.order_id
     *
     * @param orderId the value for order_operation_log.order_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_operation_log.user_id
     *
     * @return the value of order_operation_log.user_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_operation_log.user_id
     *
     * @param userId the value for order_operation_log.user_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_operation_log.created_at
     *
     * @return the value of order_operation_log.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_operation_log.created_at
     *
     * @param createdAt the value for order_operation_log.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_operation_log.delete_flag
     *
     * @return the value of order_operation_log.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_operation_log.delete_flag
     *
     * @param deleteFlag the value for order_operation_log.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_operation_log.desc
     *
     * @return the value of order_operation_log.desc
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_operation_log.desc
     *
     * @param desc the value for order_operation_log.desc
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}