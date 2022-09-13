package questao01;


public class elemento {
	
		private int senha;
		private elemento proximo;
	
			public elemento(int novaSenha){
					this.senha = novaSenha;
	}
			
	public int getSenha() {
        return senha;
    }

		public void setSenha(int senha) {
			this.senha = senha;
    }

    	public elemento getProximo() {
    		return proximo;
    }

    	public void setProximo(elemento proximo) {
    		this.proximo = proximo;
    }
}


