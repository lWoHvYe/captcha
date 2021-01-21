package com.anji.captcha.properties;

import com.anji.captcha.model.common.CaptchaTypeEnum;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.anji.captcha.properties.AjCaptchaProperties.PREFIX;
import static com.anji.captcha.properties.AjCaptchaProperties.StorageType.local;

@ConfigurationProperties(PREFIX)
public class AjCaptchaProperties {
    public static final String PREFIX = "aj.captcha";

    /**
     * 验证码类型.
     */
    private CaptchaTypeEnum type = CaptchaTypeEnum.DEFAULT;

    /**
     * 滑动拼图底图路径.
     */
    private String jigsaw = "";

    /**
     * 点选文字底图路径.
     */
    private String picClick = "";


    /**
     * 右下角水印文字(我的水印).
     */
    private String waterMark = "我的水印";

    /**
     * 右下角水印字体(思源黑体).
     */
    private String waterFont = "SourceHanSansCN-Normal.otf";

    /**
     * 点选文字验证码的文字字体(思源黑体).
     */
    private String fontType = "SourceHanSansCN-Normal.otf";

    /**
     * 校验滑动拼图允许误差偏移量(默认5像素).
     */
    private String slipOffset = "5";

    /**
     * aes加密坐标开启或者禁用(true|false).
     */
    private Boolean aesStatus = true;

    /**
     * 滑块干扰项(0/1/2)
     */
    private String interferenceOptions = "0";

    /**
     * local缓存的阈值
     */
    private String cacheNumber = "1000";

    /**
     * 定时清理过期local缓存(单位秒)
     */
    private String timingClear = "180";

    /**
     * 缓存类型redis/local/....
     */
    private StorageType cacheType = local;
    private boolean reqFrequencyLimitEnable = false;
    private int reqGetLockLimit = 5;
    private int reqGetLockSeconds = 300;
    private int reqGetMinuteLimit = 120;
    private int reqCheckMinuteLimit = 60;
    private int reqVerifyMinuteLimit = 60;

    public boolean getReqFrequencyLimitEnable() {
        return reqFrequencyLimitEnable;
    }

    public void setReqFrequencyLimitEnable(boolean reqFrequencyLimitEnable) {
        this.reqFrequencyLimitEnable = reqFrequencyLimitEnable;
    }

    public int getReqGetLockLimit() {
        return reqGetLockLimit;
    }

    public void setReqGetLockLimit(int reqGetLockLimit) {
        this.reqGetLockLimit = reqGetLockLimit;
    }

    public int getReqGetLockSeconds() {
        return reqGetLockSeconds;
    }

    public void setReqGetLockSeconds(int reqGetLockSeconds) {
        this.reqGetLockSeconds = reqGetLockSeconds;
    }

    public int getReqGetMinuteLimit() {
        return reqGetMinuteLimit;
    }

    public void setReqGetMinuteLimit(int reqGetMinuteLimit) {
        this.reqGetMinuteLimit = reqGetMinuteLimit;
    }

    public int getReqCheckMinuteLimit() {
        return reqGetMinuteLimit;
    }

    public void setReqCheckMinuteLimit(int reqCheckMinuteLimit) {
        this.reqCheckMinuteLimit = reqCheckMinuteLimit;
    }

    public int getReqVerifyMinuteLimit() {
        return reqVerifyMinuteLimit;
    }

    public void setReqVerifyMinuteLimit(int reqVerifyMinuteLimit) {
        this.reqVerifyMinuteLimit = reqVerifyMinuteLimit;
    }

    public enum StorageType {
        /**
         * 内存.
         */
        local,
        /**
         * redis.
         */
        redis,
        /**
         * 其他.
         */
        other,
    }

    public static String getPREFIX() {
        return PREFIX;
    }

    public CaptchaTypeEnum getType() {
        return type;
    }

    public void setType(CaptchaTypeEnum type) {
        this.type = type;
    }

    public String getJigsaw() {
        return jigsaw;
    }

    public void setJigsaw(String jigsaw) {
        this.jigsaw = jigsaw;
    }

    public String getPicClick() {
        return picClick;
    }

    public void setPicClick(String picClick) {
        this.picClick = picClick;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterFont() {
        return waterFont;
    }

    public void setWaterFont(String waterFont) {
        this.waterFont = waterFont;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public String getSlipOffset() {
        return slipOffset;
    }

    public void setSlipOffset(String slipOffset) {
        this.slipOffset = slipOffset;
    }

    public Boolean getAesStatus() {
        return aesStatus;
    }

    public void setAesStatus(Boolean aesStatus) {
        this.aesStatus = aesStatus;
    }

    public StorageType getCacheType() {
        return cacheType;
    }

    public void setCacheType(StorageType cacheType) {
        this.cacheType = cacheType;
    }

    public String getInterferenceOptions() {
        return interferenceOptions;
    }

    public void setInterferenceOptions(String interferenceOptions) {
        this.interferenceOptions = interferenceOptions;
    }

    public String getCacheNumber() {
        return cacheNumber;
    }

    public void setCacheNumber(String cacheNumber) {
        this.cacheNumber = cacheNumber;
    }

    public String getTimingClear() {
        return timingClear;
    }

    public void setTimingClear(String timingClear) {
        this.timingClear = timingClear;
    }

    @Override
    public String toString() {
        return "\nAjCaptchaProperties{" +
                "type=" + type +
                ", jigsaw='" + jigsaw + '\'' +
                ", picClick='" + picClick + '\'' +
                ", waterMark='" + waterMark + '\'' +
                ", waterFont='" + waterFont + '\'' +
                ", fontType='" + fontType + '\'' +
                ", slipOffset='" + slipOffset + '\'' +
                ", aesStatus=" + aesStatus +
                ", interferenceOptions='" + interferenceOptions + '\'' +
                ", cacheNumber='" + cacheNumber + '\'' +
                ", timingClear='" + timingClear + '\'' +
                ", cacheType=" + cacheType +
                ", reqFrequencyLimitEnable=" + reqFrequencyLimitEnable +
                ", reqGetLockLimit=" + reqGetLockLimit +
                ", reqGetLockSeconds=" + reqGetLockSeconds +
                ", reqGetMinuteLimit=" + reqGetMinuteLimit +
                ", reqCheckMinuteLimit=" + reqCheckMinuteLimit +
                ", reqVerifyMinuteLimit=" + reqVerifyMinuteLimit +
                '}';
    }
}
