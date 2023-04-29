
import java.util.Scanner;

public class Projectt {
    private Node head;
      private  class Node{
        private String name,day,phone_mumber,address;
        private int ID;
        private double salary, hours;
        private Node next;
        public Node(int ID,String name,String day,String phone_mumber,String address,double hours,double salary){
            this.ID=ID;
            this.name=name;
            this.day=day;
            this.phone_mumber=phone_mumber;
            this.address=address;
            this.hours=hours;
            this.salary=salary;
            this.next=null;
        }
    }
    
   public void insertEmployee(int ID,String name,String day,String phone_mumber,String address,double hours,double salary){
       if(!checkRecord(ID)){
           System.out.println("***************");
       Node new_node=new Node(ID,name,day,phone_mumber,address,hours,salary);
        if(head==null){
            head=new_node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
       }else{
           System.out.println("this employee is already exist ");
       }
    }
   boolean checkRecord(int ID){
       Node temp=head;
       if(head==null)
           return false;
       
        while(temp!=null&&head!=null){
            if(temp.ID==ID)
                return true;
            temp=temp.next;
        }
       return false;
   }
   
   public void search(int ID){
        Node temp=head;
        while (temp!= null) {
              if(temp.ID == ID){
                System.out.println("Employee Info :\n- Employee ID:"+ID+"\n- Employee Name:"+temp.name+"\n- Employee First day of work: "+
                        temp.day+"\n- Employee Phone number: "+temp.phone_mumber+"\n- Employee Address :"+temp.address+"\n- Employee Work hours: "+temp.hours
                +"\n- Employee Salary: "+temp.salary);
               return;
            }else{
                temp=temp.next;
            }
        }
        System.out.println("this employee is not registered" );
   }
     public  int deleteEmployee(int ID){
         
         Node temp=head,prev=null;
         if (temp != null && temp.ID == ID) {
            head = temp.next; 
            return 1;
        }
         while (temp != null && temp.ID != ID) {
            prev = temp;
            temp = temp.next;
        }
        if(temp==null){
            return 0;
        }
        prev.next=temp.next;
        return 1;
   }
     public void showRecord(){
        Node temp=head;
        while(temp!=null){
              System.out.println("Employee Info :\n- Employee ID:"+temp.ID+"\n- Employee Name:"+temp.name+"\n- Employee First day of work: "+
                        temp.day+"\n- Employee Phone number: "+temp.phone_mumber+"\n- Employee Address :"+temp.address+"\n- Employee Work hours: "+temp.hours
                +"\n- Employee Salary: "+temp.salary);
            temp=temp.next;
        }
    
     }
     public void updateSalary(){
        
         if(head==null){
             return;
         }
          
         Node temp=head;
        while(temp!=null){
            if(temp.hours>32){
                temp.salary+=(temp.salary*.02);
            
            }
            temp=temp.next;
        }
         System.out.println("Record updated");
         
     }
     public void updateEmployee(int ID){
         if(!checkRecord(ID)){
             System.out.println("can't found Employee");
         }else{
             Scanner input=new Scanner(System.in);
             String name,day,phone_mumber,address;
             double hours,salary;
                        System.out.print("Enter new Name for the employee :");  
                        name=input.nextLine();
                        System.out.print("Enter the new First day of work:");  
                        day=input.nextLine();
                        System.out.print("Enter the new Phone number:");  
                        phone_mumber=input.nextLine();
                        System.out.print("Enter the new Address:");  
                        address=input.nextLine();
                        System.out.print("Enter the new Work hours:");  
                        hours=input.nextDouble();
                        System.out.print("Enter the new Salary:");  
                        salary=input.nextDouble();
              Node temp=head;
                while(temp!=null){
                    if(temp.ID==ID){
                          temp.name=name;
                          temp.salary=salary;
                          temp.address=address;
                          temp.day=day;
                          temp.hours=hours;
                          temp.phone_mumber=phone_mumber;
                    }
                    temp=temp.next;
                }
         }
         
     }
      public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int choose,ID;
            String name,day,phone_mumber,address;
            double hours,salary;
            boolean repeat=true;
            Projectt employees=new Projectt();
           
           while(repeat){
                System.out.println("1- Insert employee record\n" +
                               "2- Delete employee record\n" +
                               "3- Update employee record\n" +
                               "4- Show employee\n" +
                               "5- Search employee\n" +
                               "6- Update salary\n"+
                               "7- Exit\n");
                System.out.println("Select your choice ");
                choose=input.nextInt();
                switch(choose){
                    case 1:
                        System.out.print("Enter employee ID:");  
                        ID=input.nextInt();
                        input.nextLine();
                        System.out.print("Enter employee Name:");  
                        name=input.nextLine();
                        System.out.print("Enter First day of work:");  
                        day=input.nextLine();
                        System.out.print("Enter Phone number:");  
                        phone_mumber=input.nextLine();
                        System.out.print("Enter Address:");  
                        address=input.nextLine();
                        System.out.print("Enter Work hours:");  
                        hours=input.nextDouble();
                        System.out.print("Enter Salary:");  
                        salary=input.nextDouble();
                        employees.insertEmployee(ID, name, day, phone_mumber, address, hours, salary);
                      break;
                    case 2: 
                        System.out.println("Enter employee ID to delete it :");
                        ID=input.nextInt();
                        if(employees.deleteEmployee(ID)==1){
                            System.out.println("Employee deleted successfully  ");
                            
                        }else{
                            System.out.println("this employee is not registered");
                        }
                        break;
                    case 3:
                         System.out.println("Enter employee ID to Update it :");
                         ID=input.nextInt();
                         employees.updateEmployee(ID);
                        break;
                    case 4:
                        employees.showRecord();
                        break;
                    case 5:
                        System.out.println("what is the employee ID ? :");
                        ID=input.nextInt();
                        employees.search(ID);
                        break;
                    case 6:
                        employees.updateSalary();
                        break;
                    case 7:
                        repeat=false;
                        break;
                    default:
                        System.out.println("Bro?! ,choose between 1-7");
                        
                        
                }
           }
            
      
    }
    
}
