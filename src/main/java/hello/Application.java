package hello;

import org.hibernate.Session;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {

    Person person = new Person();
    person.setId(1);
    person.setName("Concretepage");
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(person);
    session.getTransaction().commit();
    session.close();
    System.err.println("Done");

  }

}