public class llamar {
    public static void main(String[] args) {
        jugador jugador1 = new jugador();

        jugador1.imprimir_patear();
        jugador1.imprimir_correr();

        jugador jugador2 = new jugador("Ronaldo", 39, "Portugal");

        jugador1.imprimir_patear();
        jugador1.imprimir_saltar(5);
        jugador1.imprimir_correr();



    }
}
