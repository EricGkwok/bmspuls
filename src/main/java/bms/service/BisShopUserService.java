package bms.service;

import bms.entity.BisShopUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 15:51
 */
public interface BisShopUserService {
    /**
     * find all owners
     *
     * @return List<BisShopUser>
     */
    List<BisShopUser> getAllOwners();

    /**
     * find all users
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
     * find owners by cond
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    List<BisShopUser> getOwnersByCond(BisShopUser bisShopUser);
}
