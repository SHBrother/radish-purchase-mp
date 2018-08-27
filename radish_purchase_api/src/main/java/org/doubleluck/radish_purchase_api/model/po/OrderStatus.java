package org.doubleluck.radish_purchase_api.model.po;

import java.util.Date;

public class OrderStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.id
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.name
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_status.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    private Byte deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.id
     *
     * @return the value of order_status.id
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.id
     *
     * @param id the value for order_status.id
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.name
     *
     * @return the value of order_status.name
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.name
     *
     * @param name the value for order_status.name
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.created_at
     *
     * @return the value of order_status.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.created_at
     *
     * @param createdAt the value for order_status.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_status.delete_flag
     *
     * @return the value of order_status.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_status.delete_flag
     *
     * @param deleteFlag the value for order_status.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:06 CST 2018
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}