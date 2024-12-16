public class Saludo {
    // Método que imprime un saludo inicial
    public void imprimirSaludo() {
        System.out.println("¡Hola! Bienvenido al proyecto.");
    }

    // Método que imprime un mensaje de despedida
    public void imprimirDespedida() {
        System.out.println("¡Adiós! Gracias por participar.");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        saludo.imprimirSaludo();
        saludo.imprimirDespedida();
    }
}
