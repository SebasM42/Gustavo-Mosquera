public class Especies {

    public enum Tipo{
        AVES,
        REPITLES,
        MAMIFEROS;
    }

    private String nombre;
    private Tipo tipo;
    private int precio;
    private int vidaProm;
    private int cantEspecies;
    private int cantVendidos;

    public Especies(String nombre, Tipo tipo, int precio, int vidaProm, int cantEspecies, int cantVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.vidaProm = vidaProm;
        this.cantEspecies = cantEspecies;
        this.cantVendidos = cantVendidos;
    }

    public String darNombre(){
        return nombre;
    }

    public Tipo darTipo(){
        return tipo;
    }
    public int darPrecio(){
        return precio;
    }

    public int darVidaProm(){
        return vidaProm;
    }

    public int darCantEspecies(){
        return cantEspecies;
    }

    public int darCantVendidos(){
        return cantVendidos;
    }

    public void comprarEspecis(int pCanidad){
        cantEspecies += pCanidad;
    }

    public boolean venderEspecie(int pCantidad){
        boolean respuesta = false;
        if(cantEspecies>=pCantidad){
            cantEspecies -= pCantidad;
            cantVendidos += pCantidad;
            respuesta = true;
        }
        return respuesta;
    }

}

