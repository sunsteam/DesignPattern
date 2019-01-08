package factory;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import tech.sunyx.pattern.factory.ComputeCore;
import tech.sunyx.pattern.factory.Cpu;
import tech.sunyx.pattern.factory.OemCpuFactory;
import tech.sunyx.pattern.factory.abstractmode.AbstractFactory;
import tech.sunyx.pattern.factory.abstractmode.AmdFactory;
import tech.sunyx.pattern.factory.abstractmode.IntelFactory;
import tech.sunyx.pattern.factory.factorymode.AmdCpuFactory;
import tech.sunyx.pattern.factory.factorymode.BaseCpuFactory;
import tech.sunyx.pattern.factory.factorymode.IntelCpuFactory;

/**
 * 工厂模式、抽象工厂
 * <p>
 * - 定义
 * <p>
 * 保证创建的对象符合标准，使用者只需要从工厂获得对象，不需要关心对象的创建细节。同时符合开闭原则，当有新产品时，使用者只需要创建新工厂。
 * <p>
 * 但是，工厂模式只关心生产，不关心生产的产品是什么，生产什么产品类型是由使用者创建哪种产品的工厂时控制的
 * <p>
 * 抽象工厂能生产一系列相关联的产品，使用者不再需要关心创建什么类型的工厂，而只需要创建工厂的实例，就能获得各种产品。在新产品出现时，使用者不需要知道创建什么类型的工厂，直接从现有工厂中就能获取新产品
 * <p>
 * - 使用情景
 * <p>
 * 1. 需要对使用者隐藏复杂对象的创建细节，保证生产出符合要求的对象时 <br>
 * 2. 某些创建对象的生产资料不应该被使用者获取时 <br>
 * 3. 需要使用者对创建对象的过程进行扩展实现时 <br>
 *
 * @author by SunYuXing on 2019-01-07.
 */
public class FactoryTest {
    /**
     * 工厂方法模式
     */
    @Test
    public void testCpu() {
        // 产品招标
        List<Cpu> testCpus = new ArrayList<>();
        // 简单工厂
        OemCpuFactory oemCpuFactory = new OemCpuFactory();
        testCpus.add(oemCpuFactory.produce("DragonCore"));
        // 工厂方法
        List<BaseCpuFactory> standardCpuFactories = new ArrayList<>();
        standardCpuFactories.add(new IntelCpuFactory());
        standardCpuFactories.add(new AmdCpuFactory());

        for (BaseCpuFactory standardCpuFactory : standardCpuFactories) {
            testCpus.add(standardCpuFactory.produceCpu());
        }

        for (Cpu cpu : testCpus) {
            cpu.compute();
        }
    }


    /**
     * 抽象工厂模式
     */
    @Test
    public void testIntegratePerformance() {
        List<ComputeCore> testCores = new ArrayList<>();

        List<AbstractFactory> absFactories = new ArrayList<>();
        absFactories.add(new IntelFactory());
        absFactories.add(new AmdFactory());

        for (AbstractFactory factory : absFactories) {
            testCores.add(factory.produceCpu());
            testCores.add(factory.produceGpu());
        }

        for (ComputeCore computeCore : testCores) {
            computeCore.compute();
        }
    }

}
