package org.doubleluck.radish_purchase_api.model.po;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Builder
@ToString
@NoArgsConstructor
public class SellerBuyerRel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_buyer_rel.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_buyer_rel.seller_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_buyer_rel.buyer_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Long buyerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_buyer_rel.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller_buyer_rel.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    private Byte deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_buyer_rel.id
     *
     * @return the value of seller_buyer_rel.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_buyer_rel.id
     *
     * @param id the value for seller_buyer_rel.id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_buyer_rel.seller_id
     *
     * @return the value of seller_buyer_rel.seller_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_buyer_rel.seller_id
     *
     * @param sellerId the value for seller_buyer_rel.seller_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_buyer_rel.buyer_id
     *
     * @return the value of seller_buyer_rel.buyer_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_buyer_rel.buyer_id
     *
     * @param buyerId the value for seller_buyer_rel.buyer_id
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_buyer_rel.created_at
     *
     * @return the value of seller_buyer_rel.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_buyer_rel.created_at
     *
     * @param createdAt the value for seller_buyer_rel.created_at
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller_buyer_rel.delete_flag
     *
     * @return the value of seller_buyer_rel.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller_buyer_rel.delete_flag
     *
     * @param deleteFlag the value for seller_buyer_rel.delete_flag
     *
     * @mbg.generated Mon Aug 27 11:50:05 CST 2018
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}