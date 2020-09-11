package reservation;
import java.sql.*;
import java.text.*;
import java.util.*;

public class Reservation {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
    int tic =0;
            DateFormat date=new SimpleDateFormat("dd/MM/yyyy \t\t\t\t\t\t\t\tHH:mm:ss");
        Calendar cal=Calendar.getInstance();
System.out.println(date.format(cal.getTime()));
System.out.println(" \t\t------------------------------------------");
System.out.println("\t\t | WELCOME TO ONLINE RESERVATION SYSTEM |");
System.out.println(" \t\t------------------------------------------");
 System.out.println(" * TITLE: ");
System.out.println("   ->Enter 1 for Mr. ");
System.out.println("   ->Enter 2 for Ms./Mrs. ");
System.out.print("Enter Here: ");
int y=1;
do{
    int t=sc.nextInt();
if(t!=1 && t!=2){
    System.out.println("Invalid Input...Try Again!");
    System.out.print("Enter Here: ");
}
else{
    y=2;
}}while(y==1);
        
        System.out.println("");
        System.out.println(" * NAME: ");
        System.out.print("   ->Enter Your First Name: ");
String fn=sc.next();
System.out.print("   ->Enter Your Last Name: ");
String ln=sc.next();

    System.out.print("Enter Your Age: ");
    int p=1;
    int ag;
    do{ ag=sc.nextInt();
    if(ag>99 || ag<18){
        
        System.out.println("Invalid Input...Try Again!");
        System.out.print("Enter Here: ");
    }
    else{p=2;}
    }while(p==1);
 System.out.println("Enter Addhar Card No");
        System.out.print("Enter Here : ");
  String add; 
   int xy=1;
 do{add=sc.next();
     int c=add.length();
 
 if(c!=10){System.out.println("Invalid Input...Try Again!");
        System.out.print("Enter Here: ");}
 else{xy=2;}}while(xy==1);
    int mk=0;  int sum=ag+tic+5;
        for(int cb=0;cb<=sum;cb++){
        mk=sum+cb;
        
        }

        System.out.println(" * Choose Transportation Mode:");
        System.out.println("  -> Press 1 for Airways.");
        System.out.println("  -> Press 2 for Railways.");
        System.out.println("  -> Press 3 for Roadways.");
        System.out.print("  Enter Here:- ");
        int x=1;int a;
    do{
         a=sc.nextInt();
        if(a>3){
            System.out.println("Invalid Input...Try Again!");   
            System.out.print("  Enter Here:- ");
        }
        else{
        x=2;
        }
    }    
    while(x==1);
       
    if(a==1){
        System.out.println("");
        System.out.println("   WELCOME TO OUR AIRWAYS DEPARTMENT...!  ");
        System.out.println(" -> Press 1 for International Flights.");
        System.out.println(" -> Press 2 for Domestic Flights.");
        System.out.print("Enter Here: ");
        int z=1;int b;
         do{
         b=sc.nextInt();
         if(b>2){
             System.out.println("Invalid Input...Try Again!");
             System.out.print("  Enter Here:- ");}
         else z=2;
         }while(z==1);
         
         if(b==1){
        System.out.println(" List of Available Flights are as follows:- ");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| SR.NO| NAME OF FLIGHT     | DEPARTURE | ARRIVAL  | FROM      | TO            | PRICE |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 1    | Jet Airways        | 20:00 PM  | 01:00 AM | New Delhi | San Francisco | 80000 |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 2    | Spicejet           | 20:00 PM  | 01:00 AM | New Delhi | Adelaide      | 70000 |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 3    | Indigo Airways     | 20:00 PM  | 12:00 AM | New Delhi | New York      | 60000 |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 4    | Kingfisher Airways | 20:00 PM  | 12:00 AM | New Delhi | Vancouver     | 50000 |"); 
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("");
        System.out.print("Enter Choice: ");
        int fly;
        fly=sc.nextInt();
        if(fly==1){
            System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*80000;
            System.out.println("Your booking NO is ->"+mk);
     System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> San Francisco ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(fly==2){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*70000;
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO ->  Adelaide ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(fly==3){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*60000;
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> New York  ");
            System.out.println("Thanks for Choosing Us!!!");
        }
        else if(fly==4){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*50000;
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> Vancouver ");
            System.out.println("Thanks for Choosing Us!!!");
        }else{System.out.println("Invalid Input...!");}
        
         }else if(b==2){
             System.out.println(" List of Available Flights are as follows:- ");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| SR.NO| NAME OF FLIGHT     | DEPARTURE | ARRIVAL  | FROM      | TO            | PRICE |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 1    | Jet Airways        | 20:00 PM  | 01:00 AM | New Delhi | Mumbai        | 8000  |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 2    | Spicejet           | 20:00 PM  | 01:00 AM | New Delhi | Kolkata       | 7000  |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 3    | Indigo Airways     | 20:00 PM  | 12:00 AM | New Delhi | Chennai       | 6000  |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 4    | Kingfisher Airways | 20:00 PM  | 12:00 AM | New Delhi | Chandigarh    | 5000  |"); 
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("");
        System.out.print("Enter Choice: ");
        int fly;
        fly=sc.nextInt();
        if(fly==1){
            System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*8000;System.out.println("");
             System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> MUMBAI ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(fly==2){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*7000;System.out.println("");
            System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> KOLKATA ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(fly==3){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*6000;
            System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> CHEENAI ");
            System.out.println("Thanks for Choosing Us!!!");
        }
        else if(fly==4){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*5000;
            System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> CHANDIGARH ");
            System.out.println("Thanks for Choosing Us!!!");
        }else{System.out.println("Invalid Input...!");}
         
         }          
    }else if(a==2){
          System.out.println("List of available trains are: ");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| SR.NO| NAME OF TRAINS     | DEPARTURE | ARRIVAL  | FROM      | TO            | PRICE |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 1    | Shatabadi Express  | 20:00 PM  | 01:00 AM | New Delhi | Mumbai        | 800   |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 2    | Rajdhani Express   | 20:00 PM  | 01:00 AM | New Delhi | Amritsar      | 700   |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 3    | Garib Rath         | 20:00 PM  | 12:00 AM | Ambala    | Patna         | 600   |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 4    | Kalka Express      | 20:00 PM  | 12:00 AM | Chandigarh| Shimla        | 500   |"); 
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("");
        System.out.println("");
        System.out.print("Enter Choice: ");
        int rail=sc.nextInt();
   
        
        if(rail==1){
            System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*800;System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> MUMBAI ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(rail==2){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*700;System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> AMRITSAR ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(rail==3){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*600;
            System.out.println("");
             System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> AMBALA TO -> PATNA ");
            System.out.println("Thanks for Choosing Us!!!");
        }
        else if(rail==4){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*500;
            System.out.println("");
             System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> CHANDIGARH TO -> SHIMLA ");
            System.out.println("Thanks for Choosing Us!!!");
        }else{System.out.println("Invalid Input...!");
        
        }
   
    
    
    }else if(a==3){
     System.out.println("List of available Buses are: ");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| SR.NO| NAME OF BUSES      | DEPARTURE | ARRIVAL  | FROM      | TO            | PRICE |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 1    | Volvo              | 20:00 PM  | 01:00 AM | New Delhi | Mumbai        | 800   |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 2    | INDO-CANADIAN      | 20:00 PM  | 01:00 AM | New Delhi | Amritsar      | 700   |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 3    | HARYANA ROADWAYS   | 20:00 PM  | 12:00 AM | Ambala    | Patna         | 600   |");
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("| 4    | CTU                | 20:00 PM  | 12:00 AM | Chandigarh| Shimla        | 500   |"); 
        System.out.println("|------|-----------------------------------------------------------------------|-------|");
        System.out.println("");
        System.out.print("Enter Choice: ");
        int rail=sc.nextInt();
   
        
        if(rail==1){
            System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*800;System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> MUMBAI ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(rail==2){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*700;System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> NEW DELHI TO -> AMRITSAR ");
            System.out.println("Thanks for Choosing Us!!!");
        }else if(rail==3){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*600;
            System.out.println("");
              System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> AMBALA TO -> PATNA ");
            System.out.println("Thanks for Choosing Us!!!");
        }
        else if(rail==4){
        System.out.println("How many Tickets you want to Book?");
            System.out.print("Enter Here: ");
             tic=sc.nextInt();
            int pr=tic*500;
            System.out.println("");
             System.out.println("Your booking NO is ->"+mk);
            System.out.println(tic+" Tickets are Booked on the Name of "+fn+" "+ln);
            System.out.println("Net Payable Amount is "+pr);
            System.out.println("FROM -> CHANDIGARH TO -> SHIMLA ");
            System.out.println("Thanks for Choosing Us!!!");
        }
        else{
            System.out.println("Invalid Input...!");
        
        
        }}
      
              PreparedStatement stmt=null;
        String dbURL;
        dbURL = "jdbc:mysql://localhost:3306/google";
       String username="root";
       String password="";
       try {
  Connection dbCon;
         dbCon = DriverManager.getConnection(dbURL,username,password);
 stmt=dbCon.prepareStatement("insert into RESERVATION values(?,?,?) ");
 stmt.setString(1, fn);
 stmt.setString(2, add);
stmt.setInt(3, mk);
 int i=stmt.executeUpdate();
       }
       
       catch(SQLException ex){
           System.out.println(ex.getMessage());
       
                              
       }
        
      
    
    }}
