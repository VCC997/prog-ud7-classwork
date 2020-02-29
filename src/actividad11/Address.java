package actividad11;

public class Address {

    private String pais;
    private String provincia;
    private String ciudad;
    private int codPostal;

    public Address(String pais, String provin, String city, int codP){

        this.pais=pais;
        this.provincia=provin;
        this.ciudad=city;
        this.codPostal=codP;

    }

    @Override
    public String toString() {
        return "Address{" +
                "pais='" + pais + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codPostal=" + codPostal +
                '}';
    }
}
