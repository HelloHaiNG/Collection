import java.util.HashMap;
import java.util.Set;

public class MapTest {
    public HashMap<String, String> maps = new HashMap<String, String>();

    /**
     * 赋值
     */
    public void put(String string1, String string2) {
        maps.put(string1, string2);
    }

    /**
     * 遍历
     */
    public void keySet() {
        Set<String> sets = maps.keySet();
        for (String string : sets) {
            String str = maps.get(string);
            System.out.print(str + " ");
        }
        System.out.println();
    }

    /**
     * 删除
     */
    public void remove(String string) {
        if (maps.size() > 0) {
            if (maps.get(string) != null) {
                maps.remove(string);
            }
        }
        keySet();
    }

    /**
     * map集合中是否包含键 是否包含值
     */
    public void containKeyOrValue(String key, String value) {
        if (maps.containsKey(key)) {
            System.out.println("包含key:" + key);
        } else {
            System.out.println("不包含key:" + key);
        }
        if (maps.containsValue(value)) {
            System.out.println("包含value:" + value);
        } else {
            System.out.println("不包含value:" + value);
        }
    }

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.put("1", "mary");
        mapTest.put("2", "jack");
        mapTest.put("3", "jim");
        mapTest.put("4", "rose");
        mapTest.keySet();
        mapTest.remove("1");
        mapTest.containKeyOrValue("2", "mark");
    }

}
