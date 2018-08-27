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
import org.doubleluck.radish_purchase_api.model.example.GoodsStatusExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsStatus;

public interface GoodsStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=GoodsStatusSqlProvider.class, method="countByExample")
    long countByExample(GoodsStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @DeleteProvider(type=GoodsStatusSqlProvider.class, method="deleteByExample")
    int deleteByExample(GoodsStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Delete({
        "delete from goods_status",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Insert({
        "insert into goods_status (`name`, created_at, ",
        "delete_flag)",
        "values (#{name,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{deleteFlag,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GoodsStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @InsertProvider(type=GoodsStatusSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GoodsStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=GoodsStatusSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    })
    List<GoodsStatus> selectByExample(GoodsStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Select({
        "select",
        "id, `name`, created_at, delete_flag",
        "from goods_status",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    })
    GoodsStatus selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=GoodsStatusSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GoodsStatus record, @Param("example") GoodsStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=GoodsStatusSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GoodsStatus record, @Param("example") GoodsStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=GoodsStatusSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodsStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_status
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Update({
        "update goods_status",
        "set `name` = #{name,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "delete_flag = #{deleteFlag,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodsStatus record);
}