package com.imi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OAuthToken {

	protected static final SimpleDateFormat TIMESTAMP_SDF = new SimpleDateFormat("ddMMyyyyHHmmss");
	private String accessToken;
	private long expiresIn;
	private String scope;
	private String tokenType;
	/**
	 * Using string to save space
	 * timestamp in ddMMyyyyHHmmss format
	 */
	private String receivedOn;
	private String refreshToken;
	
	//default constructor
	public OAuthToken() {}
	
	//copy constructor: only for subclasses
	protected OAuthToken(OAuthToken refToken) {
		this.accessToken = refToken.accessToken;
		this.expiresIn = refToken.expiresIn;
		this.receivedOn = refToken.receivedOn;
		this.scope = refToken.scope;
		this.refreshToken = refToken.refreshToken;
		this.tokenType = refToken.tokenType;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public long getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public String getReceivedOn() {
		return receivedOn;
	}
	public void setReceivedOn(String receivedOn) {
		this.receivedOn = receivedOn;
	}
	/**
	 * Converts date to string timestamp in ddMMyyyyHHmmss format
	 * @param receivedOn
	 */
	public void setReceivedOn(Date receivedOn) {
		this.receivedOn = TIMESTAMP_SDF.format(receivedOn);
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
}
