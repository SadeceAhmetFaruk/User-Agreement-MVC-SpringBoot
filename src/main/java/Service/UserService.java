package Service;


import Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User ListByName(User user_name);

    //Update  Agreement
    User updateAgreement(User user);

    //List ALL Agreements
    List<User> ListAllAgreement(User user);

    //Number of Agreement
    Long numberOfAgrements();

    //Create a Agreement
    User SaveAgreement(User user);

    //Delete By ID
    User DeleteAgrementByID(Long user_id);

    //Delete By Name
    User DeleteAgrementByName(String user_name);
}
