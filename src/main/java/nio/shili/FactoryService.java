package nio.shili;

public interface FactoryService {
    /**
     * 判断是否是支持的业务类型
     *
     * @param selectors 选择器
     * @return true/false
     */
    Boolean support(Integer[] selectors);
}
