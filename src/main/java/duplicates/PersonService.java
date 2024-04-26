package duplicates;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing persons.
 */
public class PersonService {
  private final List<Person> persons = new ArrayList<>();

  /**
   * Adds a new person to the list of persons. If the person already exists in the list, it will not be added again.
   *
   * @param person The person to be added to the list.
   */
  public void addPerson(Person person){
    // Flag to check if the person already exists in the list
    boolean exists = false;

    // Iterate over the list of persons
    for (Person p : persons) {
      // If the person is found in the list, set the flag to true and break the loop
      if (p.equals(person)) {
        exists = true;
        break;
      }
    }

    // If the person does not exist in the list, add it
    if (!exists) {
      persons.add(person);
    }
  }

  /**
   * Returns the number of unique persons.
   * @return the number of unique persons
   */
  public int size(){
    return persons.size();
  }

}