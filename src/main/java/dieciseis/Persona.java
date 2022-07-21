package dieciseis;

import lombok.Data;

import static dieciseis.Ejecutable.random;

@Data
public class Persona {
    private String nombre="";
    private Integer edad=0;
    private String DNI="";
    private String sexo="H";
    private Integer peso=0;
    private Double altura=0.0;;

    public Persona() {
    }

    public Persona(String nombre, String sexo, Integer edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona(String nombre, String sexo, Integer edad, Integer peso, Double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public double calculoDeIMC(){
       return peso/(altura*altura);
    }

    public Integer IMC(Persona persona) {
        Double imc= persona.calculoDeIMC();
        if(imc<20.0) {
            return  -1;
        } else if (imc>=20.0&&imc<=25.0){
            return 0;
        }else{
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        Boolean mayor;
        if (edad>18){
            mayor=true;
        }else {
            mayor=false;
        }
        return mayor;
    }

    public Integer generarDNI(){
        Integer numDni=random(99999999,00000000);
        return null;
    }

    public char verificarSexo(){
        char sex;
        if (sexo.equals("M")){
            sex='M';
        }else {
            sex='H';
        }
        return sex;
    }
}




