package br.com.unipe.metodologia.cc.excecoes;

public class AddException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public AddException(String msg){
        super(msg);
    }

    public AddException(String msg, Throwable cause){
        super(msg, cause);
    }
	
}
