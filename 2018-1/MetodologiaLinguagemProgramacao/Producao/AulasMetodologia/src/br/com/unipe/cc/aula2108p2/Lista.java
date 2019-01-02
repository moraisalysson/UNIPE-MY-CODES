package br.com.unipe.cc.aula2108p2;

public interface Lista <T> {
	
	public void add(T n);
	
	public T remove(int pos);
	
	public int getTamanho();
	
	public T [] listarTodos();
}
