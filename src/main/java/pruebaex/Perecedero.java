package pruebaex;

public class Perecedero extends Producto {
    
    int diasPorCaducar;
    
    

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return "Perecedero [diasPorCaducar=" + diasPorCaducar + "]";
    }
    @Override
    public double calcular(int cantidadDeProductos){
        double total= cantidadDeProductos*precio;
        if(diasPorCaducar == 1){
            return total/4;
        }
        if(diasPorCaducar == 2){
            return total/3;
        }
        if(diasPorCaducar == 3){
            return total/2;
        }
        return total;
        
    }

    
    
    
}
