
package db;
import java.sql.*;
public class DbConnect {
    private Connection con;
    private Statement st;
     public Statement getSt() {
        return st;
    }
    private PreparedStatement getFile,getMsg,insertMsg,insertUser,checkLogin,getUser,changePhoto,getUsersByLocation,pricesubmit,AdminLogin,UpdatePrice;
    public DbConnect(){
        try{
 Class.forName("oracle.jdbc.driver.OracleDriver");
 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","test");
 st=con.createStatement();
 //getFile=con.prepareStatement("select filename,ufile from ptalk where pid=?");
 //getMsg=con.prepareStatement("select * from ptalk where sid=? and rid=?");
 //insertMsg=con.prepareStatement("insert into ptalk (sid,rid,udate,msg,filename,ufile) values (?,?,now(),?,?,?)");
 insertUser=con.prepareStatement("insert into Admin_log values (?,?,?,?,?,?,?,?,?,?)");
 pricesubmit=con.prepareStatement("insert into price values (?,?,?,?)");
 checkLogin=con.prepareStatement("select * from user_detail where email=? and pass=?");
 AdminLogin=con.prepareStatement("select * from Admin_log where email=? and pass=?");
 getUser=con.prepareStatement("select * from user_detail where email=?");
 UpdatePrice=con.prepareStatement("update price set wheat=?,rice=?,potato=?,tomato=? where wheat=?");
 //changePhoto=con.prepareStatement("update user_detail set photo=? where email=?");
 //getUsersByLocation=con.prepareStatement("select * from user_detail where state=? and city=? and area like ? and email !=?");
 
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public ResultSet getFile(int p){
        try{        
getFile.setInt(1, p);
ResultSet r=getFile.executeQuery();
if(r.next()){
    return r;
}else{
    return null;
}
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public ResultSet getMsg(String s, String r){
        try{        
getMsg.setString(1, s);
getMsg.setString(2, r);
ResultSet rs=getMsg.executeQuery();
return rs;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public String insertMsg(String s,String r,String m,String fn,java.io.InputStream in) {
        try{        
 insertMsg.setString(1, s);
 insertMsg.setString(2, r);
 insertMsg.setString(3, m);
 insertMsg.setString(4, fn);
 insertMsg.setBinaryStream(5, in);
int x=insertMsg.executeUpdate();
if(x==1)
 return "Done";
else 
 return "Error";
        }catch(Exception ex){
            ex.printStackTrace();
            return "Exception";
        }
    }
     public String pricesubmit(String w,String r,String p,String t) {
        try{        
 pricesubmit.setString(1, w);
 pricesubmit.setString(2, r);
 pricesubmit.setString(3, p);
 pricesubmit.setString(4, t);
 
int x=pricesubmit.executeUpdate();
if(x==1)
 return "Done";
else 
 return "Error";
        }catch(Exception ex){
            ex.printStackTrace();
            return "Exception";
        }
    }
    public ResultSet getUsersByLocation(String s,String c,String a,String e){
        try{        
getUsersByLocation.setString(1, s);
getUsersByLocation.setString(2, c);
getUsersByLocation.setString(3, ""+a+"%");
getUsersByLocation.setString(4, e);
ResultSet r=getUsersByLocation.executeQuery();
return r;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public String changePhoto(String e,java.io.InputStream im) {
        try{        
 changePhoto.setString(2, e);
 changePhoto.setBinaryStream(1, im);
int x=changePhoto.executeUpdate();
if(x==1)
 return "Done";
else 
 return "Error";
        }catch(Exception ex){
            ex.printStackTrace();
            return "Exception";
        }
    }
    public ResultSet getUser(String e){
        try{        
getUser.setString(1, e);
 

ResultSet r=getUser.executeQuery();
if(r.next()){
    return r;
}else{
    return null;
}
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    public String insertUser(String e,String p,String n,String ph,String gen,java.sql.Date d,String s,String c,String a,java.io.InputStream im) {
        try{        
 insertUser.setString(1, e);
 insertUser.setString(3, n);
 insertUser.setString(4, ph);
 insertUser.setString(5, gen);
 insertUser.setString(2, p);
 insertUser.setDate(6, d);
 insertUser.setString(7, s);
 insertUser.setString(8, c);
 insertUser.setString(9, a);
 insertUser.setBinaryStream(10, im);
int x=insertUser.executeUpdate();
if(x==1)
 return "Done";
else 
 return "Error";
        }catch(java.sql.SQLIntegrityConstraintViolationException ex){
            ex.printStackTrace();
            return "Already";
        }catch(Exception ex){
            ex.printStackTrace();
            return "Exception";
        }
    }
    public String UpdatePrice(String nw,String nr,String np,String nt,String ow) {
        try{        
 UpdatePrice.setString(1, nw);
 UpdatePrice.setString(2, nr);
 UpdatePrice.setString(3, np);
 UpdatePrice.setString(4, nt);
 UpdatePrice.setString(5, ow);
  
int x=UpdatePrice.executeUpdate();
if(x==1)
 return "Done";
else 
 return "Error";
        }catch(java.sql.SQLIntegrityConstraintViolationException ex){
            ex.printStackTrace();
            return "Already";
        }catch(Exception ex){
            ex.printStackTrace();
            return "Exception"; 
        }
    }
    public ResultSet checkLogin(String e,String p){
        try{        
checkLogin.setString(1, e);
checkLogin.setString(2, p);
ResultSet r=checkLogin.executeQuery();
if(r.next()){
    return r;
}else{
    
    return null;
}
        }catch(Exception ex){
           
            ex.printStackTrace();
           return null;
        }
    }
      public ResultSet AdminLogin(String e,String p){
        try{        
AdminLogin.setString(1, e);
AdminLogin.setString(2, p);
ResultSet r=AdminLogin.executeQuery();
if(r.next()){
    return r;
}else{
 
    return null;
}
        }catch(Exception ex){
            
            ex.printStackTrace();
           return null;
        }
    }
     
}
