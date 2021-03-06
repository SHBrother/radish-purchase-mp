package org.doubleluck.radish_purchase_api.model.po;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Builder
@NoArgsConstructor
@ToString
public class GoodsDetail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.goods_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.detail_status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long detailStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.detail
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.modified_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Date modifiedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_detail.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Byte deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.id
     *
     * @return the value of goods_detail.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.id
     *
     * @param id the value for goods_detail.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.goods_id
     *
     * @return the value of goods_detail.goods_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.goods_id
     *
     * @param goodsId the value for goods_detail.goods_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.detail_status_id
     *
     * @return the value of goods_detail.detail_status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getDetailStatusId() {
        return detailStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.detail_status_id
     *
     * @param detailStatusId the value for goods_detail.detail_status_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDetailStatusId(Long detailStatusId) {
        this.detailStatusId = detailStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.detail
     *
     * @return the value of goods_detail.detail
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.detail
     *
     * @param detail the value for goods_detail.detail
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.price
     *
     * @return the value of goods_detail.price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.price
     *
     * @param price the value for goods_detail.price
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.created_at
     *
     * @return the value of goods_detail.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.created_at
     *
     * @param createdAt the value for goods_detail.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.modified_at
     *
     * @return the value of goods_detail.modified_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Date getModifiedAt() {
        return modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.modified_at
     *
     * @param modifiedAt the value for goods_detail.modified_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_detail.delete_flag
     *
     * @return the value of goods_detail.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_detail.delete_flag
     *
     * @param deleteFlag the value for goods_detail.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}