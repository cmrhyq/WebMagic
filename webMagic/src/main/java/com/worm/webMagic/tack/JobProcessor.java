package com.worm.webMagic.tack;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.scheduler.BloomFilterDuplicateRemover;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.selector.Selectable;

import java.util.List;

/**
 * @author AlanWalker on 2021/1/26 16:17
 * @version 0.0.1
 * @project webMagic
 * @package com.worm.webMagic.pojo
 * @classname JobInfo
 * @since 0.0.1
 */

@Component
public class JobProcessor implements PageProcessor {
    /**
     * 爬取的url
     */
    private String url="https://wh.ke.com/ershoufang/";

    /**
     * 编码，超时时间，重试时间,重试次数
     */
    private Site site = Site.me()
            .setCharset("utf-8")
            .setTimeOut(10*1000)
            .setRetrySleepTime(1000)
            .setSleepTime(5);



    @Override
    public void process(Page page) {
        //解析页面，获取房源信息的url
        List<Selectable> list = page.getHtml().css("ul.sellListContent li.clear").nodes();

        if(list.size() == 0){
            this.savaJobInfo(page);
        }else {
             for(Selectable selectable : list){
                 String info = selectable.links().toString();
//                 System.out.println(info);
                 page.addTargetRequest(info);
             }
        }
        String html = page.getHtml().toString();

    }

    /**
     * 解析页面
     * @param page
     */
    private void savaJobInfo(Page page) {

    }

    @Override
    public Site getSite() {
        return site;
    }

    /**
     * initialDelay当任务启动后等多久执行
     * fixedDelay每隔多久执行一次
     */
    @Scheduled(initialDelay = 1000,fixedDelay = 100*1000)
    public void process(){
        Spider.create(new JobProcessor())
                .addUrl(url)
                .setScheduler(new QueueScheduler().setDuplicateRemover(new BloomFilterDuplicateRemover(100000)))
                .thread(10)
                .run();

    }
}
