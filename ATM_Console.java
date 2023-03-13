import java.util.*;
public class ATM_Console {
   static Scanner gt=new Scanner(System.in);
   static int password=1122;
   static int TotalBalance=0;
   static int  total=0;
   static int depo=0;
   static int trans=0;
   static String id="";
   static String temp_user="";
    static HashMap<String, Integer>user_acc=new HashMap<String,Integer>();
    static HashMap<String ,Integer>user_pin=new HashMap<String,Integer>();
    static HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
    static HashMap<String ,String>min_st=new HashMap<String,String>();
    static HashMap<String,Integer>pin_change=new HashMap<String,Integer>();
    static ArrayList<String>user_name=new ArrayList<String>();
    static String Exit="exit";
    static int arr[]={123,456,789};
    static int arr1[]={2000,500,200,100};


   public static void user()
   {
    System.out.println("----------------");
    System.out.println();
     System.out.println("Select the User Account");
     System.out.println();
     System.out.println("YOU WNAT TO GO BACK:''TYPE EXIT IN USERNAME''");
     System.out.println();
     int i=0;
     System.out.println(user_pin);
     System.out.println();
    
        System.out.println("Enter the user_name");
          id=gt.next();
        System.out.println();
        
                int  ram_pin=123;
                int jaanu_pin=456;
                int kathir_pin=789;
                    
                    if(id.equals(Exit))
                    {
                        main(null);
                    }
                if(user_name.contains(id))
                {
                    System.out.println("Enter the user Pin for "+id);
                    int userpin=gt.nextInt();
                    System.out.println("Welcome "+id);
                    System.out.println();
                   
                    System.out.println();
                  
                    if(user_pin.get(id)==userpin)
                    {
                    System.out.println();
                  
                        
                        int j=0;
                        
                       if(j==0)
                       {
                        useraccount();
                       }
                    } 
                    else 
                    {
                        System.out.println("Enter a valid pin");
                        user();
                    } 
                            
                }
                    else
                    {
                        System.out.println("Invalid user_name");
                        System.out.println("TRY AGAIN");
                        user();
                    }
    }
    public static void useraccount() 
    {
        // System.out.println("fun"+user_acc.get(id));
        System.out.println();
        System.out.println("1.Cash Withdrawl");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance Amount ");
        System.out.println("4.Account Transfer");
        System.out.println("5.Pin Change");
        System.out.println("6.Mini Statement");
        System.out.println("7.Exit");
       
        System.out.println();
    

        System.out.println("Enter the number ");
                        int nu=gt.nextInt();
                        if(nu==1)
                        {
                         
                                System.out.println("Enter the amount you for withdrawl");
                                int withdraw=gt.nextInt();
                                System.out.println("2000");
                                int twot=gt.nextInt();
                                System.out.println("500");
                                int fiveh=gt.nextInt();
                                System.out.println("100");
                                int hun=gt.nextInt();
                                total=(twot*2000)+(fiveh*500)+(hun*100);
                                System.out.println(total+"       "+TotalBalance);
                            if(withdraw==total)
                        {
                            if(TotalBalance>total)
                            {
                                if(user_acc.get(id)%100==0)
                                {
                                    if(user_acc.get(id)>total)
                                    {
                                        int tth=total/2000;
                                        if(total>0)
                                        {
                                            if(map.get(2000)>=tth)
                                            {
                                                map.put(2000,map.get(2000)-tth);
                                                total-=2000*tth;
                                            }
                                            else
                                            {
                                                total-=(map.get(2000)*2000);
                                                map.put(2000,0);

                                            }
                                        }
                                        int fh=total/500;
                                        if(total>0)
                                        {
                                            if(map.get(500)>=fh)
                                            {
                                                map.put(500,map.get(500)-fh);
                                                total-=500*fh;
                                            }
                                            else
                                            {
                                                total-=(map.get(500)*500);
                                                map.put(500,0);
                                            }
                                        }
                                        int th=total/200;
                                        if(total>0)
                                        {
                                            if(map.get(200)>=th)
                                            {
                                                map.put(200,map.get(200)-th);
                                                total-=200*th;
                                            }
                                            else
                                            {
                                                total-=(map.get(200)*200);
                                                map.put(200,0);

                                            }
                                        }
                                        int h=total/100;
                                        if(total>0)
                                        {
                                            if(map.get(100)>=h)
                                            {
                                                map.put(2000,map.get(2000)-h);
                                                total-=(100*h);
                                            }
                                            else
                                            {
                                                total-=(map.get(100)*100);
                                                map.put(100,0);

                                            }
                                        }
                                        System.out.println("Your withdrawl amount is"+total);
                                        user_acc.put(id,user_acc.get(id)-total);
                                        System.out.println("Your Balance amount is "+(user_acc.get(id)));
                                        System.out.println();
                                        TotalBalance-=total;
                                        System.out.println("Your ATM BALANCE Is"+TotalBalance);
                                        String out="WITHDRAWAL YOUR AMOUNT"+total;
                                        min_st.put(id,min_st.get(id)+"\n"+out);
                                        useraccount();
                                    }
                                }    
                                    else
                                    {
                                    System.out.println("Insufficient fund");
                                    useraccount();
                                    }
                                
                            }
                            else
                            {
                                System.out.println();
                                System.out.println("Sorry of Inconvince");
                                System.out.println("OUr ATM has INsufficient Funds");

                                System.out.println();
                                main(null);
                            }
                        }
                        else
                            {
                            System.out.println("enter the corect frequency");
                            useraccount();
                            }
                        }
                        else if(nu==2)
                        {
                            System.out.println("Enter the Deposit amount ");
                            int depo=gt.nextInt();
                            System.out.println();
                            System.out.println("2000");
                            int twot=gt.nextInt();
                            System.out.println("500");
                            int fiveh=gt.nextInt();
                            System.out.println("200");
                            int thun=gt.nextInt();
                            System.out.println("100");
                            int hun=gt.nextInt();
                            if(twot+map.get(2000)<=100 && fiveh+map.get(500)<=100 && thun+map.get(200)<=100 && hun+map.get(100)<=100)
                            {
                                map.put(2000,map.get(2000)+twot);
                                map.put(500,map.get(500)+fiveh);
                                map.put(200,map.get(200)+thun);
                                map.put(100,map.get(100)+hun);
            
                            }
                            else
                            {
                                System.out.println("Limit exceeded");
                                useraccount();
                            }

                            int Total=0;
                            Total+=(twot*2000)+(fiveh*500)+(thun*200)+(hun*100);
                            if(Total==depo)
                            {
                                int var=user_acc.get(id)+Total;
                                user_acc.put(id,user_acc.get(id)+Total);
                                System.out.println("Your Balance amount"+(user_acc.get(id)));
                                System.out.println();
                                TotalBalance+=Total;
                                System.out.println("Your ATM BALANCE   "+TotalBalance);
                                String out="YOU DEPOSITED AMOUNT IN YOU ACCOUNT"+user_acc.get(id);
                                min_st.put(id,min_st.get(id)+"\n"+out);
                                useraccount();

                            }
                            else
                            {
                                System.out.println("Enter the Correct number frequencies");
                                useraccount();
                            }

                        }
                        else if(nu==3)
                        {
                                System.out.println();
                                System.out.println("Balance Amount is "+user_acc.get(id));
                                System.out.println();
                                String out="YOU CHECKED THE BALANCE AMOUNT";
                                min_st.put(id,min_st.get(id)+"\n"+out);
                                useraccount();
                                
                        }
                        else if(nu==4)
                        {
                            System.out.println("Enter the Amount you need to Transfer  ");
                             trans=gt.nextInt();

                            // System.out.println(trans+"    "+user_acc.get(id));

                            

                            if(user_acc.get(id)>trans) 
                            {
                            transfer();
                            }
                            else
                            {
                                System.out.println("you have Insufficient amount to transfer");
                                useraccount();
                            }
                        }
                        else if(nu==5)
                        {
                            System.out.println("enter the Existing user pin");
                            int pin=gt.nextInt();
                            if(user_pin.get(id)==pin)
                            {
                                System.out.println("Enter a New Pin");
                                int npin=gt.nextInt();
                                System.out.println("Renter the Pin");
                                int rpin=gt.nextInt();
                                if(npin==rpin && rpin!=pin)
                                {
                                    user_pin.put(id,rpin);
                                    System.out.println("pin will be Successfully Changed");
                                    System.out.println();
                                    String out="pin will be changed ";
                                    min_st.put(id,min_st.get(id)+"\n"+out);
                                    useraccount();
                                }
                                else
                                {
                                    System.out.println("enter the Correct Pin  OR Existing Pin and New Pin will be Same");
                                    useraccount();
                                }


                            }

                        }
                        else if(nu==6)
                        {
                            System.out.println(min_st.get(id));
                            useraccount();
                        }
                        else if(nu==7)
                        {
                            // System.out.println(min_st);
                            user();
                            System.out.println("Press 4 T0 Exit");
                        }

                        else
                        {
                                System.out.println("Enter the valid number");
                                useraccount();
                        }
   } 
   public static void transfer()
   {
    System.out.println("------------------"
    );
    System.out.println(user_pin);
    System.out.println("------------------");
    System.out.println("Select the user to transfer the amount");
     temp_user=gt.next();
    if(user_name.contains(temp_user))
                            {
                                user_acc.put(id,user_acc.get(id)-trans);
                                user_acc.put(temp_user,user_acc.get(temp_user)+trans);
                                if(temp_user.equals(id))
                                {
                                    System.out.println("CANNOT TRANSFER A SELF ACCOUNT");
                                    transfer();
                                }
                                else
                                {
                                System.out.println("Amount Transferred Sucesfully to "+ temp_user +" Account");
                                String in="Amount Transferred Sucesfully to "+ temp_user +" Account";
                                String out="Amount Received Sucesfully to "+ temp_user +" Account from  "+id;
                                min_st.put(id,min_st.get(id)+"\n"+in);
                                min_st.put(temp_user,min_st.get(temp_user)+"\n"+out);
                                useraccount();
                                }
                            }
                            else
                            {
                                System.out.println("ENTER THE VALID USERNAME");
                                transfer();
                            }
   }
    public static void main(String[]args)
    {
        System.out.println("Welcome to ATM");
       
        for(int k=0;k<arr1.length;k++)
        {
            map.put(arr1[k],0);
        }
        System.out.println(map);
        
        System.out.println("1.Admin");
        System.out.println("2.User");
        
        int i=0;
        while(i==0)
        {
            int x=gt.nextInt();
            if(x==1)
            {
                admin();
            }
            else if(x==2)
            {
                
               
                user();
                    
                    System.out.println(user_pin);
                    // pin_change.put(name,arr[])

            }

                
            
        }
        }

    
   public  static void admin()
    {
        System.out.println("Enter the password");
        int pass=gt.nextInt();
        System.out.println();
        int i=0;
        while(i==0)
        {
            if(pass==password)
            {
                System.out.println();
             Admin();
            }
            else
            {
                System.out.println("ENTER A VALID PASSWORD");
                System.out.println();
                admin();

            }

        }
    }
    public static void Admin()
    {
        System.out.println("1.CREATE USER ACCOUNT");
        System.out.println("2.Check Account Balance ");
        System.out.println("3.Deposit The Amount");
       
        System.out.println("4.Exit");
        System.out.println();
        System.out.println("Enter the number: ");
        int ad=gt.nextInt();
        System.out.println();
         if(ad==1)
            {
                for(int i1=0;i1<3;i1++)
                {
                    System.out.println();
                System.out.println("Enter the user_Name to store");
                String name=gt.next();
                System.out.println();
                System.out.println("Enter the user_Pin to store");
                int pin=gt.nextInt();
                user_acc.put(name,1000);
                user_pin.put(name,pin);
                

                 user_name.add(name);
                }
            }
        else if(ad==2)
        {
                System.out.println("Balance   "+TotalBalance);
                System.out.println();
                Admin();
                // break;
        }
           else if(ad==3)
           {    
            Admin_deposit(); 
            main(null); 
           }
            else if(ad==4)
            {
                System.out.println("---------------------------------");
                System.out.println();
                main(null);
                
            }
            
            else 
            {
                System.out.println("Enter the Valid Number");
                Admin(); 


            }
                

        }
        public static void Admin_deposit()
        {
            System.out.println("ENTER YOUR DEPOSIT AMOUNT");
            depo=gt.nextInt();
                System.out.println();
                System.out.println("2000");
                int twot=gt.nextInt();
                System.out.println("500");
                int fiveh=gt.nextInt();
                System.out.println("200");
                int thun=gt.nextInt();
                System.out.println("100");
                int hun=gt.nextInt();
                int Balance=(twot*2000)+(fiveh*500)+(thun*200)+(hun*100);
                if(depo%100==0)
                {
                if(twot+map.get(2000)<=100 && fiveh+map.get(500)<=100 && thun+map.get(200)<=100 && hun+map.get(100)<=100 && depo==Balance)
                {
                    TotalBalance=depo;
                    map.put(2000,map.get(2000)+twot);
                    map.put(500,map.get(500)+fiveh);
                    map.put(200,map.get(200)+thun);
                    map.put(100,map.get(100)+hun);
                    
                   
                    

                }
                else
                            {
                                System.out.println("Limit exceeded");
                                System.out.println(TotalBalance+"                "+depo);
                                Balance=0;
                                TotalBalance=(map.get(2000)*2000)+(map.get(500)*500)+(map.get(200)*200)+(map.get(100)*100);
                                System.out.println("Chumms"+"             "+TotalBalance);
                                
                                Admin_deposit();
                            }
                            System.out.println("Your Balance Amount:"+TotalBalance);
                            System.out.println();
                            System.out.println("AMOUNT WILL BE SUCCEEFULY DEPOSITED IN ATM");
                            System.out.println();
                            System.out.println(map);
                            Admin();
                }
                else
                {
                    System.out.println("ENTER THE MULTIPLES OF HUNDREDS");
                    Admin_deposit();
                }

        }


    }



