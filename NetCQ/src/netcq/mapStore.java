/*
 * mapStore.java
 * Define MultivaluedMaps to store details of packets 
 * Version 1.0
 * 12/11/2014
 */


package netcq;


import java.util.*;
import javax.ws.rs.core.MultivaluedMap;
import jpcap.packet.*;


public class mapStore {
    
    public static MultivaluedMap<String,Integer> srcip_map;
    public static MultivaluedMap<String,Integer> destip_map;
    public static MultivaluedMap<Integer,Integer> srcport_map;
    public static MultivaluedMap<Integer,Integer> destport_map;
    public static MultivaluedMap<Integer,Integer> length_map;
    public static MultivaluedMap<String,Integer> protocol_map;
    
    //public static MultivaluedMap<Integer,PacketData> alldata_map;
    public static HashMap<Integer,PacketData> alldata_map = new HashMap<Integer,PacketData>();
    
    public Integer[] convert(int[] int_val){
    
        Integer[] Int_val = new Integer[int_val.length] ;
        for(int i = 0;i<int_val.length;i++){
            Int_val[i] = new Integer (int_val[i]);
        }
        
        return Int_val;
    }
    
    public static PacketData converting(Packet cap_packet){
         
        PacketData pack = new PacketData();
         
         if(cap_packet instanceof TCPPacket){
		TCPPacket tc = (TCPPacket) cap_packet;
                pack.length1 = (int)tc.length;
                pack.src_ip1 = tc.src_ip.toString();
                pack.src_port1 = tc.src_port;
                pack.dest_ip1 = tc.dst_ip.toString();
                pack.dest_port1 = tc.dst_port;
                pack.protocol1 = "TCP";
         }
           
         if(cap_packet instanceof UDPPacket){
		UDPPacket ud = (UDPPacket) cap_packet;
		pack.length1 = ud.length;
                pack.src_ip1 = ud.src_ip.toString();
                pack.src_port1 = ud.src_port;
                pack.dest_ip1 = ud.dst_ip.toString();
                pack.dest_port1 = ud.dst_port;
                pack.protocol1 = "UDP";
        }
         
         return pack;    
    } 
    
}