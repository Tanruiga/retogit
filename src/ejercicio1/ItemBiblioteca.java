package ejercicio1;

public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;

    public ItemBiblioteca(){}
    public ItemBiblioteca(String titulo, String autor){
        this.titulo = "La sombra del viento";
        this. autor = "Carlos Ruiz Zafón";
    }
    public ItemBiblioteca(ItemBiblioteca itemBiblioteca){
        this.titulo = itemBiblioteca.titulo;
        this.autor = itemBiblioteca.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public abstract void mostrarDetalle();
}
