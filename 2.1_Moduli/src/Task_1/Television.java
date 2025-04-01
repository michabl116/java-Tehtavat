package Task_1; // Paketti Television // Paquete Television

public class Television { // Televisio // Televisión
    private boolean isOn; // Onko päällä // Está encendida
    private int channel; // Kanava // Canal

    public Television() { // Konstruktori // Constructor
        this.isOn = false; // Aluksi pois päältä // Inicialmente apagada
        this.channel = 1; // Aluksi kanava 1 // Inicialmente canal 1
    }

    public void setChannel(int channel) { // Aseta kanava // Establece el canal
        this.channel = channel; // Aseta kanava // Establece el canal
    }

    public int getChannel() { // Hae kanava // Obtén el canal
        return channel; // Palauta kanava // Devuelve el canal
    }

    public boolean isOn() { // Onko päällä // Está encendida
        return isOn; // Palauta tila // Devuelve el estado
    }

    public void pressOnOff() { // Paina päälle/pois // Presiona encendido/apagado
        this.isOn = !this.isOn; // Vaihda tila // Cambia el estado
    }
}
