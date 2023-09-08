package com.banking;

public class Bankingimpl implements Bank {
	int balance;
	public Bankingimpl(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int amt)
	{
		if(amt>0)
		{
			balance=balance+amt;
			System.out.println("amt is deposited succefully");
		}
		else
		{
			System.out.println("invalid amt");
		}
		
		System.out.println(avlBalance());
	}
	@Override
	public void withdraw(int amt)
	{
		if(amt>0 && balance>amt)
		{
			balance= balance-amt;
			System.out.println("amt is withdraw succefully");
			System.out.println(avlBalance());
		}
		else
		{
			try
			{
				InsufficientBalanceException obj=new InsufficientBalanceException("invalid fund");
			}
			catch(InsufficientBalanceException obj)
			{
				obj.getMessage();
			}
		}
		
	}
	@Override
	public int avlBalance()
	{
		System.out.print("avl bal : ");
		return balance;
	}
}
