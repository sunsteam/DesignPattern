package tech.sunyx.pattern.factory;

/**
 * @author by SunYuXing on 2019-01-08.
 */
public class Gpu extends ComputeCore {

    Gpu(String logo) {
        super(logo);
    }

    @Override
    public void compute() {
        System.out.println(getLogo() + " gpu compute");
        if (getFeatureList() != null && getFeatureList().size() > 0) {
            for (String feature : getFeatureList()) {
                System.out.println("compute feature : " + feature);
            }
        }
    }
}
