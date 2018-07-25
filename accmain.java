import java.util.*;
class account
{
	int ano, balance;
	int now;
	void accept()
	{
		System.out.println(" Enter account number and initial balance: ");
		Scanner z= new Scanner(System.in);
		ano=z.nextInt();
		balance=z.nextInt();
	}
	void display()
	{
		System.out.println("Account number: "+ano+ " Balance: "+balance);
	}
	void debcred(int flag, int op)
	{
		if(flag==1)
		{
			
			System.out.println("Enter amount: ");
			Scanner p=new Scanner(System.in);
			now=p.nextInt();
			if(op==1)
			{
				balance= balance-now;
				display();
			}
			else
			{
				balance=balance+now;
				display();
			}
		}
		else
		{
			System.out.println("Enter amount: ");
			Scanner p=new Scanner(System.in);
			now=p.nextInt();
			if(op==1)
			{
				balance=balance-now-5;
				display();
			}
			else
			{
				balance=balance+now-5;
				display();
			}
		}
	}
}
class acctype extends account
{
	char atype;
	int op;
	void actype()
	{
		System.out.println(" Press 's' for savings and 'c' for current :");
		Scanner m= new Scanner(System.in);
		atype=m.next().charAt(0);
		System.out.println(" Press 1 for credit and 2 for debit");
		Scanner b=new Scanner(System.in);
		op=b.nextInt();
		if(atype=='s')
		{
			debcred(1,op);
		}
		else
		{
			debcred(0,op);
		}
	}
}
class accmain
{
	public static void main( String args[])
	{
		acctype a=new acctype();
		a.accept();
		a.display();	
		a.actype();
	}
}