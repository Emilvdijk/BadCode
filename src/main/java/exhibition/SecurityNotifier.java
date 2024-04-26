package exhibition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class represents a notifier for security. It provides methods for notifying the guard station and the administration about the number of guards needed and the costs of the guards.
 * It also provides a method for checking a list of insurable items for additional needed security.
 */
public class SecurityNotifier {
  // The minimum insurance value for an item to be guarded
  private static final double MINIMUM_INSURANCE_VALUE = 75000;

  // The number of guards needed per painting
  private static final int GUARDS_PER_PAINTING = 2;

  // The cost per day for a guard
  private static final int GUARDS_COST_PER_DAY = 1200;

  /**
   * Notifies the guard station about the number of guards needed.
   *
   * @param guardsNeeded the number of guards needed
   */
  private void notifyGuardStation(int guardsNeeded){
    //notify guard station
  }

  /**
   * Notifies the administration about the costs of the guards.
   *
   * @param guardCosts the costs of the guards
   */
  private void notifyAdministration(double guardCosts){
    //notify administration
  }

  /**
   * Checks a list of insurable items for additional needed security. It removes items from the list that are too low in insurance value to guard.
   * It then calculates the number of guards needed and the costs of the guards, and notifies the guard station and the administration.
   *
   * @param items the list of insurable items
   * @return a map containing the number of guards needed and the costs of the guards
   */
  public Map<String, Number> checkListForAdditionalSecurity(List<Insurable> items){
    //create a copy of the list so we can edit without changing the origional
    List<Insurable> itemsCopy = new ArrayList<>(items);
    //remove items from list that are too low in insurance value to guard
    itemsCopy.removeIf(item -> item.getInsuranceValue() < MINIMUM_INSURANCE_VALUE);

    int guardsNeeded = itemsCopy.size() * GUARDS_PER_PAINTING;
    notifyGuardStation(guardsNeeded);

    double guardCosts = guardsNeeded * GUARDS_COST_PER_DAY;
    notifyAdministration(guardCosts);

    return Map.of("guardsNeeded", guardsNeeded, "guardCosts", guardCosts);
  }

}