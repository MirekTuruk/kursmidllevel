//package midlelevel;
//
//import java.util.Observable;
//import java.util.Observer;
//
//public class MeteoCenter {
//
//    public static void main(String[] args) {
//        MeteoDispatcher accidentDispatcher = new MeteoDispatcher();
//        Observer ambulance = new Station();
//        Observer statistician = new Station();
//        Observer agentAbw = new AgentAbw();
//
//        accidentDispatcher.addObserver(ambulance);
//        accidentDispatcher.addObserver(statistician);
//        accidentDispatcher.addObserver(agentAbw);
//
//        System.out.println("Meteo warning (three observers):");
//        accidentDispatcher.setAccidentType("Intersection accident.");
//        accidentDispatcher.notifyObservers();
//        System.out.println("\nSecond accident (three observers):");
//        accidentDispatcher.setAccidentType("Woman hit by a car.");
//        accidentDispatcher.notifyObservers();
//
//        ((Statistician) statistician).printAllStats();
//
//        accidentDispatcher.deleteObserver(statistician);
//        accidentDispatcher.deleteObserver(agentAbw);
//        accidentDispatcher.setAccidentType("Truck hit a tree.");
//        System.out.println("\nThird accident (statistician and agentAbw removed):");
//        accidentDispatcher.notifyObservers();
//    }
//
//    private static class MeteoDispatcher {
//    }
//
//    private static class Meteo implements Observer {
//        public void update(Observable o, Object arg) {
//
//        }
//    }
//
//    private static class Station implements Observer {
//    }
//}
//}
