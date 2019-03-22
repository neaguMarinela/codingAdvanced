package serializationAndDeserialization;

public class Address {

    private String oras;

    private String tara;

    private String numarCasa;

    private String jud;

    private String sat;

    private String str;

    private String comuna;

    private String codPostal;

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getNumarCasa() {
        return numarCasa;
    }

    public void setNumarCasa(String numarCasa) {
        this.numarCasa = numarCasa;
    }

    public String getJud() {
        return jud;
    }

    public void setJud(String jud) {
        this.jud = jud;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "Address [oras=" + oras + ", tara=" + tara
                + ", numarCasa=" + numarCasa + ", jud=" + jud + ", sat="
                + sat + ", str=" + str + ", comuna=" + comuna
                + ", codPostal=" + codPostal + "]";
    }
}
