package Services;

import Models.Admin;
import Repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService{
    @Autowired
    AdminRepo adminRepo;

    public List<Admin> fetchAllAdmins(){
        return adminRepo.fetchAllAdmin();
    }
    public void deleteById(int Id){
        adminRepo.deleteAdmin(Id);
    }
    public void createAdmin(Admin admin){
        adminRepo.createAdmin(admin);
    }
    public void updateAdmin(Admin admin){
        adminRepo.updateAdmin(admin);
    }
    public Admin readById(int id){
        return adminRepo.readAdminById(id);
    }
}
