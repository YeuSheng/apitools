package com.trainee.util;

/**
 * 百度天气预报API
 * @author WangSheng
 * @version 创建时间：2017年3月27日 下午4:54:26
 */
public class WeatherAPI {
	private String location;
	private String output = "json";
	private String ak;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getAk() {
		return ak;
	}
	public void setAk(String ak) {
		this.ak = ak;
	}
	
	
	
}
