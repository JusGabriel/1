//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class jugador {
    String avatar;
    int edad;
    String pais;

    public jugador() {
        avatar = "Enner";
        edad = 40;
        pais = "Ecuador";
    }
    public jugador (String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }

    public void imprimir_patear (){
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.print("El jugador: "+avatar+" tiene: "+edad+" años de edad, y es de :"+pais+" se encuentra pateando");
    }
    public void imprimir_correr (){
        System.out.print(" y corriendo");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
    public void imprimir_saltar(int s){
    int saltar=2+s;
        System.out.print(", saltando "+saltar+"veces :D");
    }
}