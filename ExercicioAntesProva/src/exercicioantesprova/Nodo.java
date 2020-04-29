package exercicioantesprova;

public class Nodo
{
	public int dado;
	public Nodo next;
	public Nodo prev;
	
	public Nodo (int dado)
	{
		this.dado = dado;
		this.next = null;
		this.prev = null;
	}
	public void mostraNodo ()
	{
		System.out.println ("Dado: " + this.dado );
	}
}