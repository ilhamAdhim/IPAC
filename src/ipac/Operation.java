package ipac;

/**
 *
 * @author Arga Diaz Prawira Yudha
 */

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operation {
    
    //check valid ip input
    public static boolean isIpFormat(String ip){
        String[] ipBlocks=ip.split("\\.");
        for(String i:ipBlocks){
            for(int j=0;j<i.length();j++){
                char c=i.charAt(j);
                if((c>='a' && c<='z')||(c>='A' && c<='Z')){
                    return false;
                }
            }
        }
        for(String i:ipBlocks){
            int ipCheck=Integer.parseInt(i);
            if(ipCheck<0 || ipCheck>255)return false;
        }
        return !(ipBlocks.length>4 || ipBlocks.length<4);
    }
    
    //check valid url input
    public static boolean isURLFormat(String url){
        String[] urlBlocks=url.split("\\.");
        int countblocks=0;
        for(String i:urlBlocks){
            for(int j=0;j<i.length();j++){
                char c = i.charAt(j);
                if(countblocks==0)continue;
                if(c>='0' && c<='9'){
                    return false;
                }
            }
            countblocks++;
        }
        return urlBlocks.length<=6 && urlBlocks.length>1;
    }
    
    //split the ip of String to array of ip blocks
    public static int [] ipSpliter(String ipString){
        int [] blocks=new int[4];
        String[] blocksString=ipString.split("\\.");
        for(int i=0;i<blocksString.length;i++){
            blocks[i]=Integer.parseInt(blocksString[i]);
        }
        return blocks;
    }
    
    //convert from ip blocks to binary ip blocks
    public static String[] ipBinaryString(int[] ip){
        String[] ipBinary=new String[4];
        for(int i=0;i<ip.length;i++){
            ipBinary[i]=Integer.toBinaryString(ip[i]);
        }
        return ipBinary;
    }
    
    //it calculate the subnet mask from the assigned CIDR
    public static String subnet(int cidr){
        try{
        String binarySubnet="";
        int count=0;
        for(int i=0;i<cidr;i++){
            count++;
            binarySubnet+="1";
            if(count%8==0 && i>0)binarySubnet+=".";
        }
        for(int i=0;i<32-cidr;i++){
            count++;
            binarySubnet+="0";
            if(count%8==0 && i>0)binarySubnet+=".";
        }
        String[] maskString=new String[4];
        for(int i=0;i<maskString.length;i++){
            maskString[i]=binarySubnet.split("\\.")[i];
        }
        int[] maskInt=new int[4];
        for(int i=0;i<maskInt.length;i++){
            int pow=7;
            int dec=0;
            for(int j=0;j<maskString[0].length();j++){
                if(maskString[i].charAt(j)=='1'){
                    dec+=Math.pow(2, pow);
                    pow--;
                }
            }
            maskInt[i]=dec;
        }
        String subnet="";
        for(int i=0;i<4;i++){
            subnet+=maskInt[i]+".";
        }
        return subnet;
        }catch(Exception e){
            return null;
        }
    }
    
    //it return the total number of ip host based on CIDR value
    public static int hostNum(int cidr){
        //total host per subnet
        int hostNum=0;
        if(cidr>=0 && cidr<=32){
            double totalHost=Math.pow(2,(32-(double)cidr));
            hostNum=(int)totalHost;
            return hostNum;
        }
        return 0;
    }
    
    //it contain host ip address
    public static String[] hostValue(String ip, int hostNum){
        int[] ipBlocks=ipSpliter(ip);
        String[] ipString=new String[hostNum];
        for(int i=0;i<hostNum;i++){
            ipString[i]=(ipBlocks[0]+"."+ipBlocks[1]+"."+ipBlocks[2]+"."+i);
        }
        return ipString;
    }
    
    public static String classType(String ip){
        int[] ipBlocks=new int[4];
        for(int i=0;i<ipBlocks.length;i++){
            ipBlocks[i]=Integer.parseInt(ip.split("\\.")[i]);
        }
        int initByte=ipBlocks[0];
        if(initByte>=0 && initByte<=127){
            return "Class A";
        }else if(initByte>=128 && initByte<=191){
            return "Class B";
        }else if(initByte>=192 && initByte<223){
            return "Class C";
        }else if(initByte>=224 && initByte<247){
            return "Class D";
        }else if(initByte>=248 && initByte<255){
            return "Class E";
        }
        return null;
    }
    
    // Validate the URL connection, return InetAddress object
    public static InetAddress validAddress(String url){
        try{
            InetAddress address = InetAddress.getByName(url);
            //set the timeout of 5 seconds connecting
            if(address.isReachable(10000)){
                return address;
            }
        }catch(UnknownHostException e){
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
