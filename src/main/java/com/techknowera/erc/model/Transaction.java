package com.techknowera.erc.model;
public class Transaction
{
    private Double ether;

    private String fromAddress;

    private String toAddress;

    public Double getEther ()
    {
        return ether;
    }

    public void setEther (Double ether)
    {
        this.ether = ether;
    }

    public String getFromAddress ()
    {
        return fromAddress;
    }

    public void setFromAddress (String fromAddress)
    {
        this.fromAddress = fromAddress;
    }

    public String getToAddress ()
    {
        return toAddress;
    }

    public void setToAddress (String toAddress)
    {
        this.toAddress = toAddress;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ether = "+ether+", fromAddress = "+fromAddress+", toAddress = "+toAddress+"]";
    }
}
			