/*
 * PacketData.java
 * Define PacketData class to collect both TCP and UDP packets as same type objects  
 * Version 1.0
 * 12/11/2014
 */


package netcq;


import jpcap.packet.*;


class PacketData {
    public Integer length1;
    public String  src_ip1;
    public Integer src_port1;
    public String  dest_ip1;
    public Integer dest_port1;
    public String protocol1;  
}


 