package pruebaex;

public class Dsitribuidora {
    public static void main(String[] args) {
        
        Producto productos[] =new Producto[5];
        productos[0] = new Producto("mondongo", 20000);
        productos[1] = new NoPerecedero("arroz", 2000, "seco");
        productos[2] = new Perecedero("yogurt", 500, 2);
        productos[3] = new Producto("play 5", 1000000);
        productos[4] = new Perecedero("queso", 4000, 3);

        System.out.println("precio total "+ productos[0].getNombre() +" "+ productos[0].calcular(5));
        System.out.println("precio total "+ productos[1].getNombre() +" "+ productos[1].calcular(5));
        System.out.println("precio total "+ productos[2].getNombre() +" "+ productos[2].calcular(5));
        System.out.println("precio total "+ productos[3].getNombre() +" "+ productos[3].calcular(5));
        System.out.println("precio total "+ productos[4].getNombre() +" "+ productos[4].calcular(5));

    }
}