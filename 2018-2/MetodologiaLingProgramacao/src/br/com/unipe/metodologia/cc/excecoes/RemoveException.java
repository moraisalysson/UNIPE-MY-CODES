package br.com.unipe.metodologia.cc.excecoes;

public class RemoveException extends Exception {

	private static final long serialVersionUID = 1L;

	public RemoveException(String msg){
        super(msg);
    }

    public RemoveException(String msg, Throwable cause){
        super(msg, cause);
    }
}
