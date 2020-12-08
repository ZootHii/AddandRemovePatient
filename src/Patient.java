
public class Patient {
    private int id;
    private static int last_id = 100;
    private String name;
    private String disease;

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
        id = last_id++;
    }
    
    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", disease=" + disease + '}'+"\n";
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }
    
    public boolean equals(Patient ptn){
        boolean equal = false;
        if (ptn.getName().equals(this.name)){
            equal = true;
        }
        return equal;
    }
}
