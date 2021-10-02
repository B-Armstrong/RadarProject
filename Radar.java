import java.io.*;

class Radar implements Serializable

{
private int count;
private String magnetron;
private String modNum;
private String manufacturer;
	public Radar() {}
	
	public Radar(String model,  String mag)
	{
	magnetron = mag;
	modNum = model;
	return;
	}
	public Radar(String manu, String model, String mag)
	{
	magnetron = mag;
	modNum = model;
	manufacturer = manu;
	return;
	}
	public String getMagnetron()
	{
		return magnetron;
	}
	public String getModNum()
	{
		return modNum;
	}
	public String getManufacturer()
	{
		return manufacturer;
	}
	public int getCount()
	{
		return count;
	}
	public void setCount(int cnt)
	{
		count = cnt;
	}
}