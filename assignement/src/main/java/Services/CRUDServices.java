package Services;

import Repositories.TableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRUDServices{
    @Autowired
    TableRepo tableRepo;

    public void create(){}
    public void read(){}
    public void update(){}
    public void delete(){}
}
