/*
 * mapStore.java
 * Define MultivaluedMaps to store details of packets 
 * Version 1.1
 * 14/11/2014
 */


package netcq;

import java.util.*;
import jpcap.packet.*;


public class mapStore {
    
    //convert captured Packet object to PacketData object
    public static PacketData converting(Packet cap_packet){
         
        PacketData pack = new PacketData();
         
         if(cap_packet instanceof TCPPacket){
		TCPPacket tc = (TCPPacket) cap_packet;
                pack.length1 = (int)tc.length;
                pack.src_ip1 = tc.src_ip.getHostAddress();
                pack.src_port1 = tc.src_port;
                pack.dest_ip1 = tc.dst_ip.getHostAddress();
                pack.dest_port1 = tc.dst_port;
                pack.protocol1 = "TCP";
         }
           
         if(cap_packet instanceof UDPPacket){
		UDPPacket ud = (UDPPacket) cap_packet;
		pack.length1 = ud.length;
                pack.src_ip1 = ud.src_ip.getHostAddress();
                pack.src_port1 = ud.src_port;
                pack.dest_ip1 = ud.dst_ip.getHostAddress();
                pack.dest_port1 = ud.dst_port;
                pack.protocol1 = "UDP";
        }
         
         return pack;    
    }

    
    //method to insert packetnumbers list to a specific src_ip by checking srcip_map hashmap contains that src_ip
    public static void addsrcip(PacketData packet,Data data,String src,int count1,HashMap srcip_tempmap){
        
         if(!Data.srcip_map.containsKey(packet.src_ip1)){
            
            List<Integer> srcip_count = new ArrayList<> ();
            srcip_count.add(count1);
            Data.srcip_map.put(packet.src_ip1,srcip_count);
            }
            else{
                List<Integer> temp = new ArrayList<> ();
                String tempsrc = Data.alldata_map.get(count1).src_ip1;
                if(srcip_tempmap.containsKey(src)){
                
                    for ( String key : Data.srcip_map.keySet() ) {
                    
                        if(tempsrc.equals(key)){
                            
                            temp = Data.srcip_map.get(src);
                            srcip_tempmap.put(src ,temp.add(count1));
                            Data.srcip_map.put(packet.src_ip1,temp);
                        }
                    }
                }
            }
        }
    
    
    //method to insert packetnumbers list to a specific dest_ip by checking destip_map hashmap contains that dest_ip
    public static void adddestip(PacketData packet,Data data,String dest,int count1,HashMap destip_tempmap){
        
         if(!Data.destip_map.containsKey(packet.dest_ip1)){
            
            List<Integer> destip_count = new ArrayList<> ();
            destip_count.add(count1);
            Data.destip_map.put(packet.dest_ip1,destip_count);
            }
            else{
                List<Integer> temp = new ArrayList<> ();
                String tempsrc = Data.alldata_map.get(count1).dest_ip1;
                if(destip_tempmap.containsKey(dest)){
                
                    for ( String key : Data.destip_map.keySet() ) {
                    
                        if(tempsrc.equals(key)){
                            
                            temp = Data.destip_map.get(dest);
                            destip_tempmap.put(dest ,temp.add(count1));
                            Data.destip_map.put(packet.dest_ip1,temp);
                        }
                    }
                }
            }
        }
    
    
    //method to insert packetnumbers list to a specific src_port by checking srcport_map hashmap contains that src_port
    public static void addsrcport(PacketData packet,Data data,int port,int count1,HashMap srcport_tempmap){
        
         if(!Data.srcport_map.containsKey(packet.src_port1)){
            
            List<Integer> srcport_count = new ArrayList<> ();
            srcport_count.add(count1);
            Data.srcport_map.put(packet.src_port1,srcport_count);
            }
            else{
                List<Integer> temp = new ArrayList<> ();
                int tempport = Data.alldata_map.get(count1).src_port1;
                if(srcport_tempmap.containsKey(port)){
                
                    for ( int key : Data.srcport_map.keySet() ) {
                    
                        if(tempport == key){
                            
                            temp = Data.srcport_map.get(port);
                            srcport_tempmap.put(port ,temp.add(count1));
                            Data.srcport_map.put(packet.src_port1,temp);
                        }
                    }
                }
            }
        }
    
    
    //method to insert packetnumbers list to a specific dest_port by checking destport_map hashmap contains that dest_port
    public static void adddestport(PacketData packet,Data data,int port,int count1,HashMap destport_tempmap){
        
         if(!Data.destport_map.containsKey(packet.dest_port1)){
            
            List<Integer> destport_count = new ArrayList<> ();
            destport_count.add(count1);
            Data.destport_map.put(packet.dest_port1,destport_count);
            }
            else{
                List<Integer> temp = new ArrayList<> ();
                int tempport = Data.alldata_map.get(count1).dest_port1;
                if(destport_tempmap.containsKey(port)){
                
                    for ( int key : Data.destport_map.keySet() ) {
                    
                        if(tempport == key){
                            
                            temp = Data.destport_map.get(port);
                            destport_tempmap.put(port ,temp.add(count1));
                            Data.destport_map.put(packet.dest_port1,temp);
                        }
                    }
                }
            }
        }
    
    
    //method to insert packetnumbers list to a specific length by checking length_map hashmap contains that length value
    public static void addlength(PacketData packet,Data data,int length,int count1,HashMap length_tempmap){
        
         if(!Data.length_map.containsKey(packet.length1)){
            
            List<Integer> length_count = new ArrayList<> ();
            length_count.add(count1);
            Data.length_map.put(packet.length1,length_count);
            }
            else{
                List<Integer> temp = new ArrayList<> ();
                int templength = Data.alldata_map.get(count1).length1;
                if(length_tempmap.containsKey(length)){
                
                    for ( int key : Data.length_map.keySet() ) {
                    
                        if(templength == key){
                            
                            temp = Data.length_map.get(length);
                            length_tempmap.put(length ,temp.add(count1));
                            Data.length_map.put(packet.length1,temp);
                        }
                    }
                }
            }
    }
    
    
    //method to insert packetnumbers list to a specific protocol by checking protocol_map hashmap contains that protocol value
    public static void addprotocol(PacketData packet,Data data,String protocol,int count1,HashMap protocol_tempmap){
        
         if(!Data.protocol_map.containsKey(packet.protocol1)){
            
            List<Integer> protocol_count = new ArrayList<> ();
            protocol_count.add(count1);
            Data.protocol_map.put(packet.protocol1,protocol_count);
            }
            else{
                List<Integer> temp = new ArrayList<> ();
                String tempprotocol = Data.alldata_map.get(count1).protocol1;
                if(protocol_tempmap.containsKey(protocol)){
                
                    for ( String key : Data.protocol_map.keySet() ) {
                    
                        if(tempprotocol.equals(key)){
                            
                            temp = Data.protocol_map.get(protocol);
                            protocol_tempmap.put(protocol ,temp.add(count1));
                            Data.protocol_map.put(packet.protocol1,temp);
                        }
                    }
                }
            }
    }

}

