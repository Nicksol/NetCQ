/*
 * PacketData.java
 * Define PacketData class to collect both TCP and UDP packets as same type objects  
 * Version 1.3
 * 08/12/2014
 */


package netcq;

import java.util.HashMap;
import java.util.List;
import java.util.*;


//class to store packets with TCP/UDP details(jpcap default have no protocol variable)
class PacketData{
    public Integer length1;
    public String  src_ip1;
    public Integer src_port1;
    public String  dest_ip1;
    public Integer dest_port1;
    public List<String> protocol1 = new ArrayList<String>(); 
   
}


class Data{
    
    //HashMaps to store packet data(Final stroing objects)
    public static List<PacketData> alldata_map = new ArrayList<> ();
    public static HashMap<String,List<Integer>> srcip_map = new HashMap<>();
    public static HashMap<String,List<Integer>> destip_map = new HashMap<>();
    public static HashMap<Integer,List<Integer>> srcport_map = new HashMap<>();
    public static HashMap<Integer,List<Integer>> destport_map = new HashMap<>();
    public static HashMap<Integer,List<Integer>> length_map = new HashMap<>();
    public static HashMap<String,List<Integer>> protocol_map = new HashMap<>();
    
}