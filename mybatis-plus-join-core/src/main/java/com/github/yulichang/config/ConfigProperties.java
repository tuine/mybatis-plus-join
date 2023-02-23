package com.github.yulichang.config;

import com.github.yulichang.adapter.AdapterHelper;
import com.github.yulichang.adapter.base.IAdapter;

/**
 * @author yulichang
 * @since 1.3.7
 */
public class ConfigProperties {

    /**
     * 是否开启副表逻辑删除
     */
    public static boolean subTableLogic = true;
    /**
     * 是否开启 ms 缓存
     */
    public static boolean msCache = true;
    /**
     * 表别名
     */
    public static String tableAlias = "t";
    /**
     * 字段名重复时前缀
     */
    public static String joinPrefix = "join";
    /**
     * 适配器
     */
    public static IAdapter adapter = AdapterHelper.getAdapter();
}
