package tech.sunyx.pattern.factory.factorymode;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

import tech.sunyx.pattern.factory.AmdGpu;
import tech.sunyx.pattern.factory.Gpu;

/**
 * @author by SunYuXing on 2019-01-07.
 */
public class AmdGpuFactory implements BaseGpuFactory {
    @Override
    public Gpu produceGpu() {
        AmdGpu gpu = new AmdGpu();
        List<String> features = graphicCoreCraft(new ArrayList<>());
        features.add("AMD Graphic Accelerate Technology");
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
