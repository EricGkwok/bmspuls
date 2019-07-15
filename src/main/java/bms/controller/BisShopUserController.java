package bms.controller;

import bms.entity.BisShopUser;
import bms.service.BisShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 15:50
 */
@RestController
public class BisShopUserController {

    @Autowired
    private BisShopUserService bisShopUserService;

    /**
     * find owners(done)
     *
     * @return List<BisShopUser>
     */
    @RequestMapping("getAllOwners")
    @ResponseBody
    public List<BisShopUser> getAllOwners() {
        return bisShopUserService.getAllOwners();
    }

    /**
     * find owners by cond(done)
     */
    @RequestMapping("getOwnersByCond")
    @ResponseBody
    public List<BisShopUser> getOwnersByCond(@RequestBody BisShopUser bisShopUser) {
        List<BisShopUser> userList =
                bisShopUserService.getOwnersByCond(bisShopUser);
        return userList;
    }

    /**
     * find emps(done)
     *
     * @return List<BisShopUser>
     */
    @RequestMapping("getAllUsers")
    @ResponseBody
    public List<BisShopUser> getAllUsers() {
        List<BisShopUser> users = bisShopUserService.getAllUsers();
        return users;
    }

    /**
     * find emps by cond(done)
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    @RequestMapping("getUsersByCond")
    @ResponseBody
    public List<BisShopUser> getUsersByCond(@RequestBody BisShopUser bisShopUser) {
        List<BisShopUser> userList = bisShopUserService.getUsersByCond(bisShopUser);
        return userList;
    }

    /**
     * del_more Owner by id(done)
     *
     * @param ownerIds
     * @return List<BisShopUser>
     */
    @RequestMapping("delOwner")
    @ResponseBody
    public List<BisShopUser> delOwner(String[] ownerIds) {
        for (String id : ownerIds) {
            bisShopUserService.delOwner(id);
        }
        List<BisShopUser> owners = getAllOwners();
        return owners;
    }

    /**
     * del owner by id(done)
     *
     * @param ownerId
     * @return List<BisShopUser>
     */
    @RequestMapping("delOwnerById")
    @ResponseBody
    public List<BisShopUser> delOwnerById(String shopUserId) {
        bisShopUserService.delOwnerById(shopUserId);
        List<BisShopUser> owners = getAllOwners();
        return owners;
    }

    /**
     * get the number of owners
     *
     * @return count
     */
    @RequestMapping("getOwnerCount")
    @ResponseBody
    public String getOwnerCount() {
        String count = bisShopUserService.getOwnerCount();
        return count;
    }

    /**
     * upd owner (done)
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    @RequestMapping("updOwner")
    @ResponseBody
    public List<BisShopUser> updOwner(@RequestBody BisShopUser bisShopUser) {
        bisShopUserService.updateOwner(bisShopUser);
        return getAllOwners();
    }

    /**
     * add owner(未完成)
     *
     * @param bisShopUser
     * @return
     */
    @RequestMapping("addOwner")
    public List<BisShopUser> addOwner(@RequestBody BisShopUser bisShopUser) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        bisShopUser.setUserType("1");
        bisShopUser.setIsDel("0");
        bisShopUser.setShopUserId(uuid);
        bisShopUserService.addOwner(bisShopUser);
        return getAllOwners();
    }
}
