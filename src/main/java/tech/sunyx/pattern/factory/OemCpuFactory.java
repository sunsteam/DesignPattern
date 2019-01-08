package tech.sunyx.pattern.factory;

/**
 * @author by SunYuXing on 2019-01-07.
 */
public class OemCpuFactory {

    /**
     * 代工生产, 需要指定品牌
     *
     * @param logo 商标
     */
    public Cpu produce(String logo) {
        switch (logo) {
            case "Intel":
                return new IntelCpu();
            case "AMD":
                return new AmdCpu();
            default:
                return new Cpu(logo);
        }

    }
}
