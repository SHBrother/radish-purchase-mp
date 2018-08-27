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
import org.doubleluck.radish_purchase_api.model.example.GoodsPicExample;
import org.doubleluck.radish_purchase_api.model.po.GoodsPic;

public interface GoodsPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=GoodsPicSqlProvider.class, method="countByExample")
    long countByExample(GoodsPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @DeleteProvider(type=GoodsPicSqlProvider.class, method="deleteByExample")
    int deleteByExample(GoodsPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Delete({
        "delete from goods_pic",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Insert({
        "insert into goods_pic (uri, `name`, ",
        "created_at, deleted_flag)",
        "values (#{uri,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{deletedFlag,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GoodsPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @InsertProvider(type=GoodsPicSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GoodsPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=GoodsPicSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uri", property="uri", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_flag", property="deletedFlag", jdbcType=JdbcType.TINYINT)
    })
    List<GoodsPic> selectByExample(GoodsPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Select({
        "select",
        "id, uri, `name`, created_at, deleted_flag",
        "from goods_pic",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uri", property="uri", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_flag", property="deletedFlag", jdbcType=JdbcType.TINYINT)
    })
    GoodsPic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=GoodsPicSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GoodsPic record, @Param("example") GoodsPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=GoodsPicSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GoodsPic record, @Param("example") GoodsPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=GoodsPicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GoodsPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_pic
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Update({
        "update goods_pic",
        "set uri = #{uri,jdbcType=VARCHAR},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "deleted_flag = #{deletedFlag,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GoodsPic record);
}