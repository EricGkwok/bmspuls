package bms.controller;

import bms.entity.BisShop;
import bms.service.BisShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
 * Time: 10:08
 */
@RestController
public class BisShopController {
    @Autowired
    private BisShopService bisShopService;

    /**
     * search for all shops
     *
     * @return List<BisShop>
     */
    @RequestMapping("findAllShops")
    @ResponseBody
    public List<BisShop> findAllShops() {
        List<BisShop> shops = bisShopService.findAllShops();
        System.out.println("shops = " + shops);
        return shops;
    }
}
