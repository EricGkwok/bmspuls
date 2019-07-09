package bms.controller;

import bms.entity.BisShopUser;
import bms.service.BisShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
     * find emps by cond(done)
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
     */
    @RequestMapping("getAllUsers")
    @ResponseBody
    public List<BisShopUser> getAllUsers() {
        List<BisShopUser> users = bisShopUserService.getAllUsers();
        return users;
    }

    /**
     * find emps by cond(done)
     */
    @RequestMapping("getUsersByCond")
    @ResponseBody
    public List<BisShopUser> getUsersByCond(@RequestBody BisShopUser bisShopUser) {
        System.out.println("bisShopUser = " + bisShopUser);
        List<BisShopUser> userList = bisShopUserService.getUsersByCond(bisShopUser);
        return userList;
    }
}
