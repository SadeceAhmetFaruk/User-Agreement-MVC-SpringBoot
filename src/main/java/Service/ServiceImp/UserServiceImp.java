package Service.ServiceImp;

import Model.User;
import Repository.UserRepository;
import Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImp implements UserService {


    @Override
    public User ListByName(User user_name) {
        return null;
    }

    @Override
    public User updateAgreement(User user) {
        return null;
    }

    @Override
    public List<User> ListAllAgreement(User user) {
        return null;
    }

    @Override
    public Long numberOfAgrements() {
        return null;
    }

    @Override
    public User SaveAgreement(User user) {
        return null;
    }

    @Override
    public User DeleteAgrementByID(Long user_id) {
        return null;
    }

    @Override
    public User DeleteAgrementByName(String user_name) {
        return null;
    }
}
