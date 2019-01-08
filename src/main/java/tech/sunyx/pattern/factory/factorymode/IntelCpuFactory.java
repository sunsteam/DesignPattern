package tech.sunyx.pattern.factory.factorymode;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

import tech.sunyx.pattern.factory.Cpu;
import tech.sunyx.pattern.factory.IntelCpu;

/**
 * @author by SunYuXing on 2019-01-07.
 */
public class IntelCpuFactory implements BaseCpuFactory {
    @Override
    public Cpu produceCpu() {
        IntelCpu cpu = new IntelCpu();
        List<String> features = tenNmCraft(new ArrayList<>());
        features.add("Intel Supper Power");
        cpu.setFeatureList(features);
        return cpu;
    }

    private static List<String> tenNmCraft(@NotNull ArrayList<String> features) {
        features.add("faster");
        features.add("low-energy");
        features.add("more stable");
        return features;
    }
}
