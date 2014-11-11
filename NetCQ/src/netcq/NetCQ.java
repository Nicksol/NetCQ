/*
 * NetCQ.java
 * Main class for packet capturing   
 * Version 1.0
 * 12/11/2014
 */


package netcq;


import jpcap.JpcapCaptor;
import jpcap.JpcapSender;
import jpcap.NetworkInterface;
import jpcap.NetworkInterfaceAddress;
import jpcap.packet.*;
import java.io.*;


public class NetCQ {

    static JpcapCaptor captor;
    static NetworkInterface[] array;
    String str, info;
    int x;
    static int choice;
    static int captureTime;
	
    public static void main(String[] args) {
        
	capturing();
    }
	
    public static void capturing(){
	
	array = JpcapCaptor.getDeviceList();

        System.out.println("Available Interfaces");

	for (int i = 1; i < array.length; i++) {
            System.out.println(i + " > " + array[i].description);
	}
		
	System.out.println("________________________\n");
	
        choice = Integer.parseInt(getInput("Choose interfaces(0,1,) :"));
       
	captureTime = Integer.parseInt(getInput("Enter the duration of capturing/(ms) :"));
		
	System.out.println("Listening on Interface -> "
				+ array[choice].description);
	System.out.println("________________________\n");
		
        
        try {
            captor = JpcapCaptor.openDevice(array[choice], 65535, false,captureTime);
            System.out.println("___________captor_____________\n");

	} 
        catch (IOException ioe) {
            
            ioe.printStackTrace();
	}
        
        int count = 1;
	while (true) {
            Packet info = captor.getPacket();
            if (info != null)
            
            mapStore.alldata_map.put(count, mapStore.converting(info));
            System.out.println(mapStore.alldata_map.size());
            count++;
       	
        }
	
    }
    

    private static String getInput(String string) {
	
        String input = "";
	System.out.print(string);
	BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
	
        try {
            input = bufferedreader.readLine();
        } 
        catch (IOException ioexception) {}
	
        return input;
    }

}

