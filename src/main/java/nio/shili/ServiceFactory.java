package nio.shili;

import org.springframework.context.ApplicationContextAware;

/**
 * Service工厂
 * Created by zhangjiwei on 16/7/21.
 */
public interface ServiceFactory<T> extends ApplicationContextAware {
    /**
     * 获取指定的service
     *
     * @param selectors 选择器（参数数组）
     * @return T
     */
    T getService(Integer[] selectors);
}