public class Hub {
    private Contenedores[][] c;


    public Hub(){
        this.c=new Contenedores[10][12];
    }

    public Contenedores[][] getHub(){
        return c;

    }
    public void setContenedor(Contenedores[][] c){
        if(c!=null) this.c=c;
    }
    public String toString(){
        String s=new String();
        for (int f = 0; f <c.length; f++) {
            for (int col = 0; col <c[f].length; col++) {
                if(c[f][col]!=null)
                    s+="|"+c[f][col].getId()+"| ";
                else s+="|| ";
            }
            s+="\n";
        }
        s+="\n";
        return s;
    }

}
