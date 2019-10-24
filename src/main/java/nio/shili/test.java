package nio.shili;

import javax.annotation.Resource;

public class test {
    @Resource
    private swbgongcahngFactory  swbgongcahngFactory;

    public void main(String[] args) {
        SunwenbinYewuInter doservice = swbgongcahngFactory.getService(new Integer[]{1});
        doservice.yewufangfa();


    }
}
