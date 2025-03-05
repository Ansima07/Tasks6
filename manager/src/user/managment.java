package user;

public class managment {
        String ManagerName;
        String Email;
        int PhoneNumber;
        public managment(String ManagerName, String Email,int Number  ) {
                this.ManagerName = ManagerName;
                this.Email = Email;
                this.PhoneNumber = Number;
        }
        public void DisplayManagmentInfo(){
                System.out.println("The manager's name is " + ManagerName);
                System.out.println("The manager's email is " + Email);
                System.out.println("The manager's phone number is " + PhoneNumber);
        }
}
