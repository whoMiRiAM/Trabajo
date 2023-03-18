import java.util.Arrays;

public class Contenedores {
    private final int id; //Es final porque no se pondrá cambiar
    private int pesoC;
    private int prioridad;
    private String pais;
    private String[] empresaEnvia = new String[20];
    private String[] empresaRecibe = new String[20];
    private String[] contenido = new String[100];
    private boolean inspeccionado;

    //G/S

    public Contenedores(int id, int pesoC, int prioridad, String pais, String[] contenido, String[] empresaEnvia, String[] empresaRecibe){
        this(id);
        this.setPesoC(pesoC);
        this.setPrioridad(prioridad);
        this.setPais(pais);
        this.setContenido(contenido);
        this.setEmpresaEnvia(empresaEnvia);
        this.setEmpresaRecibe(empresaRecibe);
    }
    public int getId() {
        return id;
    }

    public int getPesoC() {
        return pesoC;
    }

    public void setPesoC(int pesoC) {
        if(pesoC >0) this.pesoC = pesoC;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        if (prioridad >= 1 && prioridad<=3) this.prioridad = prioridad;
    }

    public boolean isInspeccionado() {
        return inspeccionado;
    }

    public void setInspeccionado(boolean inspeccionado) {
        this.inspeccionado = inspeccionado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String[] getContenido() {
        return contenido;
    }

    public void setContenido(String[] contenido) {
        this.contenido = contenido;
    }

    public String[] getEmpresaEnvia() {
        return empresaEnvia;
    }

    public void setEmpresaEnvia(String[] empresaEnvia) {
        this.empresaEnvia = empresaEnvia;
    }

    public String[] getEmpresaRecibe() {
        return empresaRecibe;
    }

    public void setEmpresaRecibe(String[] empresaRecibe) {
        this.empresaRecibe = empresaRecibe;
    }

    //constructores

    public Contenedores(int id){ //
        if(id<0) id=-id;
        this.id=id;
        this.prioridad=3;
    }



    public String toString(){
        String s=new String();
        s+="Contenedor{";

        s +="ID"+getId()+"\n";
        s+="PESO="+getPesoC()+"\n";
        s+="Pais de Procedencia="+getPais() + "\n";
        if (inspeccionado) s += "Inspeccionado"+"\n";
        else s += "No inspeccionado"+"\n";
        s+="Prioridad="+getPrioridad()+"\n";
        s+="Contenido="+ Arrays.toString(contenido)+"\n";
        s+="Empresa que envia"+ Arrays.toString(getEmpresaEnvia())+"\n";
        s+="Empresa que recibe"+ Arrays.toString(getEmpresaRecibe())+"\n";
        s+="}";




        return s;
    }
    public void mostrarDatosContenedor(int idBuscado) {
        if (idBuscado == this.id) {
            toString();
        } else {
            System.out.println("El contenedor no está en el hub.");
        }
    }
    public void cantidadContenedores(Contenedores[] contenedor, String paisPedido){
        int c=0;
        for (int i = 0; i < contenedor.length; i++) {
            if(contenedor[i].getPais().equals(paisPedido)){
                c++;
            }

        }

    }


}
