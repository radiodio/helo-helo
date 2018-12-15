package helo.helo;

import helo.helo.snmp.TrapSenderVersion1;

public class ApplicationMain {
    public static void main(String[] args){
        System.out.print("helo");

        TrapSenderVersion1 trapV1 = new TrapSenderVersion1();
        trapV1.sendTrap_Version1();
    }
}