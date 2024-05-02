class Carrera {
    Long codigo;
    String nombre;
    double promedioNotas;
    double promedioEdad;

    public Carrera(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedioNotas = 0.0;
        this.promedioEdad = 0.0;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    public void setPromedioEdad(double promedioEdad) {
        this.promedioEdad = promedioEdad;
    }
}
