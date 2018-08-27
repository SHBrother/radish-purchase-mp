package org.doubleluck.radish_purchase_api.model.po;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Builder
@ToString
@NoArgsConstructor
public class OrderDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.order_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goods_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goods_detail_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long goodsDetailId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.goods_count
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Integer goodsCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long statusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.single_price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Double singlePrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.total_price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Double totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.remark
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_detail.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Byte deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.id
     *
     * @return the value of order_detail.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.id
     *
     * @param id the value for order_detail.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.order_id
     *
     * @return the value of order_detail.order_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.order_id
     *
     * @param orderId the value for order_detail.order_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goods_id
     *
     * @return the value of order_detail.goods_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goods_id
     *
     * @param goodsId the value for order_detail.goods_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goods_detail_id
     *
     * @return the value of order_detail.goods_detail_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getGoodsDetailId() {
        return goodsDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goods_detail_id
     *
     * @param goodsDetailId the value for order_detail.goods_detail_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setGoodsDetailId(Long goodsDetailId) {
        this.goodsDetailId = goodsDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.goods_count
     *
     * @return the value of order_detail.goods_count
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.goods_count
     *
     * @param goodsCount the value for order_detail.goods_count
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.status_id
     *
     * @return the value of order_detail.status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getStatusId() {
        return statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.status_id
     *
     * @param statusId the value for order_detail.status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.single_price
     *
     * @return the value of order_detail.single_price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Double getSinglePrice() {
        return singlePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.single_price
     *
     * @param singlePrice the value for order_detail.single_price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setSinglePrice(Double singlePrice) {
        this.singlePrice = singlePrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.total_price
     *
     * @return the value of order_detail.total_price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.total_price
     *
     * @param totalPrice the value for order_detail.total_price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.remark
     *
     * @return the value of order_detail.remark
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.remark
     *
     * @param remark the value for order_detail.remark
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.created_at
     *
     * @return the value of order_detail.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.created_at
     *
     * @param createdAt the value for order_detail.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_detail.delete_flag
     *
     * @return the value of order_detail.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_detail.delete_flag
     *
     * @param deleteFlag the value for order_detail.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}