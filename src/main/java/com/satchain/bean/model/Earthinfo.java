package com.satchain.bean.model;

/**
 * 地面站信息表
 */
public class Earthinfo {
    private Long id;

    private String earthUuid;//地面站编号

    private String earthName;//地面站名称

    private Byte earthType;//地面站类型

    private String earthTelemetryFrequency;//地面站遥测频率

    private String earthTelemetryGain;//站遥测增益

    private String earthTelecontrolFrequency;//地面站遥控频率

    private String earthTelecontrolErp;//`地面站遥控ERP值`

    private String dataDownlinkFrequency;//数据下行频率

    private String dataDownlinkGain;//数据下行增益

    private String dataUplinkFrequency;//数据上行频率

    private String dataUplinkErp;//数据上行ERP值

    private Float longitude;//经度

    private Float latitude;//纬度

    private String ip;//IP地址

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEarthUuid() {
        return earthUuid;
    }

    public void setEarthUuid(String earthUuid) {
        this.earthUuid = earthUuid;
    }

    public String getEarthName() {
        return earthName;
    }

    public void setEarthName(String earthName) {
        this.earthName = earthName;
    }

    public Byte getEarthType() {
        return earthType;
    }

    public void setEarthType(Byte earthType) {
        this.earthType = earthType;
    }

    public String getEarthTelemetryFrequency() {
        return earthTelemetryFrequency;
    }

    public void setEarthTelemetryFrequency(String earthTelemetryFrequency) {
        this.earthTelemetryFrequency = earthTelemetryFrequency;
    }

    public String getEarthTelemetryGain() {
        return earthTelemetryGain;
    }

    public void setEarthTelemetryGain(String earthTelemetryGain) {
        this.earthTelemetryGain = earthTelemetryGain;
    }

    public String getEarthTelecontrolFrequency() {
        return earthTelecontrolFrequency;
    }

    public void setEarthTelecontrolFrequency(String earthTelecontrolFrequency) {
        this.earthTelecontrolFrequency = earthTelecontrolFrequency;
    }

    public String getEarthTelecontrolErp() {
        return earthTelecontrolErp;
    }

    public void setEarthTelecontrolErp(String earthTelecontrolErp) {
        this.earthTelecontrolErp = earthTelecontrolErp;
    }

    public String getDataDownlinkFrequency() {
        return dataDownlinkFrequency;
    }

    public void setDataDownlinkFrequency(String dataDownlinkFrequency) {
        this.dataDownlinkFrequency = dataDownlinkFrequency;
    }

    public String getDataDownlinkGain() {
        return dataDownlinkGain;
    }

    public void setDataDownlinkGain(String dataDownlinkGain) {
        this.dataDownlinkGain = dataDownlinkGain;
    }

    public String getDataUplinkFrequency() {
        return dataUplinkFrequency;
    }

    public void setDataUplinkFrequency(String dataUplinkFrequency) {
        this.dataUplinkFrequency = dataUplinkFrequency;
    }

    public String getDataUplinkErp() {
        return dataUplinkErp;
    }

    public void setDataUplinkErp(String dataUplinkErp) {
        this.dataUplinkErp = dataUplinkErp;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}