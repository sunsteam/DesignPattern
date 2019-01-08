package tech.sunyx.pattern.factory;

/**
 * @author by SunYuXing on 2019-01-07.
 */
public class Cpu extends ComputeCore {

    Cpu(String logo) {
        super(logo);
    }

    @Override
    public void compute() {
        System.out.println(getLogo() + " cpu compute");
        if (getFeatureList() != null && getFeatureList().size() > 0) {
            for (String feature : getFeatureList()) {
                System.out.println("compute feature : " + feature);
            }
        }
    }
}
