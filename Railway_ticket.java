import java.util.*;
public class Railway_ticket {
   
    static int option=0;
    static int n=0;
    static int x=0,v=0;
    static int begins=0;
    static int ends=0;
 static String c="";
    static String pass="";
    static int available=10;
    static int available1=10;
    static int wait=0;
    static int vacancy=0;
    static int b=0;
    static String temp_user="";
    static  Scanner gt=new Scanner(System.in);
    static   ArrayList<String>username=new ArrayList<>();
    static   ArrayList<String>list=new ArrayList<>();
    static   ArrayList<String>var=new ArrayList<>();
    static HashMap<String,String>user_name=new HashMap<String,String>();
    static HashMap<String,Integer>user_id=new HashMap<String,Integer>();
    static HashMap<String,Integer>user_wait=new HashMap<String,Integer>();
    static HashMap<String,Integer>ticket_booking=new HashMap<String,Integer>();
    static HashMap<String,Integer>waiting_list=new HashMap<String,Integer>();
    // static ArrayList<Integer>waitinglist=new ArrayList<Integer>();
    
    static ArrayList<String>station=new ArrayList<String>(Arrays. asList("Coimbatore","Tirupur","Erode","Salem","Chennai"));
    
    static HashMap<String,Integer>Station=new HashMap<String,Integer>();
    static HashMap<String,Integer>junction=new HashMap<String,Integer>();

  

  public static void create_Account()
  {
    System.out.println("ENTER THE USERNAME");
    String user=gt.next();
    username.add(user);
      System.out.println();
      System.out.println("Enter the Password");
      pass=gt.next();
      user_name.put(user,pass);
      System.out.println();
      System.out.println("ACCOUNT ADDED SUCCESSFULLY");
      System.out.println();
      System.out.println("IF YOU WANT TO  CREATE ANOTHER USER ACCOUNT");
      System.out.println("PRESS 1: YES");
      System.out.println("PRESS 2: NO");
      int nu=gt.nextInt();
        if(nu==1)
        {
            create_Account();
        }
        else if(nu==2)
        {
            user();
        }
    else
    {
        System.out.println("ENTER THE VALID OPTION");
        create_Account();
    }
    }

  
    public static void user()
    {
        System.out.println();
        System.out.println("PRESS 1: CREATE ACCOUNT");
        System.out.println("PRESS 2: LOGIN");
        System.out.println("PRESS 3: EXIT");
        System.out.println();
        System.out.println("Enter the option");
        int op=gt.nextInt();
        if(op==1)
        {
            create_Account();
        }
        else if(op==2)
        {
            login();

        }
        else if(op==3)
        {
            main(null);
        }
        else
        {
            System.out.println("ENTER THE VALID NUMBER");
            user();
        }

    }
    public static void login()
    {
        System.out.println("ENTER THE USERNAME");
        System.out.println("IF YOU WANT TO GO BACK:  TYPE  ''BACK''");

        temp_user=gt.next();
        if(temp_user.equals("back"))
        {
            user ();
        }
        if(username.contains(temp_user))
        {
            System.out.println();
            System.out.println("ENTER THE PASSWORD TO THE USER");
            System.out.println();
            String password=gt.next();
            System.out.println();
            if(user_name.get(temp_user).equals(password))
            {
                System.out.println("PRESS 1: TICKET BOOKING");
                System.out.println("PRESS 2: CANCELLING THE TICKET");
                System.out.println("PRESS 3: EXIT");
                int opt=gt.nextInt();
                System.out.println();
                
                if(opt==1)
                {
                    ticket_booking();
                }
                else if(opt==2)
                {
                    cancel_ticket();
                }
                else if(opt==3)
                {
                   user(); 
                }

            }
            else
            {
                System.out.println("INVALID PASSWORD");
                login();
            }

        }
        else{
            System.out.println("YOU ENTER INVALID USER NAME:");
            login();
        }

    }

    
    public static void ticket_booking()
    {
        
        System.out.println("TYPE 0  : COIMBATORE STATION");
        System.out.println("TYPE 1  : TIRUPUR    STATION");
        System.out.println("TYPE 2  : ERODE      STATION");
        System.out.println("TYPE 3    : SALEM      STATION");
        System.out.println("TYPE 4  : CHENNAI    STATION");
        System.out.println();
        System.out.println("ENTER STATION FROM YOUR JOURNEY STARTS");
         begins=gt.nextInt();
        System.out.println(station.get(begins));
        System.out.println();
        System.out.println("ENTER THE STATION YOUR JOURNEY ENDS");
         ends=gt.nextInt();
        System.out.println(station.get(ends));
        System.out.println();
        System.out.println("ENTER THE NUMBER OF SEATS");
        int n_seat=gt.nextInt();
        System.out.println();
     ticket_booking.put(temp_user,n_seat);
    
            for(int i=begins;i<ends;i++)
            {
                if(Station.get(station.get(i))==0)
                {
                    System.out.println("chumma");
                    System.out.println("if");
                     String name="";
                    name+=temp_user;
                    name+="-";
                    name+=station.get(begins);
                    name+="-";
                    name+=station.get(ends);  
                   if(i<ends)
                   {
                    System.out.println("guna");
                    int a=Station.get(station.get(begins));
                    if(a==0)
                    { a=n_seat;}
                    System.out.println(wait+"  wait "+a);
                    System.out.println(junction.get(station.get(begins)));
                        if(b<=5)
                        {
                            junction.put(station.get(begins),a);
                               boolean flsg=false;
                            b+=junction.get(station.get(begins));
                            System.out.println(b+"   bvalue");
                           junction.put(station.get(begins),b);
                           System.out.println(junction+"   junction");
                           if(b<=5 && flsg!=true)
                           {
                               waiting_list.put(station.get(begins),b);   
                               user_wait.put(name,b);
                           }
                           else
                           {
                               if(b!=5 && flsg==true)
                               {
                                   
                                   int z=waiting_list.get(station.get(begins));
                                   z=5-z;
                                   waiting_list.put(station.get(begins),z);
                                   user_wait.put(name,b);
                                }
                               else
                               {
                                   System.out.println("you cannot bok");
                               }
                               flsg=true;

                           }
                        }
                        else
                        {
                           System.out.println(" you cnnot book a ticket"); 
                        }
                    

                }
                   else
                {
                    for(int j=begins;j<ends;j++)
                        {
                            
                        Station.put(station.get(j),Station.get(station.get(j))-n_seat);
                        }
                        user_id.put(name,n_seat);
                    
                }
            }
                else if(i==ends-1 && Station.get(station.get(ends-1))!=0)
                {
                    
                    for(int j=begins;j<ends;j++)
                    {
                        if(Station.get(station.get(j))>=n_seat)
                        {

                           
                              Station.put(station.get(j),Station.get(station.get(j))-n_seat);
                              System.out.println("st   "+Station.get(station.get(j))+"      "+j);
                              String name="";
                              name+=temp_user;
                              name+="-";
                              name+=station.get(begins);
                              name+="-";
                              name+=station.get(ends);
                              user_id.put(name,n_seat);
                        }
                        else
                        {
                            System.out.println("el");
                            String name="";
                              name+=temp_user;
                              name+="-";
                              name+=station.get(begins);
                              name+="-";
                              name+=station.get(ends);
                             
                              int a=n_seat-Station.get(station.get(j));
                              Station.put(station.get(j),Station.get(station.get(j)));
                              user_id.put(name,Station.get(station.get(j)));
                              Station.put(station.get(j),0);
                              boolean flsg=false;
                              if(a<=5)
                              {
                                junction.put(station.get(j),a);
                                if(!list.contains(station.get(j)))
                                {
                                    list.add(station.get(j));
                                    junction.put(station.get(j),a);
                                    if(b<=5 && flsg!=true)
                                    {
                                        waiting_list.put(station.get(begins),a); 
                                        user_wait.put(name,waiting_list.get(station.get(begins))); 
                                        break; 
                                    }
                                    else
                                    {
                                        if(b!=5 && flsg==true)
                                        {
                                            
                                            int z=waiting_list.get(station.get(begins));
                                            z=5-z;
                                            waiting_list.put(station.get(begins),z);
                                            user_wait.put(name,waiting_list.get(station.get(begins)));
                                            break;
    
    
                                        }
                                        else{
                                            System.out.println("you cannot bok");
                                        }
                                        flsg=true;
    
                                    }
                                }
                                else
                                {
                                    b+=junction.get(station.get(j));
                                    System.out.println(b+"   bvalue");
                                   junction.put(station.get(j),b);
                                   if(b<=5 && flsg!=true)
                                   {
                                       waiting_list.put(station.get(begins),b); 
                                       user_wait.put(name,waiting_list.get(station.get(begins))); 
                                       break; 
                                   }
                                   else
                                   {
                                       if(b!=5 && flsg==true)
                                       {
                                           
                                           int z=waiting_list.get(station.get(begins));
                                           z=5-z;
                                           waiting_list.put(station.get(begins),z);
                                           user_wait.put(name,waiting_list.get(station.get(begins)));
                                           break;
   
   
                                       }
                                       else{
                                           System.out.println("you cannot bok");
                                       }
                                       flsg=true;
   
                                   }

                                }
                                
                                System.out.println(junction+"   junction");
                               
                              }
                              else
                              {
                                int c=a-b;
                                c=5-c;
                                junction.put(station.get(begins),c);
                               
                                 v+=junction.get(station.get(begins));
                                 System.out.println(v+"   value");
                                junction.put(station.get(begins),v);
                                System.out.println(junction+"   junction");
                                if(v<=5 && flsg!=true)
                                {
                                    waiting_list.put(station.get(begins),v);   
                                    user_wait.put(name,waiting_list.get(station.get(begins)));
                                }
                                else
                                {
                                    if(v!=5)
                                    {
                                        
                                        int z=waiting_list.get(station.get(begins));
                                        z=5-z;
                                        waiting_list.put(station.get(begins),z);
                                        user_wait.put(name,waiting_list.get(station.get(begins)));
                                     }

                                }
                            }
                        }
                    } 
                }
            }
            System.out.println(user_id+"                           "+user_wait);
            System.out.println("TICKES ARE BOOKED SUCCESSFULLY");
            System.out.println();
            System.out.println(Station+"                     "+waiting_list);
            System.out.println();
            user();
       
    }
    public static void cancel_ticket()
    {
        System.out.println("0.Coimbatore\n1.Tirupur\n2.Erode\n3.Salem\n");
        System.out.println();
        String var="";
       System.out.println("enter the boarding point of the user");
       int boarding=gt.nextInt();
       System.out.println("enter the destination point of the user ");
       int destination=gt.nextInt();
        var+=temp_user;
        var+="-";
        var+=station.get(boarding);
        String board=station.get(boarding);
        var+="-";
        var+=station.get(destination);
        String dest=station.get(destination);
        System.out.println("var");
        int avail_ticket=user_id.get(var);
        System.out.println("Select ythe number of tickets");
        int cancel=gt.nextInt();
        if( avail_ticket>cancel)
        {
            avail_ticket-=cancel;
             user_id.put(var,avail_ticket);
            vacancy=10-avail_ticket;
            ArrayList<String>userwaiting=new ArrayList<>(user_wait.keySet());
            for(int i=0;i<userwaiting.size();i++)
            {
                if(userwaiting.get(i).contains(board) && userwaiting.get(i).contains(dest))
                {
                String st[]=userwaiting.get(i).split("-");
                 c=st[0];
                c+="-";
                c+=station.get(boarding);
                c+="-";
                c+=station.get(destination);
                vacancy-=user_id.get(c);
                System.out.println(vacancy+" vaacany"+"     ");
                System.out.println( user_id.get(c));
                while(vacancy>=0)
                    {
                    user_id.put(userwaiting.get(i),user_id.get(userwaiting.get(i))+1);
                    user_wait.put(userwaiting.get(i),user_wait.get(userwaiting.get(i))-1);
                    vacancy--;
                    System.out.println(vacancy+" guna ");
                    }
                }
                else
                {
                    System.out.println("Ivalid Username");
                    cancel_ticket();

                }
            }
        }
        else if(avail_ticket==cancel)
        {
            ArrayList<String>userwaiting=new ArrayList<>(user_wait.keySet());
            for(int i=0;i<userwaiting.size();i++)
            {
               if(userwaiting.get(i).contains(board) && userwaiting.get(i).contains(dest))
                {
                String st[]=userwaiting.get(i).split("-");
                 c=st[0];
                c+="-";
                c+=station.get(boarding);
                c+="-";
                c+=station.get(destination);

               }
               else
               {
                System.out.println("Ivalid Username");
                cancel_ticket();
               }

               user_id.put(userwaiting.get(i),cancel);
               user_wait.put(userwaiting.get(i),0);
             }
            System.out.println(user_id+"         "+user_wait);
            user();
        }
    }
    public static void main(String[]args)
    {
        System.out.println("Welcome to Railway Ticket Booking");
        for(int i=0;i<5;i++)
                {
                    Station.put(station.get(i),10);
                    junction.put(station.get(i),0);
                }
        user();
    }  
}



