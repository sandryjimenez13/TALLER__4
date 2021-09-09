
package Ejercicio_8;


public class Libro {

    String titulo;
    String autor;
    String ISBN;
    int paginas;
    String edicion;
    String editorial;
    String lugar;
    String fecha_edicion;
    
    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, int paginas, String edicion, String editorial, String lugar, String fecha_edicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = 200;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fecha_edicion = fecha_edicion;
    
    }

    //ACCEDENTES Y MUTADORES
    public String getTitulo() {
        return this.titulo;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String ciudad,String pais) {
        this.lugar = ciudad+"("+pais+")";
    }

    public String getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(String fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    
}

