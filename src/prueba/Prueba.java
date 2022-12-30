package prueba;

public class Prueba {

    public static void main(String[] args) {
      prueba();
    }

    private static void prueba() {

        //Declaracion y obtencion de valores actuales en precio
        double precio0 =10.2;
        double precio1 =1.7;
        double precio2 =22.32;
        double precio3 =7.7;
        double precio4 =10.1;

        //Calcula sumatoria de numeros
        double precioSum = precio0+precio1+precio2+precio3+precio4;
        //Evalua el primer par de numeros para menor y mayor
        double precioMayorPreliminar1=Math.max(precio0, precio1);
        double precioMenorPreliminar1=Math.min(precio0, precio1);
        //Evalua el segundo par de numeros para menor y mayor
        double precioMayorPreliminar2=Math.max(precio2, precio3);
        double precioMenorPreliminar2=Math.min(precio2, precio3);

        //Evaluacion  el tercer de par de numeros para menor y mayor
        double precioMayorPreliminar3=Math.max(precioMayorPreliminar1, precioMayorPreliminar2);
        double precioMenorPreliminar3=Math.min(precioMenorPreliminar1, precioMenorPreliminar2);

        //Calcula promedio de numeros
        double precioPromedio=precioSum/5;

        //Evaluacion final de par de numeros para menor y mayor
        double precioMayor=Math.max(precio4, precioMayorPreliminar3);
        double precioMenor=Math.min(precio4, precioMenorPreliminar3);

        String cadena =("ESTADÍSTICA SOBRE EL PRECIO\r\n \n"
                + "Precio promedio	: S/. "+recorte(precioPromedio)+"\n"
                + "Precio mayor		: S/. "+precioMayor+"\n"
                + "Precio menor		: S/. "+precioMenor+"");

        System.out.println(cadena);
    }

    // Método que recorta los decimales


    static String recorte(double numero) {
        return String.format("%.2f",numero);
    }


}
