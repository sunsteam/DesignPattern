package tech.sunyx.pattern.factory.abstractmode;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

import tech.sunyx.pattern.factory.Cpu;
import tech.sunyx.pattern.factory.Gpu;
import tech.sunyx.pattern.factory.IntelCpu;
import tech.sunyx.pattern.factory.IntelGpu;

/**
 * Intel 新的工厂合并CPU和GPU流水线
 *
 * @author by SunYuXing on 2019-01-08.
 */
public class IntelFactory extends AbstractFactory {
    @Override
    public Cpu produceCpu() {
        IntelCpu cpu = new IntelCpu();
        List<String> features = tenNmCraft(new ArrayList<>());
        features.add("Intel Supper Power");
        features.add("Intel Second Generation i7 CPU");
        cpu.setFeatureList(features);
        return cpu;
    }

    private static List<String> tenNmCraft(@NotNull ArrayList<String> features) {
        features.add("faster");
        features.add("low-energy");
        features.add("more stable");
        features.add("virtual compute technology");
        return features;
    }

    @Override
    public Gpu produceGpu() {
        IntelGpu gpu = new IntelGpu();
        List<String> features = graphicCoreCraft(new ArrayList<>());
        features.add("Intel Supper Power");
        features.add("Intel VR Enhance");
        gpu.setFeatureList(features);
        return gpu;
    }

    private static List<String> graphicCoreCraft(@NotNull ArrayList<String> features) {
        features.add("3D faster");
        features.add("low-energy");
        features.add("more detail");
        return features;
    }
}
