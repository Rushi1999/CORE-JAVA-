class variableDemo3
{
	public static void main(String[] args)
	{
		int qty=5;
		double price=300;
		double totalAmount;
		double totalprice;

		totalAmount= (qty * price);

		totalprice= (totalAmount) + (totalAmount * 5/100);

		System.out.println("TOTAL PRICE: "+totalprice);
	}
}
