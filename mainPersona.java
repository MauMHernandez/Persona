import java.util.Scanner;

class mainPersona {
    public static void main(String[] args) {
        String name;
        String lastname;
        int age;
        double heigh;

        Scanner paco=new Scanner(System.in);
        System.out.println("proporciona tu nombre");
        name=paco.nextLine ();
        System.out.println("proporciona tu apellido");
        lastname=paco.nextLine ();
        System.out.println("proporciona tu edad");
        age=paco.nextInt();
        System.out.println("proporciona tu altura");
        heigh=paco.nextDouble();

        Persona pedro=new Persona();

        pedro.nombre = name;
        pedro.apellido = lastname;
        pedro.edad = age;
        pedro.altura = heigh;


    pedro.mostrarNombreCompleto();
    pedro.mostrarEdad();
    pedro.mostrarAltura();
    }

}
