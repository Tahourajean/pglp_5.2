package fr.uvsq;

import java.io.Serializable;

/**
 * Hello world!
 *
 */
public class Telephone implements Serializable
{
    private String numero1;
    private String numero2;
    private String numero3;
	
    public Telephone(String num1,String num2,String num3)
	{
		numero1=num1;
		numero2=num2;
		numero3=num3;
	}
	
	public Telephone()
	{
	
	}
	
	public void setNumero1(String num1)
	{
		numero1=num1;
	}
	public void setNumero2(String num2)
	{
		numero2=num2;
	}
	
	public void setNumero3(String num3)
	{
		numero3=num3;
	}


 }
