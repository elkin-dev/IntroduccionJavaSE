public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int sendFile = 3;

        if(isBluetoothEnabled){
            sendFile++;
            System.out.println("Archivo enviado");
        } else {
            sendFile--;
            System.out.println("Por favor enciende tu bluetooth para iniciar transferencia.");
        }
        System.out.println(sendFile);
        System.out.println(isBluetoothEnabled);
    }
}
