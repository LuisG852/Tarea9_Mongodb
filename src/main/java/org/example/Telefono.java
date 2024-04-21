package org.example;

// Representa las propiedades básicas de un teléfono.
public class Telefono {
    // Atributos
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private double tamanoPantalla;
    private int memoriaRAM;
    private int almacenamientoInterno;
    private boolean tieneCamara;
    private int resolucionCamara;
    private boolean esSmartphone;
    private String imei;

    // Constructor
    public Telefono(String marca, String modelo, String sistemaOperativo, double tamanoPantalla, int memoriaRAM,
                    int almacenamientoInterno, boolean tieneCamara, int resolucionCamara, boolean esSmartphone, String imei) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.memoriaRAM = memoriaRAM;
        this.almacenamientoInterno = almacenamientoInterno;
        this.tieneCamara = tieneCamara;
        this.resolucionCamara = resolucionCamara;
        this.esSmartphone = esSmartphone;
        this.imei = imei;
    }

    // Métodos getter y setter

    // Obtiene la marca del teléfono.
    public String getMarca() {
        return marca;
    }

    // Establece la marca del teléfono.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Obtiene el modelo del teléfono.
    public String getModelo() {
        return modelo;
    }

    // Establece el modelo del teléfono.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Obtiene el sistema operativo del teléfono.
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    // Establece el sistema operativo del teléfono.
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    // Obtiene el tamaño de la pantalla del teléfono.
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    // Establece el tamaño de la pantalla del teléfono.
    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    // Obtiene la cantidad de memoria RAM del teléfono.
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    // Establece la cantidad de memoria RAM del teléfono.
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    // Obtiene el almacenamiento interno del teléfono.
    public int getAlmacenamientoInterno() {
        return almacenamientoInterno;
    }

    // Establece el almacenamiento interno del teléfono.
    public void setAlmacenamientoInterno(int almacenamientoInterno) {
        this.almacenamientoInterno = almacenamientoInterno;
    }

    // Indica si el teléfono tiene cámara o no.
    public boolean isTieneCamara() {
        return tieneCamara;
    }

    // Establece si el teléfono tiene cámara o no.
    public void setTieneCamara(boolean tieneCamara) {
        this.tieneCamara = tieneCamara;
    }

    // Obtiene la resolución de la cámara del teléfono.
    public int getResolucionCamara() {
        return resolucionCamara;
    }

    // Establece la resolución de la cámara del teléfono.
    public void setResolucionCamara(int resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    // Indica si el teléfono es un smartphone o no.
    public boolean isEsSmartphone() {
        return esSmartphone;
    }

    // Establece si el teléfono es un smartphone o no.
    public void setEsSmartphone(boolean esSmartphone) {
        this.esSmartphone = esSmartphone;
    }

    // Obtiene el número IMEI del teléfono.
    public String getImei() {
        return imei;
    }

    // Establece el número IMEI del teléfono.
    public void setImei(String imei) {
        this.imei = imei;
    }
}
