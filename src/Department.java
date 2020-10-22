import java.util.ArrayList;

public class Department <T,E> {
    private String name;
    private int numberOfInstruments = 0;
    private ArrayList<T> instrumentsList = new ArrayList<>();
    E uniqueID;

    public Department(E uniqueID) {
        this.uniqueID = uniqueID;
    }

    public E getUniqueID() {
        return uniqueID;
    }
    public void setUniqueID(E uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Department(String name) {
        this.name = name;
    }
    public boolean addInstrument(T uniqueID, E id) {
        if (instrumentsList.contains(uniqueID)) {
            System.out.println(((Instrument) uniqueID).getName() + " is already on this department.");
            return false;
        } else {
            instrumentsList.add(uniqueID);
            System.out.println(((Instrument) uniqueID).getName() + " added to " + this.name);
            return true;
        }
    }
    public int numberOfInstruments(){
        return this.instrumentsList.size();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

}