package bms.mapper;

import bms.entity.BisShopUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
     * 查询店主信息
     *
     * @return BisShopUser
     */
    BisShopUser getOwnerByShopId(String shopUserId);


    /**
     * find all owners
     *
     * @return List<BisShopUser>
     */
    List<BisShopUser> getAllOwners();

    /**
     * find all owners
     *
     * @return List<BisShopUser>
     */
    List<BisShopUser> getAllUsers();

    /**
     * find users by cond
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    List<BisShopUser> getUsersByCond(BisShopUser bisShopUser);

    /**
     * find users by cond
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    List<BisShopUser> getOwnersByCond(BisShopUser bisShopUser);

    /**
     * del owner by id
     *
     * @param id
     */
    void delOwner(String id);

    /**
     * get the number of owners
     *
     * @return count
     */
    Integer getOwnerCount();

    /**
     * get accounts
     *
     * @return List<String>
     */
    List<BisShopUser> getAccounts();
}