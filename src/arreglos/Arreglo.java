package arreglos;

public class Arreglo {

    //Atributos
    //**************************************************************************
    private int[] arregloUD;

    private int[][] arregloBD;

    private String cadena;

    //**************************************************************************

    //Constructores
    //**************************************************************************
    public Arreglo(int[] p_arregloUD) {
        this.arregloUD = p_arregloUD;
    }

    public Arreglo(int[][] p_arregloBD) {
        this.arregloBD =p_arregloBD;
    }

    public Arreglo(String p_cadena) {
        this.cadena = p_cadena;
    }

    public Arreglo(String p_cadena, char p_caracter) {
        this.cadena = p_cadena;
    }

    //**************************************************************************

    public int[] getArregloUD() {
        return arregloUD;
    }

    public void setArregloUD(int[] arregloUD) {
        this.arregloUD = arregloUD;
    }

    public int[][] getArregloBD() {
        return arregloBD;
    }

    public void setArregloBD(int[][] arregloBD) {
        this.arregloBD = arregloBD;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }


    public static void sumarLista(int [] p_arregloUD) {
        /* calcular suma y promedio de un arreglo int[] */
        int suma = 0;
        int promedio;
        for (int i = 0; i < p_arregloUD.length; i++) {
            suma += p_arregloUD[i];
        }
        promedio = suma / p_arregloUD.length;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    public static int buscaMayor(int [][] p_arregloBD) {
        /* buscar el numero mayor de un arreglo int[][] */
        int mayor = 0;
        for (int i = 0; i < p_arregloBD.length; i++) {
            for (int j = 0; j < p_arregloBD[i].length; j++) {
                if (p_arregloBD[i][j] > mayor) {
                    mayor = p_arregloBD[i][j];
                }
            }
        }
        return mayor;
    }

    public static int cuentaVocales(String p_cadena) {
        /* contar las vocales a, e, i, o, u en un arreglo string */
        int contador = 0;
        for (int i = 0; i < p_cadena.length(); i++) {
            if (p_cadena.charAt(i) == 'a' || p_cadena.charAt(i) == 'e' || p_cadena.charAt(i) == 'i' || p_cadena.charAt(i) == 'o' || p_cadena.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static int cuentaCaracter(String p_cadena, char p_caracter) {
        /* contar los caracteres p_character que hay en un arreglo string */
        int contador = 0;
        for (int i = 0; i < p_cadena.length(); i++) {
            if (p_cadena.charAt(i) == p_caracter) {
                contador++;
            }
        }
        return contador;
    }

}
