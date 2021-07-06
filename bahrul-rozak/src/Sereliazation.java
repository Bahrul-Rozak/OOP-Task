// Select semua library yang ada
import java.io.*;
  
class Sereliazation implements java.io.Serializable
{
    public int a;
    public String b;
  
    // Default constructor
    public Sereliazation(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
  
}
  
class Test
{
    public static void main(String[] args)
    {   
        Sereliazation object = new Sereliazation(123,"Bambang");
        String filename = "file.txt";
          
        try
        {   
            
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
         
            out.writeObject(object);
              
            out.close();
            file.close();
              
            System.out.println("Object sudah di  serialiasasi");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        Sereliazation object1 = null;
  
       
        try
        {   
            
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
           
            object1 = (Sereliazation)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object sudah di deserialiasasi ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
  
    }
}
