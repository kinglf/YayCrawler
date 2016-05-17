package yaycrawler.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yaycrawler.common.model.CrawlerRequest;
import yaycrawler.common.model.CrawlerResult;
import yaycrawler.common.model.RestFulResult;
import yaycrawler.master.service.CrawlerQueueService;

import java.util.List;

/**
 * Created by ucs_yuananyun on 2016/5/12.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CrawlerQueueService crawlerQueueService;

    @RequestMapping("/registerQueues")
    @ResponseBody
    public boolean acceptAdminTask(@RequestBody List<CrawlerRequest> crawlerRequests)
    {
        return crawlerQueueService.regeditQueues(crawlerRequests);
    }
}