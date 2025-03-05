import user.managment;
import users.managment2;

public class Main {
        public static void main(String[] args) {
            managment manager1= new managment("Marie Muray", "murayansima@mail.com", 726974611 );
            manager1.DisplayManagmentInfo();
            managment2 manager2= new managment2("Ampire Muray", "murayampire@gmail.com", 726335511);
            manager2.DisplayManagmentInfo();
        }
}