package BS_POS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}