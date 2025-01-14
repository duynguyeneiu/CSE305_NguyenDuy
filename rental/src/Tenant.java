import java.util.ArrayList;
import java.util.List;

public class Tenant {
    private User user;
    private List<RentalContract> listOfContracts;


    public Tenant(User user) {
        this.user = user;
        this.listOfContracts = new ArrayList<>();
    }

   
    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
        System.out.println("Rental contract requested successfully!");
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        listOfContracts.remove(contract);
        System.out.println("Rental contract termination requested!");
    }
}


