import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Initit init = new Initit();
      
      init.createBus();
      
      while(true){
        System.out.println("Enter your choise\n1.Ticket Book\n2.See dettails\n\n");
        int optionSelected = sc.nextInt();
        if(optionSelected==1){
          

          init.toShowBusDetails();
          init.toShowSeatsOfSpecificBus();
          Bus bussel = init.getSelectedBus();
          init.gettingCustomerDetails();
          init.ticketBook(bussel);
          init.addDetailsToCust();

          bussel.show_tickets();
      }      
    
      if(optionSelected==2){
        init.getCustomerDetails();

      }
    }
  }
    
}