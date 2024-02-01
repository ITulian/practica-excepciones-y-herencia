package pruebaex;

public class PracticaExcepciones {
    int a = 0;
    int b = 300;
    public void calcularcociente(int a,int b){
        try {
            if (a == 0){
                throw new IllegalArgumentException("no se puede dividir por 0");
            }
        } catch (IllegalArgumentException e) {
            e.getStackTrace();
        }
        System.out.println(b/a);
    }
}
