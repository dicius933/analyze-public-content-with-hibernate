import model.Country;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


/**
 * Created by yeshua on 1/19/2018.
 */
public class Application {



    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        prompter.run();
    }

}
