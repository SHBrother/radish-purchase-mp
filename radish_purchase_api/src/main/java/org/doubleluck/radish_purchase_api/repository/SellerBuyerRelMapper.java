package org.doubleluck.radish_purchase_api.repository;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.doubleluck.radish_purchase_api.model.example.SellerBuyerRelExample;
import org.doubleluck.radish_purchase_api.model.po.SellerBuyerRel;

public interface SellerBuyerRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=SellerBuyerRelSqlProvider.class, method="countByExample")
    long countByExample(SellerBuyerRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @DeleteProvider(type=SellerBuyerRelSqlProvider.class, method="deleteByExample")
    int deleteByExample(SellerBuyerRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Delete({
        "delete from seller_buyer_rel",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Insert({
        "insert into seller_buyer_rel (seller_id, buyer_id, ",
        "created_at, delete_flag)",
        "values (#{sellerId,jdbcType=BIGINT}, #{buyerId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{deleteFlag,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SellerBuyerRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @InsertProvider(type=SellerBuyerRelSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(SellerBuyerRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=SellerBuyerRelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="seller_id", property="sellerId", jdbcType=JdbcType.BIGINT),
        @Result(column="buyer_id", property="buyerId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    })
    List<SellerBuyerRel> selectByExample(SellerBuyerRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Select({
        "select",
        "id, seller_id, buyer_id, created_at, delete_flag",
        "from seller_buyer_rel",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="seller_id", property="sellerId", jdbcType=JdbcType.BIGINT),
        @Result(column="buyer_id", property="buyerId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    })
    SellerBuyerRel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=SellerBuyerRelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SellerBuyerRel record, @Param("example") SellerBuyerRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=SellerBuyerRelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SellerBuyerRel record, @Param("example") SellerBuyerRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=SellerBuyerRelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SellerBuyerRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_buyer_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Update({
        "update seller_buyer_rel",
        "set seller_id = #{sellerId,jdbcType=BIGINT},",
          "buyer_id = #{buyerId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "delete_flag = #{deleteFlag,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SellerBuyerRel record);
}