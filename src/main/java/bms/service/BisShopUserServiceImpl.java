package bms.service;

import bms.entity.BisShopPost;
import bms.entity.BisShopUser;
import bms.mapper.BisShopMapper;
import bms.mapper.BisShopPostMapper;
import bms.mapper.BisShopUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: lhyou
 * Date: 2019-07-06
 * Time: 15:52
 */
@Service
public class BisShopUserServiceImpl implements BisShopUserService {
    @Autowired
    private BisShopUserMapper bisShopUserMapper;
    @Autowired
    private BisShopMapper bisShopMapper;
    @Autowired
    private BisShopPostMapper bisShopPostMapper;

    /**
     * get accounts
     *
     * @return List<String>
     */
    @Override
    public List<BisShopUser> getAccounts() {
        return bisShopUserMapper.getAccounts();
    }

    /**
     * find all owners
     *
     * @return List<BisShopUser>
     */
    @Override
    public List<BisShopUser> getAllOwners() {
        return bisShopUserMapper.getAllOwners();
    }

    /**
     * find all users
     *
     * @return List<BisShopUser>
     */
    @Override
    public List<BisShopUser> getAllUsers() {
        List<BisShopUser> users = bisShopUserMapper.getAllUsers();
        BisShopPost bisShopPost = null;
        for (BisShopUser user : users) {
            bisShopPost = bisShopPostMapper.findPostNameByCode(user.getPostCode());
            user.setBisShopPost(bisShopPost);
        }
        return users;
    }

    /**
     * find users by cond
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    @Override
    public List<BisShopUser> getUsersByCond(BisShopUser bisShopUser) {
        List<BisShopUser> users = bisShopUserMapper.getUsersByCond(bisShopUser);
        BisShopPost bisShopPost = null;
        for (BisShopUser user : users) {
            bisShopPost = bisShopPostMapper.findPostNameByCode(user.getPostCode());
            user.setBisShopPost(bisShopPost);
        }
        return users;
    }

    /**
     * find owners by cond
     *
     * @param bisShopUser
     * @return List<BisShopUser>
     */
    @Override
    public List<BisShopUser> getOwnersByCond(BisShopUser bisShopUser) {
        return bisShopUserMapper.getOwnersByCond(bisShopUser);
    }

    /**
     * del owner by id
     *
     * @param id
     */
    @Override
    public void delOwner(String id) {
        bisShopUserMapper.delOwner(id);
    }

    /**
     * del owner by id
     *
     * @param shopUserId
     */
    @Override
    public void delOwnerById(String shopUserId) {
        bisShopUserMapper.delOwner(shopUserId);
    }

    /**
     * get the number of owners
     *
     * @return count
     */
    @Override
    public String getOwnerCount() {
        return String.valueOf(bisShopUserMapper.getOwnerCount());
    }

    /**
     * upd owner info
     *
     * @param bisShopUser
     */
    @Override
    public void updateOwner(BisShopUser bisShopUser) {
        bisShopUserMapper.updateByPrimaryKeySelective(bisShopUser);
    }

    /**
     * add owner
     *
     * @param bisShopUser
     */
    @Override
    public void addOwner(BisShopUser bisShopUser) {
        bisShopUserMapper.insert(bisShopUser);
    }

}
