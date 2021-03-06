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
import org.doubleluck.radish_purchase_api.model.example.UserRoleRelExample;
import org.doubleluck.radish_purchase_api.model.po.UserRoleRel;

public interface UserRoleRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=UserRoleRelSqlProvider.class, method="countByExample")
    long countByExample(UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @DeleteProvider(type=UserRoleRelSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Delete({
        "delete from user_role_rel",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Insert({
        "insert into user_role_rel (user_id, role_id, ",
        "created_at, delete_flag)",
        "values (#{userId,jdbcType=BIGINT}, #{roleId,jdbcType=BIGINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{deleteFlag,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserRoleRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @InsertProvider(type=UserRoleRelSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(UserRoleRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @SelectProvider(type=UserRoleRelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    })
    List<UserRoleRel> selectByExample(UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Select({
        "select",
        "id, user_id, role_id, created_at, delete_flag",
        "from user_role_rel",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="delete_flag", property="deleteFlag", jdbcType=JdbcType.TINYINT)
    })
    UserRoleRel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=UserRoleRelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserRoleRel record, @Param("example") UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=UserRoleRelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserRoleRel record, @Param("example") UserRoleRelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @UpdateProvider(type=UserRoleRelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserRoleRel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_rel
     *
     * @mbg.generated Mon Aug 27 15:04:52 CST 2018
     */
    @Update({
        "update user_role_rel",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "role_id = #{roleId,jdbcType=BIGINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "delete_flag = #{deleteFlag,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserRoleRel record);
}