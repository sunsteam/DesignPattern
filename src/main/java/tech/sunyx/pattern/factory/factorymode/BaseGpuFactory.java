package tech.sunyx.pattern.factory.factorymode;

import tech.sunyx.pattern.factory.Gpu;

/**
 * @author by SunYuXing on 2019-01-07.
 */
public interface BaseGpuFactory {

    /**
     * 标准化生产规范,不需要关心任何生产细节
     * @return Gpu
     */
    Gpu produceGpu();
}
