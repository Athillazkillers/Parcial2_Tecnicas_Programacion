import java.util.Date;

class Vuelos {
    private int  NumVuelo;
    private String OrigenV;
    private Date FechasalidaV;
    private Date FechaLlegadaV;
    private int CapMaxV;

    public Vuelos(int NumVuelo,String OrigenV,Date FechasalidaV,int CapMaxV){
        this.NumVuelo=NumVuelo;
        this.OrigenV=OrigenV;
        this.FechasalidaV=FechasalidaV;
        this.CapMaxV=CapMaxV;
    }
}
class Pasajero {
    private String Nombre;
    private int NumeroPasaporte;
    private int Edad;
    private String PreferenciasAlimenticias;

    public Pasajero(String Nombre, int NumeroPasaporte, int Edad, String PreferenciasAlimenticias) {
        this.Nombre = Nombre;
        this.NumeroPasaporte = NumeroPasaporte;
        this.Edad = Edad;
        this.PreferenciasAlimenticias = PreferenciasAlimenticias;
    }

    class Reserva {
        private Vuelos vuelos;
        private Pasajero pasajero;
        private Date FechaReserva;
        private Boolean Reservadoono;

        public Reserva(Vuelos vuelos, Pasajero pasajero, Date FechaReserva, Boolean Reservadoono) {
            this.vuelos = vuelos;
            this.pasajero = pasajero;
            this.FechaReserva = FechaReserva;
            this.Reservadoono = Reservadoono;
        }
    }
}
