public class SmartTV {
    
        boolean ligada = false;
        int canal = 1;
        int volume = 20;


        public void ligar(){
            ligada = true;
        }

        public void aumentarVolume(){
            volume++;
        }

        public void mudarDeCanal(){
            canal++;
        }
}
