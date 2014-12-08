/*
 * NetCQ.java
 * Main class for packet capturing   
 * Version 1.3
 * 08/12/2014
 */


package netcq;

import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.*;

import java.io.*;
import java.util.*;

public class NetCQ {

    static JpcapCaptor captor;
    static NetworkInterface[] array;
    String str, info;
    int x;
    static int choice;
    static int capturetime;
    static List<Integer> srcip_count1 = new ArrayList<> ();    
	
    public static void main(String[] args) {
         
	capturing();
        out();
        
    }
	
    public static void capturing(){
	
	array = JpcapCaptor.getDeviceList();
        System.out.println("Available Interfaces");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " > " + array[i].description);
	}
		
	System.out.println("________________________\n");
	
        choice = Integer.parseInt(getInput("Choose interfaces(0,1,) : "));
       
	capturetime = Integer.parseInt(getInput("Enter time/(ms) : "));
		
	System.out.println("Listening on Interface -> "
				+ array[choice].description);
	System.out.println("________________________\n");
		
        
        try {
            captor = JpcapCaptor.openDevice(array[choice], 65535, false,capturetime);
            System.out.println("___________Captured_____________\n");
            //captor.setFilter("icmp",true);
            
        } 
        catch (IOException ioe) {
            ioe.printStackTrace();
	}
        
        
        
	int count = 0;
        while (count<10) { 
            
            Packet info = captor.getPacket();
            
            
            if (info != null){
            
            
                //Selecting protocol and adding data to PacketData class    
                PacketData selected_info = mapStore.converting(info);
                String newsrc = selected_info.src_ip1;
                String newdest = selected_info.dest_ip1;
                int newsrcport = selected_info.src_port1;
                int  newdestport = selected_info.dest_port1;
                int newlength = selected_info.length1;
                List<String> newprotocol = new ArrayList<String>();
            
                Data data = new Data();
            
                Data.alldata_map.add(selected_info);
                
                mapStore.addsrcport(selected_info,data,newsrcport,count,Data.srcport_map);
                mapStore.adddestport(selected_info,data,newdestport,count,Data.destport_map);
                mapStore.addsrcip(selected_info,data,newsrc,count,Data.srcip_map);
                mapStore.adddestip(selected_info,data,newdest,count,Data.destip_map);
                mapStore.addlength(selected_info,data,newlength,count,Data.length_map);
                mapStore.addprotocol(selected_info,data,newprotocol,count,Data.protocol_map);
                
                count++;
            
            }
        }
        
        System.out.println("___________Stored_____________\n");
       
    }
    
    
    public static void out(){
    
        System.out.println("1.Details of packets through a specific IP address (Src)");
        System.out.println("2.Details of packets through a specific IP address (Dest)");
        System.out.println("3.Data of packets from Known SourceIP to DestIP");
        System.out.println("4.Length of packets through a specific port\n");
        int qchoice = Integer.parseInt(getInput("Select a query (1,2,..) : "));
        
        
        if (qchoice == 1){
            System.out.println("SourceIP Addresses are : ");
            System.out.printf("%s\n",Data.srcip_map.keySet());
            String pchoice = (getInput("Enter the SourceIP Address : "));
            System.out.printf("\n_______Details of packet for Address %s  ________\n\n",pchoice);
            
            extract.getpacketnumber(Data.srcip_map, pchoice)   ;    
           
        }
        else if (qchoice == 2){
            System.out.println("DestinationIP Addresses are : ");
            System.out.printf("%s\n",Data.destip_map.keySet());
            String pchoice = (getInput("Enter the DestinationIP Address : "));
            System.out.printf("\n_______Details of packet for Address %s  ________\n\n",pchoice);
            
            extract.getpacketnumber(Data.destip_map, pchoice)   ;  
          
        }
        else if (qchoice == 3){
            System.out.println("Source IP Addresses are : ");
            System.out.printf("%s\n",Data.srcip_map.keySet());
            String srcip = (getInput("Enter the SourceIP Address : "));
            System.out.println("Destination IP Addresses are : ");
            System.out.printf("%s\n",Data.destip_map.keySet());
            String destip = (getInput("Enter the DestinationIP Address : "));
             
            List<Integer> ret2 = extract.getpacketsrcdesc(srcip, destip)   ;  
        
        }
        else if (qchoice == 4){
            System.out.println("Port Numbers are : ");
            System.out.printf("%s\n",Data.srcport_map.keySet());
            int pchoice = Integer.parseInt(getInput("Enter the Port number : "));
            System.out.printf("\n_______Packet lengths for port %s  ________\n\n",pchoice);
            
            List<Integer> retl = extract.getpacketlength(Data.srcport_map, pchoice)   ;  
             
        }
        back_exit();
    
    }
    
    
    public static void back_exit(){
            
            System.out.println("________________________\n");
            System.out.println("1.Back to quering");
            System.out.println("2.Exit");
            int opchoice = Integer.parseInt(getInput("\nSelect an option : "));
            if(opchoice == 1){
                out();
            }
            else
                System.exit(1);
            
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

