package nio.shili;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
@Service
public class swbgongcahngFactory implements ServiceFactory<SunwenbinYewuInter> {
    private Collection<SunwenbinYewuInter> sunwenbinYewuInters;
    @Override
    public SunwenbinYewuInter getService(Integer[] selectors) {
        if (!CollectionUtils.isEmpty(sunwenbinYewuInters)) {
            for (SunwenbinYewuInter sunwenbinYewu : sunwenbinYewuInters) {
                if (sunwenbinYewu.support(selectors)) {
                    return sunwenbinYewu;
                }
            }
        }
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        sunwenbinYewuInters = applicationContext.getBeansOfType(SunwenbinYewuInter.class).values();
    }
}
