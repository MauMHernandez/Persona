class Persona {
    String nombre;
        String apellido;
        int edad;
        double altura;
   
        Persona(){

        }
    public void mostrarNombreCompleto () {
    
        System.out.println("mi nombre es"+this.nombre+""+this.apellido); 
    }
    public void mostrarEdad (){
    System.out.println("tengo "+this.edad+" años");
}
    public void mostrarAltura (){
    
    System.out.println("Mido "+this.altura+" metros");
}
}


