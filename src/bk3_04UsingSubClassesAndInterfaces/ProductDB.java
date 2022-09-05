package bk3_04UsingSubClassesAndInterfaces;

import java.io.IOException;

public class ProductDB
{
	
	public static void main(String[] args)
	{
		String productCode = "toothpaste";
		try
		{
			Product p = ProductDB.getProduct(productCode);
			System.out.println("Product Description: " + p.getProductDescptrion());
		}
	catch (ProductDataException e)
		{
		System.out.println(e.getMessage());
		}
	}
	
	public static Product getProduct(String code) throws ProductDataException
		{
		try
			{
			Product p;
			// code that gets the product from a file
			// and might throw an IOException
			p = new Product();
			return p;
			}
		catch (IOException e)
			{
			throw new ProductDataException("An IO error occurred.");
			}
		}
	}
		