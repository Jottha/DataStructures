package com.example.demo.model;

public class Lista
{	
	private Caixinha inicio;
	
	//Criando a lista vazia
	public Lista()
	{
		this.inicio = null;
	}
	
	public void inserir(int elemento)
	{	//Tenho que criar uma nova caixinha
		Caixinha nova = new Caixinha();
		nova.setElemento(elemento);//Inser o elemento na caixnha
		nova.setProximo(null);// depois dela não vem ninguem
		
		if(inicio == null) //Vai ser a primeira caixinha?
		{	
			inicio = nova;
			
		}else	//ja tem gente na lista
		{	
			Caixinha aux;
			aux = inicio;
			while(aux.getProximo() != null)
			{
				aux = aux.getProximo();
			}
			aux.setProximo(nova);
		}
	}
	
	public int retirar()
	{	//este metódo considera que a lista sempre tem elementos
		//alguém na aplicação precisa (antes de remover), testar se a lista não esta vazia, ok?
		Caixinha aux = inicio;
		int elemento = aux.getElemento();
		inicio = aux.getProximo();
		return elemento;
		
	}
	
	public void listar()
	{
		if(inicio == null)
		{
			System.out.println("Nada a exibir - a lista ta vazia");
			
		}else
		{
			Caixinha aux = inicio;
			while(aux != null)
			{
				System.out.println("Elemento visto "+ aux.getElemento());
				aux = aux.getProximo();
			}
		}
	}
	
	public boolean isEmpty()
	{	
		return this.inicio == null;
	}

}
