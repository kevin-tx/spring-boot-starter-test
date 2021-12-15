package com.kevin;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author TX
 * @date 2021/12/14 20:09
 */
@ConfigurationProperties(prefix = "yuanqinnan.hello")
public class HelloProperties {
    //前缀
    private String prefix;
    //后缀
    private String suffix;
    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getSuffix() {
        return suffix;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}