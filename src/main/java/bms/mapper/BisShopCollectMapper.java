package bms.mapper;

import bms.entity.BisShopCollect;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:35
 */
@Mapper
public interface BisShopCollectMapper {
    int deleteByPrimaryKey(String collectId);

    int insert(BisShopCollect record);

    int insertSelective(BisShopCollect record);

    BisShopCollect selectByPrimaryKey(String collectId);

    int updateByPrimaryKeySelective(BisShopCollect record);

    int updateByPrimaryKey(BisShopCollect record);
}