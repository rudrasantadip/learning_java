import java.util.*;

class Device
{
    
    private String mac_address;
    private String ip_address;


    Device(String mc_address, String ip_address)
    {
       set_mac(mc_address);
       set_ip(ip_address);
    }

    void set_mac(String mc_address) // setter for mac address
    {
        this.mac_address=mc_address;
    }

    void set_ip(String ip_address) // setter for ip address
    {
        this.ip_address=ip_address;
    }

    String get_ip() // getter for mac address
    {
        return this.mac_address;
    }

    String get_mac() // getter for ip_address
    {
        return this.ip_address;
    }

    public void connect(Switch s,int port) // attempt to connect the device to the switch
    {
        if (s.get_port(port)==false)
        {
        s.set_port(port, true);
        System.out.println("Port "+ port +" is now active");

        }
        else
        {
            System.out.println("Port "+ port+" is already connected");
        }
        
    }

    public void ping(Device this,String dest_ip)
    {
        
    }
}

public class Switch // Uses CAM --> Content Addressible Memory.
{
    ArrayList <String> CAM = new ArrayList<>();
    private boolean [] port_states = new boolean[8];
    Switch () // constructor 
    {
        for (int i=0;i<8;i++)
        {
            port_states[i]=false;
        }
    }
    public boolean get_port(int port_num) // getter to check if the port is active or inactive
     {
        return this.port_states[port_num];
     }

    public void set_port(int port_num, boolean state) // set the state of the port
     {
        this.port_states[port_num]=state;
     }
    
    public static void main(String args[])
    {
        
        Switch s = new Switch();
        Device my_pc = new Device("ecf.2fce.3ede.sds9","192.254.254.56");
        Device friends_pc = new Device("ecd.0e.ed54.98", "192.254.254.50");
        Device anotherDevice = new Device("ec89.870d.hg6s.09ec","192.254.254.45" );
        my_pc.connect(s,0);
        friends_pc.connect(s,1);
        anotherDevice.connect(s, 0);
    }
}