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
     * get accounts
     * @return  List<String>
     */
    List<BisShopUser> getAccounts();

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

    /**
     * del owner by id
     *
     * @param id
     */
    void delOwner(String id);

    /**
     * del owner by id
     *
     * @param id
     */
    void delOwnerById(String shopUserId);

    /**
     * get the number of owners
     *
     * @return count
     */
    String getOwnerCount();

    /**
     * upd owner info
     *
     * @param bisShopUser
     */
    void updateOwner(BisShopUser bisShopUser);

    /**
     * add owner
     *
     * @param bisShopUser
     */
    void addOwner(BisShopUser bisShopUser);


}
