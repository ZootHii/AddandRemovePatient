
public class HIS {
    private static final int MAX_SIZE = 10;
    private static Patient[] myPatients = new Patient[MAX_SIZE];;
    private static int index = 0;
    
    
    
    public static int indexOf(int id){
        
        int obin = -1;
        
        for (int i=0; i<index; i++){
            if (myPatients[i].getId() == id){
                obin = i;
            }
        }
        return obin;
    }
    
    public static int indexOf(Patient ptn){
        
        int obin = -1;
        
        for (int i=0; i<index; i++){
            if (myPatients[i].equals(ptn)){
                obin = i;
            }
        }
        return obin;
    }
    
    public static boolean addPatient(Patient ptn){
        
        if (index <= MAX_SIZE && indexOf(ptn) == -1){
            
            myPatients[index++] = ptn;
            return true;
        }    
        else{
            return false;
        }
    }
    
    public static boolean removePatient(int id){
        
        int obin;
        
        if (index < MAX_SIZE){
            if (indexOf(id) != -1){
                obin = indexOf(id);
                myPatients[obin] = myPatients[index -1];
                myPatients[index-1] = null;
                index--;
                return true;
            }
            else{
                return false;
            }    
        }
        else{
            return false;
        }
    }
    
    public static Patient[] getAll(){
        return myPatients;
    }

    @Override
    public  String toString() {
        
        String s= "";
        
        for(int i=0;i<index;i++){
            
            s += myPatients[i].toString();
            
        }
    
        return s;
    }
}
