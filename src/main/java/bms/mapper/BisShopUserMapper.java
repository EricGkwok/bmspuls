package bms.mapper;

import bms.entity.BisShopUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:37
 */
@Mapper
public interface BisShopUserMapper {
    int deleteByPrimaryKey(String shopUserId);

    int insert(BisShopUser record);

    int insertSelective(BisShopUser record);

    BisShopUser selectByPrimaryKey(String shopUserId);

    int updateByPrimaryKeySelective(BisShopUser record);

    int updateByPrimaryKey(BisShopUser record);

    /**
     * 查询店主账号,姓名
     *
     * @return BisShopUser
     */
    BisShopUser getOwnerByShopId();
}