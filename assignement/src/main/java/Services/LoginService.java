package Services;

import Models.Login;
import Repositories.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class LoginService{
    @Autowired
    LoginRepo loginRepo;

    public void loginCheck(String username, String password){
        int position = loginRepo.checkLogin(username,password);
        //
    }

}

