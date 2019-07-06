package bms.mapper;

import bms.entity.BisShopLoginlog;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:36
 */
@Mapper
public interface BisShopLoginlogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(BisShopLoginlog record);

    int insertSelective(BisShopLoginlog record);

    BisShopLoginlog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(BisShopLoginlog record);

    int updateByPrimaryKey(BisShopLoginlog record);
}