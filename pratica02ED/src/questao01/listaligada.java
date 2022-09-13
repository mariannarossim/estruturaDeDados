package questao01;



public class listaligada {
	
	 private elemento primeiro;
	 private elemento ultimo;
	 private int tamanho;
	    
	 public void ListaLigada(){
	        this.tamanho = 0;
	    }

	    public elemento getPrimeiro() {
	        return primeiro;
	    }

	    public void setPrimeiro(elemento primeiro) {
	        this.primeiro = primeiro;
	    }

	    public elemento getUltimo() {
	        return ultimo;
	    }

	    public void setUltimo(elemento ultimo) {
	        this.ultimo = ultimo;
	    }

	    public int getTamanho() {
	        return tamanho;
	    }

	    public void setTamanho(int tamanho) {
	        this.tamanho = tamanho;
	    }
	    
	    public void adicionar(int novaSenha){
	    	elemento novoElemento = new elemento(novaSenha);
	        if (this.primeiro == null && this.ultimo == null){
	            this.primeiro = novoElemento;
	            this.ultimo = novoElemento;            
	        }else{
	            this.ultimo.setProximo(novoElemento);
	            this.ultimo = novoElemento;            
	        }
	        this.tamanho++;
	    }
	    
	    public void remover(int valorProcurado){
	    	elemento anterior = null;
	    	elemento atual = this.primeiro;
	        for(int i=0; i < this.getTamanho(); i++){            
	            if (atual.getSenha()==valorProcurado){
	                if (this.tamanho == 1){
	                    this.primeiro = null;
	                    this.ultimo = null;
	                }else if (atual == primeiro){
	                    this.primeiro = atual.getProximo();
	                    atual.setProximo(null);
	                }else if (atual == ultimo){
	                    this.ultimo = anterior;
	                    anterior.setProximo(null);
	                }else{
	                    anterior.setProximo(atual.getProximo());
	                    atual = null;
	                }
	                this.tamanho--;
	                break;
	            }
	            anterior = atual;
	            atual = atual.getProximo();
	        }
	    }
	    
	    public elemento get(int posicao){
	    	elemento atual = this.primeiro;
	        for(int i=0; i < posicao; i++){
	            if (atual.getProximo() != null){
	                atual = atual.getProximo();
	            }
	        }
	        return atual;
	    }

}
