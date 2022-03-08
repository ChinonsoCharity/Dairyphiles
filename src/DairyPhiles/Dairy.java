//package DairyPhiles;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String ownerName;
    private ArrayList<Entry> entries = new ArrayList<>();
    private String password;

    public Dairy (String newName,String newPassword){

    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<Entry> entries) {
        this.entries = entries;
    }



    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
