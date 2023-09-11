public class Tigre {
    //Atributos
    private String Comportamiento;
    private String Peligrosidad;
    private String Instinto;
    private String Apariencia;
    private String Vitalidad;

    //constructor
    public Tigre(String comportamiento, String peligrosidad, String instinto, String apariencia, String vitalidad) {
        this.Comportamiento = comportamiento;
        this.Peligrosidad = peligrosidad;
        this.Instinto = instinto;
        this.Apariencia = apariencia;
        this.Vitalidad = vitalidad;
    }    
    //constructor vacio
    public Tigre(){
    }

    //Getters
    public String getComportamiento() {
        return Comportamiento;
    }
    public String getPeligrosidad() {
        return Peligrosidad;
    }
    public String getInstinto() {
        return Instinto;
    }
    public String getApariencia() {
        return Apariencia;
    }
    public String getVitalidad() {
        return Vitalidad;
    }

    //Seters
    public void setComportamiento(String comportamiento) {
        Comportamiento = comportamiento;
    }
    public void setPeligrosidad(String peligrosidad) {
        Peligrosidad = peligrosidad;
    }
    public void setInstinto(String instinto) {
        Instinto = instinto;
    }
    public void setApariencia(String apariencia) {
        Apariencia = apariencia;
    }
    public void setVitalidad(String vitalidad) {
        Vitalidad = vitalidad;
    }    




}
