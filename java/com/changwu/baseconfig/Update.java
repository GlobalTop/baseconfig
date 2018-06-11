package com.changwu.baseconfig;

/**
 * Created by Administrator on 2018/6/11.
 */
public class Update {
    /*版本*/
    public String version;
    /*版本号*/
    public int versionCode;
    /*版本描述*/
    public String versionDesc;
    /*版本下载地址*/
    public String versionAddress;
    /*忽略版本号*/
    public int identifyingCode;
    /*APP版本强制更新开关 1 是  0 否*/
    public String versionForceUpdate;
    /*注册验证码开关 1 是 0 否*/
    public String captchaSwitch;
    /*用户注册协议*/
    public String useragreement;

    @Override
    public String toString() {
        return "Update{" +
                "version='" + version + '\'' +
                ", versionCode=" + versionCode +
                ", versionDesc='" + versionDesc + '\'' +
                ", versionAddress='" + versionAddress + '\'' +
                ", identifyingCode=" + identifyingCode +
                ", versionForceUpdate='" + versionForceUpdate + '\'' +
                ", captchaSwitch='" + captchaSwitch + '\'' +
                ", useragreement='" + useragreement + '\'' +
                '}';
    }
}
