package Task_1; // Paketti Television // Paquete Television

public class TelevisionViewer { // Televisio katsoja // Televidente
    public static void main(String[] args) { // Pääohjelma // Programa principal
        Television myTV = new Television(); // Luo uusi televisio // Crea una nueva televisión
        myTV.setChannel(1); // Aseta kanava 1 // Establece el canal 1

        int currentChannel = 1; // Nykyinen kanava // Canal actual
        int[] channelsPerDay = {3, 4, 6, 4, 6, 4, 6, 4, 6, 4}; // Kanavat päivässä // Canales por día

        for (int day = 1; day <= 10; day++) { // Päivästä 1 päivään 10 // Del día 1 al día 10
            System.out.println("Woke up, day " + day); // Heräsin, päivä // Me desperté, día

            boolean tired = false; // Väsynyt // Cansado

            if (!myTV.isOn()) // Jos televisio ei ole päällä // Si la televisión no está encendida
                myTV.pressOnOff(); // Paina päälle/pois // Presiona encendido/apagado

            int channelsWatched = 0; // Katsotut kanavat // Canales vistos

            while (!tired) { // Kunnes väsynyt // Hasta que esté cansado
                System.out.println("Watching channel " + currentChannel); // Katsotaan kanavaa // Viendo el canal
                currentChannel = currentChannel % 10 + 1; // Reinicia el canal después de 10 // Aloita kanava uudelleen 10 jälkeen
                channelsWatched++; // Katsotut kanavat lisääntyvät // Aumenta los canales vistos
                if (channelsWatched == channelsPerDay[day - 1]) // Jos katsotut kanavat ovat yhtä kuin kanavat päivässä // Si los canales vistos son iguales a los canales por día
                    tired = true; // Väsynyt // Cansado
            }

            myTV.pressOnOff(); // Paina päälle/pois // Presiona encendido/apagado

            System.out.println("Falling asleep"); // Nukahtaminen // Quedándose dormido
        }
    }
}
