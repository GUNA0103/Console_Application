import java.util.*;
public class Split_wise {
    static int t_amount=0;
    static int t_number=0;
    static int t=0;
    static String name="";
    static String r_name="";
    static ArrayList<String>username=new ArrayList<>();
    static ArrayList<String>user=new ArrayList<>();
    static ArrayList<Integer>list1=new ArrayList<>();
    static ArrayList<String>friendsname=new ArrayList<>();
    static HashMap<String,String>user_name=new HashMap<String,String>();
    static HashMap<String,ArrayList<Integer>>split=new HashMap<>();
    static HashMap<String,Integer>friends_name=new HashMap<String,Integer>();
    static Scanner gt=new Scanner(System.in);
    public static void sign_up()
    {
        System.out.println("Enter the username");
        String name=gt.next();
        user.add(name);
        System.out.println();
        System.out.println("Enter the Password");
        String password=gt.next();
        user_name.put(name,password);
        System.out.println("ACCOUNT SUCCESSFULLY CREATED");
        main(null);


    }
    public static void main (String []args)
    {
        System.out.println("Welcome to Splitwise Apllication");
        System.out.println();
        System.out.println("PRESS 1. SIGN UP\nPRESS 2. LOGIN");

        int op=gt.nextInt();
        if(op==1)
            sign_up();
        else if(op==2)
            login();
        else
            main(null);
    } 
    public static void friends()
    {
        
        System.out.println();
        
        System.out.println("SELECT THE NUMBER OF FRIENDS IN A GANG");
        int num=gt.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("ENTER THE FREINDS NAME");
            String n=gt.next();
            username.add(n);
            ArrayList<Integer> nam_list=new ArrayList<Integer>();
            for(int nam=0;nam<num;nam++)
            {
                nam_list.add(0);
            }
            split.put(username.get(i),nam_list);
            
        }
       System.out.println(split);
    }
    public static void login()
    {
        System.out.println("Enter the user name");
         name=gt.next();
        if(user.contains(name))
        {
            System.out.println();
            System.out.println("Enter the user password");
            String password=gt.next();
            if(user_name.get(name).equals(password))
            {
                System.out.println(("if you want to add friends list type 1 "));
                int f=gt.nextInt();
                if(f==1)
                {
                    friends();
                }
                else
                {
                    
                    

                }
                System.out.println();
                   System.out.println();
                        
                        restaraunt();
                    
                   
            }
                else
                {
                    System.out.println("INVALID");
                    login();
                }
        }
    }

    
    public static void restaraunt()
    {
        System.out.println("0.EXPENSES");
                System.out.println("1.EXIT");
                System.out.println();
                System.out.println("ENTER YOUR CHOICE ");
                System.out.println();
                int choice=gt.nextInt();
                if(choice==0)
                {

                    System.out.println("ENTER THE TOTAL AMOUNT FOR RESTARUNT");
                     t_amount=gt.nextInt();
                    System.out.println();
                    System.out.println("SELECT THE USER WHO PAID THE AMOUNT");
                    r_name=gt.next();
                    if(username.contains(r_name))
                    {
                     
                        System.out.println("SELECT THE NUMBER OF FRIENDS WAS expensen");
                            t_number=gt.nextInt();
        
                            boolean flag=false;
       
                        for(int i=0;i<t_number;i++)
                        {
                            System.out.println("ENTER THE FRIENDS NAME");
                            String f_name=gt.next();
            
                            if(username.contains(f_name))
                            {
                                 t= t_amount/t_number;
                            } 
                             else{
                                System.out.println("enter a valid user name ");
                                restaraunt();
                            }
                        }
                    System.out.println(username);
                    int paid_check=username.indexOf(r_name);
                //    int ind= username.indexOf(friendsname.get(i));
                    System.out.println();
                    ArrayList<Integer> user_temp=split.get(r_name);
                  
                    for(int j=0;j<user_temp.size();j++)
                    {
                        boolean fla=false;
                        if(paid_check!=j)
                        {

                            String ind= username.get(j);
 
                            ArrayList<Integer> temp=split.get(ind);
                            int change=temp.get(paid_check);
                            if(change!=0)
                            {
                               int x=user_temp.get(j);
                               user_temp.set(j,t+x);
                               int tally= user_temp.get(j);
                               if(change>tally)

                               {
                                
                                    change-=tally;
                                    temp.set(j,change);
                                    split.put(username.get(j),temp);
                                    user_temp.set(paid_check,0);
                                    split.put(r_name,user_temp);

                               }
                               else if(change<tally)
                               {
                                    tally-=change;
                                    temp.set(j,0);
                                    split.put(username.get(j),temp);
                                    user_temp.set(paid_check,change);
                                    split.put(r_name,user_temp);

                               }
                               else
                               {
                                user_temp.set(j,0);
                                split.put(r_name,user_temp);
                                temp.set(paid_check,0);
                                split.put(username.get(j),temp);
                                if(j!=paid_check)
                                {
                                    user_temp.set(j,0);
                                }
                               
                               split.put(r_name,user_temp);

                               }
                            }
                               else
                               {
                                int x=user_temp.get(j);
                                user_temp.set(j,t+x);
                                split.put(r_name,user_temp);

                               }
                                
                        }
                        else
                        {
                    
                                
                        }
                    }
                        
                    System.out.println(friends_name+"                "+split);
                    restaraunt();
                    
                     
                    
               
                    }
                    else
                    {
                        System.out.println("invalid");
                        restaraunt();
                    }
                
                } 
                else if(choice==1)
                {
                    main(null);

                }  
    }
}
