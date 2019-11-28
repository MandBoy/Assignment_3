package Services;

import Models.Klasse;
import Repositories.KlasseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class KlasseService{
    @Autowired
    KlasseRepo klasseRepo;

    public void createKlasse(Klasse klasse){
        klasseRepo.createClass(klasse);
    }
    public List fetchAllKlasser(){
        return klasseRepo.fetchAllKlasse();
    }
    public Klasse fetchKlasseById(int id){
        return klasseRepo.readKlasseById(id);
    }
    public void updateKlasse(Klasse klasse){
        klasseRepo.updateKlasse(klasse);
    }
    public void deleteKlasse(int id){
        klasseRepo.deleteKlasse(id);
    }



}
