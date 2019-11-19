package Services;

import Repositories.BackEnd.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService{
    @Autowired
    LoginRepo loginRepo;

    public boolean checkLogin(String username, String password){
        return loginRepo.checkLogin(username, password);
    }

}
