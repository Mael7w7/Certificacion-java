package org.example;

public class Metodos {

    private final Alumno alumno ;

    public Metodos(Alumno alumno) {
        this.alumno = alumno;
    }
   

    public void AgregarNotas(double notas){
        if (notas>0 && notas<=20) {
            alumno.getListaNotas().add(notas);
            System.out.println("Nota agregada Correctamente");
        }else
            System.out.println("La nota debe estar entre 0 y 20");
    }


    public Double CalcularNotas(){
        double acumulador = 0 ;
        for(var i =0; i<alumno.getListaNotas().size(); i++){
            acumulador += alumno.getListaNotas().get(i);
        }
        double promedio = acumulador/alumno.getListaNotas().size();
        return promedio;
    }
    
    public void notaFinal(){

        double promedio = this.CalcularNotas();

        if (promedio>=13 && promedio<=20){
            System.out.println("Aprobado con nota :" + promedio);
        }else if (promedio>0 && promedio<=13){
            System.out.println("Desaprobado con nota :" + promedio);
        }
    }
    
    public void mostrarInfo(){
        System.out.println(alumno.toString());
    }

}
