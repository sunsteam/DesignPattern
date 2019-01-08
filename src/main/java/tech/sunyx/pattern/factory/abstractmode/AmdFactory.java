package tech.sunyx.pattern.factory.abstractmode;

import tech.sunyx.pattern.factory.Cpu;
import tech.sunyx.pattern.factory.Gpu;
import tech.sunyx.pattern.factory.factorymode.AmdCpuFactory;
import tech.sunyx.pattern.factory.factorymode.AmdGpuFactory;

/**
 *
 * AMD 决定CPU和GPU由不同的工厂生产
 *
 * @author by SunYuXing on 2019-01-08.
 */
public class AmdFactory extends AbstractFactory {

    private final AmdCpuFactory cpuFactory;
    private final AmdGpuFactory gpuFactory;

    public AmdFactory() {
        cpuFactory = new AmdCpuFactory();
        gpuFactory = new AmdGpuFactory();
    }

    @Override
    public Cpu produceCpu() {
        return cpuFactory.produceCpu();
    }

    @Override
    public Gpu produceGpu() {
        return gpuFactory.produceGpu();
    }
}