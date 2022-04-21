package study.hsp.aggregate集合;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static net.mindview.util.Print.print;

public class ConcurrentHashMap_ {
    public static void main(String[] args) {
        ConcurrentHashMap<Object, Object> conMap = new ConcurrentHashMap<>();

        conMap.put(1, "2");
        print(conMap);

        Map<Object, Object> hashMap = Collections.synchronizedMap(new HashMap<>());
        hashMap.put(2, "11");

    }
}

