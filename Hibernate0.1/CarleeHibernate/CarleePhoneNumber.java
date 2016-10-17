/**
 * Created by Carlee on 2016-10-14.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "phone_number")

public class CarleePhoneNumber {

        @Id
        @GeneratedValue
        private Integer id;
        private String phone;
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
}