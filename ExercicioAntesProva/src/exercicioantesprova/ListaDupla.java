package exercicioantesprova;

public class ListaDupla {
	
	public Nodo prim;
	public Nodo ult;
	
	public ListaDupla() {
		
		this.prim = null;
		this.ult  = null;
	}
	
	public boolean isEmpty() {
		
		if (this.prim == null)
		    return true;
		    
		else
		    return false;
	}
	
	public void insereInicio (int elemento) {
		
		Nodo novoNodo = new Nodo(elemento);
		
		if (isEmpty())
			this.ult = novoNodo;
			
		else
			this.prim.prev = novoNodo;
		
		novoNodo.next      = this.prim;
		this.prim          = novoNodo;
	}
	
	public void insereFim (int elemento) {
		
		Nodo novoNodo = new Nodo(elemento);
		
		if (isEmpty())
			this.prim = novoNodo;
		else
			this.ult.next = novoNodo;
			
		novoNodo.prev = this.ult;
		this.ult      = novoNodo;
	}

	
	
	public Nodo removeInicio() {
		
		Nodo nodoRemove = this.prim;
		
		if (this.prim.next == null)
			this.ult = null;
		else
			this.prim.next.prev = null;
			
		this.prim = this.prim.next;
		
		return nodoRemove;
	}
	
	
	public Nodo removeFim () {
		
		Nodo nodoRemove = this.ult;
		
		if (this.ult.prev == null)
			this.prim = null;
		else
			this.ult.prev.next = null;
			
		this.ult = this.ult.prev;
		
		return nodoRemove;
	}
	
	public void mostraLista() {
		
		System.out.println ("mostra do primeiro ao ultimo");
		
		Nodo nodoAtual = this.prim;
		
		while (nodoAtual != null) {
			
			nodoAtual.mostraNodo();
			nodoAtual = nodoAtual.next;
		}
        }       
                
        public void mostraListaInversa() {
		
		System.out.println ("mostra do ultimo para o primeiro");
		
		Nodo nodoAtual = this.ult;
		
		while (nodoAtual != null) {
			
			nodoAtual.mostraNodo();
			nodoAtual = nodoAtual.prev;
		}
	}
public void insere (int elemento, int pos) {
		
		if ( (pos == 1) || (prim == null) )
			insereInicio(elemento);
			
		else {
			
			int cont = 1;
			Nodo nodoAux = prim;
			
			while ( nodoAux.next != null ) {
				
				cont++;
				nodoAux = nodoAux.next;
			}
			
			if ( pos > cont )
				insereFim(elemento);
				
			else {
				
				cont = 1;
				nodoAux = prim;
				
				while ( cont < pos ) {
					
					cont++;
					nodoAux = nodoAux.next;
				}
				
				Nodo novoNodo = new Nodo(elemento);
				novoNodo.prev = nodoAux.prev;
				novoNodo.next = nodoAux;
				
				nodoAux.prev.next = novoNodo;
				nodoAux.prev = novoNodo;
			}
		}
	}
	
	public Nodo remove (int pos) {
		
		if ( (pos == 1) || (prim == null) ) {
			
			return removeInicio();
		}
		
		else {
			
			int cont = 1;
			Nodo nodoAux = prim;
			
			while ( nodoAux.next != null ) {
				
				cont++;
				nodoAux = nodoAux.next;
			}
			
			if ( pos >= cont ) {
				
				return removeFim();
			}
				
			else {
				
				nodoAux = prim;
				cont = 1;
				
				while ( cont < pos ) {
					
					cont++;
					nodoAux = nodoAux.next;
				}
				
				nodoAux.prev.next = nodoAux.next;
				nodoAux.next.prev = nodoAux.prev;
				
				return nodoAux;
			}
		}
	}
}