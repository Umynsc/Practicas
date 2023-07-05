package tp3;
public class Libro {
	  String titulo;
	  String editorial;
	  String genero;
	  String autor;
	  int paginas;
	  public Libro() {
	    }
	  
	  public void setTitulo(String aux){
		  this.titulo = aux;
	  }
	  public String getTitulo(){
		  return titulo;
	  }
	  public void setEditorial(String aux){
		  this.editorial = aux;
	  } 
	  public String getEditorial(){
		  return editorial;
	  }
	  public void setGenero(String aux){
		  this.genero = aux;
	  } 
	  public String getGenero(){
		  return genero;
	  }
	  public void setAutor(String aux){
		  this.autor = aux;
	  }
	  public String getAutor(){
		  return autor;
	  }
	  public void setPag(int aux){
		  this.paginas = aux;
	  }
	  public int getPag() {
		  return paginas;
	  }

	  public static void main(String[] args) {
			Libro L001 = new Libro();
			
			L001.setTitulo("Hola Mundo!");
			System.out.println("Titulo: "+L001.getTitulo());
			L001.setAutor("Juliet");
			System.out.println("Autor: "+L001.getAutor());
			L001.setGenero("general");
			System.out.println("Genero: "+L001.getGenero());
			L001.setPag(80);
			System.out.println("Paginas: "+L001.getPag());

			System.out.println();
			
			Libro L002 = new Libro();
			L002.setTitulo("Algoritmos v0101");
			System.out.println("Titulo: "+L002.getTitulo());
			L002.setAutor("P.P.L");
			System.out.println("Autor: "+L002.getAutor());
			L002.setGenero("educativo");
			System.out.println("Genero: "+L002.getGenero());
			L002.setPag(120);
			System.out.println("Paginas: "+L002.getPag());
			}
	  
	  
}
