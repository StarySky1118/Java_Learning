package com.zzy.genericexercise03_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DAO<T> {
    private Map<String, T> map;

    /**
     * 保存键值对(Key=id,Value=entity)到map中。
     * @param id 键
     * @param entity 值
     */
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * 获取Key=id对应的Value。
     * @param id 键
     * @return 键id对应的值
     */
    public T get(String id) {
        return map.get(id);
    }

    /**
     * 更新键值对(id,entity)
     * @param id 键
     * @param entity 值
     */
    public void update(String id, T entity) {
        map.put(id, entity);
    }

    /**
     * 返回map中存放的所有T对象，即value。
     * @return 值列表
     */
    public List<T> list() {
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;
    }

    /**
     * 删除指定id对象
     * @param id 键
     */
    public void delete(String id) {
        map.remove(id);
    }
}
