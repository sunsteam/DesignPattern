package tech.sunyx.pattern.factory;

import java.util.List;

/**
 * @author by SunYuXing on 2019-01-08.
 */
public abstract class ComputeCore {

    private String logo;

    ComputeCore(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    private List<String> featureList;

    public List<String> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<String> featureList) {
        this.featureList = featureList;
    }

    /**
     * 运算
     */
    public abstract void compute();
}
