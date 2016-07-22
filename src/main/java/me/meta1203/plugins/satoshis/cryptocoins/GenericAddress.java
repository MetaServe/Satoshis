package me.meta1203.plugins.satoshis.cryptocoins;

public interface GenericAddress <T> {
	public T getAddress();
	public String getAddressAsString();
	public String getUserReadableInformation();
	public void setAddress(Object addr);
	public void setAddress(String addrStr);
}