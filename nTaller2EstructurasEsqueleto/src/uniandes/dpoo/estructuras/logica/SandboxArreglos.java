package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	if (arregloEnteros != null) {
    		return Arrays.copyOf(arregloEnteros, arregloEnteros.length);
    	}
    	else {
    		return null;
    	}
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        return Arrays.copyOf(arregloCadenas, arregloCadenas.length);
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	if (arregloEnteros != null) { 
        return arregloEnteros.length;
        }
    	else {
    		return 0;
    	}
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	if (arregloCadenas != null) {
    	
        return this.arregloCadenas.length;
        }
    	else {
    		return 0;
    	}
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int len = getCantidadEnteros();
    	int[] nuevoArreglo = new int[len + 1];
    	for (int i = 0; i <= arregloEnteros.length; i++) {
    		if (i < arregloEnteros.length) {
    		nuevoArreglo[i] = arregloEnteros[i];
    		}
    		else {
    			nuevoArreglo[i] = entero;
    		}
    		
    	}
    	arregloEnteros = nuevoArreglo;
    	
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int len = getCantidadCadenas();
    	String[] nuevoArreglo = new String[len + 1];
    	for (int i = 0; i <= arregloCadenas.length; i++) {
    		if (i < arregloCadenas.length) {
    		nuevoArreglo[i] = arregloCadenas[i];
    		}
    		else {
    			nuevoArreglo[i] = cadena;
    		}
    	}
    	arregloCadenas = nuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int len = getCantidadEnteros();
    	int pos = 0;
    	int contador = 0;
    	
    	for (int num : arregloEnteros) {
    		if(num == valor) {
    			contador++;
    		}
    	}
    	int[] nuevoArreglo = new int[len-contador];
    	for (int num : arregloEnteros) {
            if (num != valor) {
                nuevoArreglo[pos] = num;
                pos++;
            }
        }
    	arregloEnteros = nuevoArreglo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int len = getCantidadCadenas();
    	int pos = 0;
    	int contador = 0;
    	
    	for (String num : arregloCadenas) {
    		if(num.equals(cadena)) {
    			contador++;
    		}
    	}
    	String[] nuevoArreglo = new String[len-contador];
    	for (String num : arregloCadenas) {
            if (num != cadena) {
                nuevoArreglo[pos] = num;
                pos++;
            }
        }
    	arregloCadenas = nuevoArreglo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int len = arregloEnteros.length;
    	int[] nuevoArreglo = new int[len+1];
    	
    	 if (posicion < 0) {
    	        posicion = 0;
    	    } 
    	 else if (posicion > len) {
    	        posicion = len;
    	    }

    	 for (int i = 0, j = 0; i < nuevoArreglo.length; i++) {
    	        if (i == posicion) {
    	            nuevoArreglo[i] = entero;
    	        } else {
    	            nuevoArreglo[i] = arregloEnteros[j]; 
    	            j++; 
    	        }
    	    }

    		arregloEnteros = nuevoArreglo;
    		
    	}
   

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion(int posicion) {
        int len = arregloEnteros.length;
        
        // Validar si la posición es válida
        if (posicion < 0 || posicion >= len) {
            return; // No hacer nada si la posición es inválida
        }

        int[] nuevoArreglo = new int[len - 1];

        for (int i = 0, j = 0; i < len; i++) {
            if (i != posicion) { 
                nuevoArreglo[j] = arregloEnteros[i];
                j++;
            }
        }

        arregloEnteros = nuevoArreglo;
    }


    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros(double[] valores) {
        arregloEnteros = new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            arregloEnteros[i] = (int) valores[i];
        }
    }


    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas(Object[] objetos) {

        arregloCadenas = new String[objetos.length];


        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] != null) {  
                arregloCadenas[i] = objetos[i].toString();
            } else {
                arregloCadenas[i] = "null"; 
            }
        }
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos() {
        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] < 0) {
                arregloEnteros[i] *= -1; // Convierte el número negativo en positivo
            }
        }
    }


    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int contador = 0;
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		if (arregloEnteros[i]== valor) {
    			contador ++;
    		}
    	}
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones(String cadena) {
        int contador = 0;
        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i].equalsIgnoreCase(cadena)) {
                contador++;
            }
        }
        return contador;
    }
    

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int pos = 0;
    	int apariciones = contarApariciones(valor);
    	int[] array = new int[apariciones];
    	if (apariciones > 0) {
    		for (int i = 0; i < arregloEnteros.length; i++) {
        		if (arregloEnteros[i]== valor) {
        			array[pos] = i;
        			pos ++;
        		} 
    	}
    	}
        return array;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	if (arregloEnteros.length != 0 ) {
        int[] rango = new int[2];
        organizarEnteros();
        rango[0] = arregloEnteros[0];
        rango[1] = arregloEnteros[arregloEnteros.length - 1];
        return rango;	
    	}
    	else {
    		int[] rango = new int[0];
    		return rango;
    	}
    
    }
    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma() {
        HashMap<Integer, Integer> histograma = new HashMap<>();
        for (int num : arregloEnteros) {
            histograma.put(num, histograma.getOrDefault(num, 0) + 1);
        }
        return histograma;
    }


    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	int cont = 0;

        for (int i = 0; i < arregloEnteros.length; i++) {
            int valor = arregloEnteros[i];
            boolean yaContado = false;

            // Verificar si ya contamos este número antes
            for (int j = 0; j < i; j++) {
                if (arregloEnteros[j] == valor) {
                    yaContado = true;
                    break;
                }
            }

            // Si no se ha contado antes, verificamos cuántas veces aparece
            if (!yaContado) {
                int veces = 0;

                for (int j = 0; j < arregloEnteros.length; j++) {
                    if (arregloEnteros[j] == valor) {
                        veces++;
                    }
                }

                if (veces > 1) {
                    cont++;
                }
            }
        }
        return cont;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros(int[] otroArreglo) {

        if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }


        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != otroArreglo[i]) {
                return false;
            }
        }

        return true; 
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros(int[] otroArreglo) {

        if (arregloEnteros.length != otroArreglo.length) {
            return false;
        }

        int[] copiaArreglo1 = Arrays.copyOf(arregloEnteros, arregloEnteros.length);
        int[] copiaArreglo2 = Arrays.copyOf(otroArreglo, otroArreglo.length);

        // Ordenar ambos arreglos
        Arrays.sort(copiaArreglo1);
        Arrays.sort(copiaArreglo2);

        // Comparar los arreglos ordenados
        return Arrays.equals(copiaArreglo1, copiaArreglo2);
    }
    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros(int cantidad, int minimo, int maximo) {
        arregloEnteros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            arregloEnteros[i] = minimo + (int)(Math.random() * (maximo - minimo + 1));
        }
    }

}
