package bms.mapper;

import bms.entity.BisShopCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:36
 */
@Mapper
public interface BisShopCustomMapper {
    int deleteByPrimaryKey(@Param("customUserId") String customUserId, @Param("shopId") String shopId);

    int insert(BisShopCustom record);

    int insertSelective(BisShopCustom record);

    BisShopCustom selectByPrimaryKey(@Param("customUserId") String customUserId, @Param("shopId") String shopId);

    int updateByPrimaryKeySelective(BisShopCustom record);

    int updateByPrimaryKey(BisShopCustom record);
}