/*
 * output.java
 * print outputs of the queries  
 * Version 1.2
 * 19/11/2014
 */


package netcq;

public class output {
    
        public static void printpacket(Integer count11){
		
		  PacketData printing_packet = Data.alldata_map.get(count11);
		  System.out.println("--------------------------------------------------------------------------------------------");
                  System.out.println("Packet Number : "+count11);
		  System.out.println("Source IP : "+(String) printing_packet.src_ip1+" | port : "+ printing_packet.src_port1);
		  System.out.println("Destination IP : "+(String) printing_packet.dest_ip1+" | port : "+ printing_packet.dest_port1);
		  System.out.println("Packet Length : "+ printing_packet.length1+" | protocol : "+ printing_packet.protocol1);
		
        }
	public static void printpacketSrcip(Integer count11){
		
		  System.out.println("--------------------------------------------------------------------------------------------");
                  PacketData printing_packet = Data.alldata_map.get(count11);
		  System.out.println("Packet Number : "+count11);
		  System.out.println("Source IP : "+(String) printing_packet.src_ip1+" | port : "+ printing_packet.src_port1);
		  		
	}
	public static void printpacketdestip(Integer count11){
		
		  System.out.println("--------------------------------------------------------------------------------------------");
                  PacketData printing_packet = Data.alldata_map.get(count11);
		  System.out.println("Packet Number : "+count11);
		  System.out.println("Destination IP : "+(String) printing_packet.dest_ip1+" | port : "+ printing_packet.dest_port1);
		  
		
	}
	public static void printpacketprtcl(Integer count11){
		
		  System.out.println("--------------------------------------------------------------------------------------------");
                  PacketData printing_packet = Data.alldata_map.get(count11);
		  System.out.println("Packet Number : "+count11);
		  System.out.println("Protocol : "+ printing_packet.protocol1);
		 
		
        }
	public static void printpacketlngth(Integer count11){
		
		  System.out.println("--------------------------------------------------------------------------------------------");
                  PacketData printing_packet = Data.alldata_map.get(count11);
		  System.out.println("Packet Number : "+count11);
		  System.out.println("Packet Length : "+ printing_packet.length1);
		  
		
	}
        
        
        

}
