public class Droid {

  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task) {
    batteryLevel = batteryLevel - 10;
    System.out.println(name + " is performing task: " + task);
  }

  public void energyReport() {
    System.out.println(name + "'s battery level is: " + batteryLevel);
  }

  public void energyTransfer(Droid otherDroid) {
    int transferAmount = Math.min(batteryLevel, otherDroid.batteryLevel);
    batteryLevel -= transferAmount;
    otherDroid.batteryLevel += transferAmount;
    System.out.println(name + " transferred " + transferAmount + " units of battery level to " + otherDroid.name);
  }

  public String toString() {
    return "Hello, I am the droid: " + name;
  }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.performTask("coding");
    codey.energyReport();

    Droid astro = new Droid("Astro");
    astro.energyReport();
    astro.energyTransfer(codey);
    codey.energyReport();
    astro.energyReport();
  }
}
