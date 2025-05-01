import com.sun.source.tree.BreakTree;

public class Tienda {
    public final static int CANT_MIN_AVES = 15;
    public final static int CANT_MIN_REPTILES = 10;
    public final static int CANT_MIN_MAMIFEROS = 15;

    private Especies especie1;
    private Especies especie2;
    private Especies especie3;

    public Tienda(){
        especie1 = new Especies("Aves", Especies.Tipo.AVES, 15,2, 70, 0);
        especie2 = new Especies("Reptiles", Especies.Tipo.REPITLES, 20, 5, 60, 0);
        especie3 = new Especies("Mamiferos", Especies.Tipo.MAMIFEROS, 25, 10, 68, 0);
    }

    public Especies darespecie1(){
        return especie1;
    }

    public Especies darespecie2(){
        return especie2;
    }

    public Especies darespecie3(){
        return especie3;
    }

    public Especies buscarEspecie(String pNombreEspecie){
        Especies buscando = null;
        if(pNombreEspecie.equals(especie1.darNombre())){
            buscando = especie1;
        } else if (pNombreEspecie.equals(especie2.darNombre())) {
            buscando = especie2;
        }else if (pNombreEspecie.equals(especie3.darNombre())){
            buscando = especie3;
        }
        return buscando;
    }
    
}
