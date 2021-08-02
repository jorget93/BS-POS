package BS_POS.Repositories;

import BS_POS.Model.CustomerCheck;
import BS_POS.Model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCheckRepository extends CrudRepository <CustomerCheck, Long> {
}
