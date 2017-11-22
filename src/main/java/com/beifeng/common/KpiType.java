package com.beifeng.common;

/**
 * 统计kpi的名称枚举类
 *
 * @author gerry
 */
public enum KpiType {
    NEW_INSTALL_USER("new_install_user"),//统计新用户的kpi
    BROWSER_NEW_INSTALL_USER("browser_new_install_user"),//统计浏览器维度的新用户kpi
    ACTIVE_USER("active_user"),//统计活跃用户kpi
    BROWSER_ACTIVE_USER("browser_active_user"),//统计浏览器维度的活跃用户kpi
    ACTIVE_MEMBER("active_member"),//统计活跃会员kpi
    BROWSER_ACTIVE_MEMBER("browser_active_member"),//统计浏览器维度的活跃会员kpi
    NEW_MEMBER("new_member"),//统计新增会员kpi
    BROWSER_NEW_MEMBER("browser_new_member"),//统计浏览器维度新增会员Kpi
    INSERT_MEMBER_INFO("insert_member_info"),//插入会员信息kpi
    SESSIONS("sessions"),//统计会话kpi
    BROWSER_SESSIONS("browser_sessions"),//统计浏览器维度会话kpi
    HOURLY_ACTIVE_USER("hourly_active_user"),//按小时统计活跃用户Kpi
    HOURLY_SESSIONS("hourly_sessions"),//按小时统计会话kpi
    HOURLY_SESSIONS_LENGTH("hourly_sessions_length"),//按小时统计会话长度
    WEBSITE_PAGEVIEW("website_pageview"),//统计浏览器维度的pv kpi
    LOCATION("location"),//统计地域信息维度的Kpi
    ;

    public final String name;

    private KpiType(String name) {
        this.name = name;
    }

    public static KpiType valueOfName(String name) {
        for (KpiType type : values()) {
            if (type.name.equals(name)) {
                return type;
            }
        }
        throw new RuntimeException("指定的name不属于该KpiType枚举类，name:" + name);
    }
}
