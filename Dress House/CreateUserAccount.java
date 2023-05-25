import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateUserAccount {
    String fullName;
    String password;
    String confirmpassword;
    String mobileno ;
    Scanner sc;
    FileWriter f;

    //Empty Constructor
    public CreateUserAccount()
    {
        //this.fullName="";
    }

    public CreateUserAccount(String fullName,String password,String confirmpassword,String mobileno )
    {

     
        this.fullName=fullName; 
        this.password=password;
        this.confirmpassword=confirmpassword;
        this.mobileno=mobileno;
    }

    //setter & getter method
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public void setconfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    public void mobileno(String mobileno) {
        this.mobileno =  mobileno;
    }
    
    public String FullName() {
        return fullName;
    }
    public String password() {
        return password;
    }
    public String confirmpassword() {
        return confirmpassword;
    }
    public String mobileno() {
        return mobileno;
    }
    
    public void addAccount() throws IOException
    {
       
        try{
           File file = new File("Data/Users.txt");
            file.createNewFile();
          FileWriter   f=new FileWriter(file,true);
           f. write( FullName()+"\t");
           f. write(password()+"\t");
           f. write(confirmpassword()+"\t");
           f. write(mobileno()+"\n");
           f.flush();
           f.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }    
    }

    
	
    public boolean getAccount(String userName,String userPassword)
    {
        boolean isAuth = false;
        
       File file = new File("Data/Users.txt");
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userName) && value[1].equals(userPassword))
                {
                    isAuth=true;}
				
                }
            }
        
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuth;
    }
}
