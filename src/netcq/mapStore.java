/*
 * mapStore.java
 * Define MultivaluedMaps to store details of packets 
 * Version 1.4.1
 * 18/12/2014
 */
package netcq;

import java.util.*;
import jpcap.packet.*;

public class mapStore {

    //convert captured Packet object to PacketData object and find the protocol of the packet
    public static PacketData converting(Packet cap_packet) {

        PacketData pack = new PacketData();

        if (cap_packet instanceof TCPPacket && (cap_packet instanceof IPPacket)) {
            TCPPacket tc = (TCPPacket) cap_packet;

            if (tc.src_ip != null && tc.dst_ip != null) {
                pack.length1 = (int) tc.length;
                pack.src_ip1 = tc.src_ip.getHostAddress();
                pack.src_port1 = tc.src_port;
                pack.dest_ip1 = tc.dst_ip.getHostAddress();
                pack.dest_port1 = tc.dst_port;
                pack.protocol1.add("IP");   //Network layer
                pack.protocol1.add("TCP");  //Transport layer
                if (tc.src_port == 8080) {
                    pack.protocol1.add("HTTP");
                } else if (tc.src_port == 21) {
                    pack.protocol1.add("FTP");
                } else if (tc.src_port == 23) {
                    pack.protocol1.add("Telnet");
                } else if (tc.src_port == 25) {
                    pack.protocol1.add("SMTP");
                } else {
                    pack.protocol1.add("T");    //Other packets in application layer(TCP in Transport layer)
                }
            }
        }

        if (cap_packet instanceof UDPPacket && cap_packet instanceof IPPacket) {
            UDPPacket ud = (UDPPacket) cap_packet;

            if (ud.src_ip != null && ud.dst_ip != null) {

                pack.length1 = ud.length;
                pack.src_ip1 = ud.src_ip.getHostAddress();
                pack.src_port1 = ud.src_port;
                pack.dest_ip1 = ud.dst_ip.getHostAddress();
                pack.dest_port1 = ud.dst_port;
                pack.protocol1.add("IP");   //Network layer
                pack.protocol1.add("UDP");  //Transport layer
                if (ud.src_port == 53) {
                    pack.protocol1.add("DNS");
                } else if (ud.src_port == 137) {
                    pack.protocol1.add("NBNS");
                } else {
                    pack.protocol1.add("U");    //Other packets in application layer(UDP in Transport layer)
                }
            }
        }

        if (cap_packet instanceof ICMPPacket) {
            ICMPPacket icmp = (ICMPPacket) cap_packet;

            if (icmp.src_ip != null && icmp.dst_ip != null) {

                pack.length1 = (int) icmp.length;
                pack.src_ip1 = icmp.src_ip.getHostAddress();
                pack.src_port1 = 99999; //Unused port number to indicate no src port for ICMP
                pack.dest_ip1 = icmp.dst_ip.getHostAddress();
                pack.dest_port1 = 99999;    //Unused port number to indicate no dest port for ICMP
                pack.protocol1.add("ICMP"); //Network layer

            }
        }

        return pack;
    }

    //method to insert packetnumbers list to a specific src_ip by checking srcip_map hashmap contains that src_ip
    public static void addsrcip(PacketData packet, Data data, String src, int count1) {

        if (!Data.srcip_map.containsKey(packet.src_ip1)) {

            List<Integer> srcip_count = new ArrayList<>();
            srcip_count.add(count1);
            Data.srcip_map.put(packet.src_ip1, srcip_count);
        } else {

            try {
                List<Integer> temp = new ArrayList<>();
                String tempsrc = Data.alldata_map.get(count1).src_ip1;
                if (Data.srcip_map.containsKey(src)) {

                    for (String key : Data.srcip_map.keySet()) {

                        if (tempsrc.equals(key)) {

                            temp = Data.srcip_map.get(src);
                            temp.add(count1);
                            Data.srcip_map.put(src, temp);
                            Data.srcip_map.put(packet.src_ip1, temp);
                        }
                    }
                }
            } catch (NullPointerException e) {
            }
        }
    }

    //method to insert packetnumbers list to a specific dest_ip by checking destip_map hashmap contains that dest_ip
    public static void adddestip(PacketData packet, Data data, String dest, int count1) {

        if (!Data.destip_map.containsKey(packet.dest_ip1)) {

            List<Integer> destip_count = new ArrayList<>();
            destip_count.add(count1);
            Data.destip_map.put(packet.dest_ip1, destip_count);
        } else {

            try {
                List<Integer> temp = new ArrayList<>();
                String tempsrc = Data.alldata_map.get(count1).dest_ip1;
                if (Data.destip_map.containsKey(dest)) {
                    for (String key : Data.destip_map.keySet()) {

                        if (tempsrc.equals(key)) {

                            temp = Data.destip_map.get(dest);
                            temp.add(count1);
                            Data.destip_map.put(dest, temp);
                            Data.destip_map.put(packet.dest_ip1, temp);
                        }

                    }
                }

            } catch (NullPointerException e) {
            }
        }
    }

    //method to insert packetnumbers list to a specific src_port by checking srcport_map hashmap contains that src_port
    public static void addsrcport(PacketData packet, Data data, int port, int count1) {

        if (!Data.srcport_map.containsKey(packet.src_port1)) {

            List<Integer> srcport_count = new ArrayList<>();
            srcport_count.add(count1);
            Data.srcport_map.put(packet.src_port1, srcport_count);
        } else {

            try {

                List<Integer> temp = new ArrayList<>();
                int tempport = Data.alldata_map.get(count1).src_port1;
                if (Data.srcport_map.containsKey(port)) {

                    for (int key : Data.srcport_map.keySet()) {

                        if (tempport == key) {

                            temp = Data.srcport_map.get(port);
                            temp.add(count1);
                            Data.srcport_map.put(port, temp);
                            Data.srcport_map.put(packet.src_port1, temp);
                        }
                    }
                }
            } catch (NullPointerException e) {
            }
        }
    }

    //method to insert packetnumbers list to a specific dest_port by checking destport_map hashmap contains that dest_port
    public static void adddestport(PacketData packet, Data data, int port, int count1) {

        if (!Data.destport_map.containsKey(packet.dest_port1)) {

            List<Integer> destport_count = new ArrayList<>();
            destport_count.add(count1);
            Data.destport_map.put(packet.dest_port1, destport_count);
        } else {

            try {
                List<Integer> temp = new ArrayList<>();
                int tempport = Data.alldata_map.get(count1).dest_port1;
                if (Data.destport_map.containsKey(port)) {

                    for (int key : Data.destport_map.keySet()) {

                        if (tempport == key) {

                            temp = Data.destport_map.get(port);
                            temp.add(count1);
                            Data.destport_map.put(port, temp);
                            Data.destport_map.put(packet.dest_port1, temp);
                        }
                    }

                }
            } catch (NullPointerException e) {
            }
        }
    }

    //method to insert packetnumbers list to a specific length by checking length_map hashmap contains that length value
    public static void addlength(PacketData packet, Data data, int length, int count1) {

        if (!Data.length_map.containsKey(packet.length1)) {

            List<Integer> length_count = new ArrayList<>();
            length_count.add(count1);
            Data.length_map.put(packet.length1, length_count);
        } else {

            try {
                List<Integer> temp = new ArrayList<>();
                int templength = Data.alldata_map.get(count1).length1;
                if (Data.length_map.containsKey(length)) {

                    for (int key : Data.length_map.keySet()) {

                        if (templength == key) {

                            temp = Data.length_map.get(length);
                            temp.add(count1);
                            Data.length_map.put(length, temp);
                            Data.length_map.put(packet.length1, temp);
                        }
                    }

                }
            } catch (NullPointerException e) {
            }
        }
    }

    //method to insert packetnumbers list to a specific protocol by checking protocol_map hashmap contains that protocol value
    public static void addprotocol(PacketData packet, Data data, List<String> protocol, int count1) {

        int protocols = packet.protocol1.size();

        for (int i = 0; i < protocols; i++) {
            if (!Data.protocol_map.containsKey(packet.protocol1.get(i))) {
                List<Integer> protocol_count = new ArrayList<>();
                protocol_count.add(count1);
                Data.protocol_map.put(packet.protocol1.get(i), protocol_count);

            } else {

                try {
                    List<Integer> temp = new ArrayList<>();
                    try {
                        String tempprotocol = Data.alldata_map.get(count1).protocol1.get(i);

                        if (Data.protocol_map.containsKey(tempprotocol)) {

                            for (String key : Data.protocol_map.keySet()) {

                                if (tempprotocol.equals(key)) {
                                    temp = Data.protocol_map.get(tempprotocol);
                                    temp.add(count1);
                                    Data.protocol_map.put(packet.protocol1.get(i), temp);
                                }
                            }

                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                } catch (NullPointerException e) {
                }

            }
        }
    }

}
