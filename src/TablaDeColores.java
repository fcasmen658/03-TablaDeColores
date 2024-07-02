/*
Secuencia de escape	Descripci�n
\t	Inserta un tabulador
\b	Retroceder un espacio (backspace)
\n	Inserta una nueva l�nea
\r	Inserta un retorno de carro
\f	Salto de p�gina
\�	Inserta una comilla simple
\"	Inserta una comilla doble
\\	Inserta una contrabarra (backslash)

public static void main(String[] args) {

    System.out.println("Ejemplo con un salto de l�nea,\n " +
            "un \t tabulador y \"comillas dobles\"");

}

*/

public class TablaDeColores {
    public static void main (String[] args) {
        System.out.println("Ejemplo con un salto de línea,\naquí continúa el salto de línea.\n");
        System.out.println("Esto es un ejemplo de tabulador \t tabulador.\n");
        System.out.println("Esto es un ejemplo de: \nsalto de línea.\n");
        System.out.println("Esto es un ejemplo de:\rSalto de página.\n");
        System.out.println("Esto es un ejemplo de:_ _\bretroceder un espacio.");
        System.out.println("Esto es un ejemplo de: \t -\t tabulación.");
        System.out.println("Esto es un ejemplo de: \"comillas dobles\"");
        System.out.println("Esto es un ejemplo de: \'comillas simples\'");

        System.out.println("-------------------------------------------------");
        System.out.println("| Código |   Color   | Código |     Color       |");
        System.out.println("-------------------------------------------------");
        System.out.println("|    0   |\033[0m reset \033[0m    |"+"    9    |\033[9m tachado \033[0m\t\t|");
        System.out.println("|    1   |\033[1m negrita \033[0m  |"+"    8    |\033[8m normal \033[0m\t\t|");
        System.out.println("|    3   |\033[3m cursiva \033[0m  |"+"    7    |\033[7m blanco \033[0m\t\t|");
        System.out.println("|    4   |\033[4m subrayado \033[0m|"+"    21   |\033[21m subrayado \033[0m\t\t|");
        System.out.println("|   30   |\033[30m negro \033[0m    |"+"    90   |\033[90m negro \033[0m\t\t\t|");
        System.out.println("|   40   |\033[40m negro \033[0m    |"+"   100   |\033[100m negro \033[0m\t\t\t|");
        System.out.println("|   31   |\033[31m rojo \033[0m     |" + "    91   |\033[91m rojo \033[0m\t\t\t|");
        System.out.println("|   41   |\033[41m rojo \033[0m     |" + "   101   |\033[101m rojo \033[0m\t\t\t|");
        System.out.println("|   32   |\033[32m verde \033[0m    |" + "    92   |\033[92m verde \033[0m\t\t\t|");
        System.out.println("|   42   |\033[42m verde \033[0m    |" + "   102   |\033[102m verde \033[0m\t\t\t|");
        System.out.println("|   33   |\033[33m amarillo \033[0m |"+"    93   |\033[93m amarillo \033[0m\t\t|");
        System.out.println("|   43   |\033[43m amarillo \033[0m |"+"   103   |\033[103m amarillo \033[0m\t\t|");
        System.out.println("|   34   |\033[34m azul \033[0m     |"+"    94   |\033[94m azul \033[0m\t\t\t|");
        System.out.println("|   44   |\033[44m azul \033[0m     |"+"   104   |\033[104m azul \033[0m\t\t\t|");
        System.out.println("|   35   |\033[35m morado \033[0m   |"+"    95   |\033[95m morado \033[0m\t\t|");
        System.out.println("|   45   |\033[45m morado \033[0m   |"+"   105   |\033[105m morado \033[0m\t\t|");
        System.out.println("|   36   |\033[36m cian \033[0m     |"+"    96   |\033[96m cian \033[0m\t\t\t|");
        System.out.println("|   46   |\033[46m cian \033[0m     |"+"   106   |\033[106m cian \033[0m\t\t\t|");
        System.out.println("|   37   |\033[37m blanco \033[0m   |"+"    97   |\033[97m blanco \033[0m\t\t|");
        System.out.println("|   47   |\033[47m blanco \033[0m   |"+"   107   |\033[107m blanco \033[0m\t\t|");
        System.out.println("|   48   |\033[48m blanco \033[0m   |"+"   108   |\033[108m blanco \033[0m\t\t|");
        System.out.println("|   51   |\033[41m blanco \033[0m   |"+"    52   |\033[52m blanco \033[0m\t\t|");
        System.out.println("-------------------------------------------------");
    }
}