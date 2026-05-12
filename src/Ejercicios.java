public class Ejercicios {
    public Ejercicios() {
    }

    public int sumaConsecutivos(int num) {
        System.out.println("El numero es: " + num);
        if (num == 1) {
            return num;
        }
        return num + sumaConsecutivos(num - 1);
    }

    
    public int sumaConsecutivosPasos(int num) {
        System.out.println("El numero es: " + num);
        if (num == 1) {
            return num;
        }
        int resultadoRecursivo = sumaConsecutivosPasos(num - 1);
        int resultadoOperacion = num + resultadoRecursivo;
        System.out.println(
            "resultadoOp = "+ resultadoOperacion +" = "+ num
            + " + sumaConsecutivosPasos("+ (num - 1) +")");
        return resultadoOperacion;
        
    }   

    public int getPotencia(int base, int exponente) {
        if (exponente == 1) {
            return base;
        }
        return base * getPotencia(base, exponente - 1);
    }

    public int sumaDigitos(int num) {
        if (num < 10) 
           return num;
        return(num % 10) + sumaDigitos(num / 10);
    }
}

