package nio.shili;

import org.springframework.stereotype.Service;

@Service
public class SunwenbinYewufacd implements SunwenbinYewuInter {
    @Override
    public void yewufangfa() {

    }

    @Override
    public Boolean support(Integer[] selectors) {
        return 1 == selectors[0];
    }
}
