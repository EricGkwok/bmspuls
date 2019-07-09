package bms.controller;

import bms.entity.BisShopPost;
import bms.service.BisShopPostService;
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
 * Date: 2019-07-09
 * Time: 14:18
 */
@RestController
public class BisShopPostController {
    @Autowired
    private BisShopPostService bisShopPostService;

    /**
     * find post info
     *
     * @return List<BisShopPost>
     */
    @RequestMapping("getPosts")
    @ResponseBody
    public List<BisShopPost> getPosts() {
        List<BisShopPost> posts = bisShopPostService.getPosts();
        return posts;
    }

    /**
     * find post info by cond
     *
     * @return List<BisShopPost>
     */
    @RequestMapping("getPostsByCond")
    @ResponseBody
    public List<BisShopPost> getPostsByCond(@RequestBody(required = false) BisShopPost bisShopPost) {
        System.out.println("bisShopPost = " + bisShopPost);
        List<BisShopPost> posts = bisShopPostService.getPostsByCond(bisShopPost);
        return posts;
    }
}
