package ejercicio1;

public class Clase extends ItemBiblioteca {
    private int anioPublicacion;
    private int paginasDelLibro;

    public Clase (String titulo, String autor, int anioPublicacion, int numeroPaginas){
        super(titulo,autor);
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("El título del libro es: " +getTitulo());
        System.out.println("El nombre del autor es: " +getAutor());
        System.out.println("El año de publicación del libro es: " +anioPublicacion);
        System.out.println("El número de páginas es de: " +numeroPaginas);
    }
}
