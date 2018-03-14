package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 7、通过Map来实现单例模式
 * 程序初始化的时候，将服务注入到一个管理类当中，使用的时候通过key来获取
 * 降低了耦合度
 */
public class Singleton7Manager {

    private static Map<String, Object> objMap = new HashMap<>();

    private Singleton7Manager() {
    }

    public static void registerService(String Key, Object instance) {
        if (!objMap.containsKey(Key)) {
            objMap.put(Key, instance);
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }
}
