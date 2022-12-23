import java.io.*;
import java.util.Scanner;

class Patient_20BRS1205 implements java.io.Serializable
{
    String PName;
    int PAge;
    String PAddress;
    String PContactNumber;
    String PBloodGroup;
    int PDateOfLastVisit;
    String PHospital;

    Patient_20BRS1205(String PName, int PAge, String PAddress, String PContactNumber, String PBloodGroup, int PDateOfLastVisit, String PHospital)
    {
        this.PName = PName;
        this.PAge = PAge;
        this.PAddress = PAddress;
        this.PContactNumber = PContactNumber;
        this.PBloodGroup = PBloodGroup;
        this.PDateOfLastVisit = PDateOfLastVisit;
        this.PHospital=PHospital;
    }

    public void printPatientInfo()
    {
        if ((10-PDateOfLastVisit) >= 3 && !PHospital.equalsIgnoreCase("BEST"))  //  current month being october = 10
        {
            System.out.println("Name of the patient: " + PName);
            System.out.println("Age of the patient: " + PAge);
            System.out.println("Address of the patient: " + PAddress);
            System.out.println("Contact Number of the patient: " + PContactNumber);
            System.out.println("Blood Group of the patient: " + PBloodGroup);
            System.out.println("Date Of Last Visit (month numeric) of the patient: " + PDateOfLastVisit);
            System.out.println("Hospital Visited of the patient: " + PHospital);
            System.out.println();
        }
    }
}

public class DA2_Q1_20BRS1205 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n;
        String PName,PAddress,PContactNumber,PBloodGroup,PHospital;
        int PAge,PDateOfLastVisit;
        System.out.println("Enter the number of patients in the record: ");
        n = s.nextInt();
        s.nextLine();
        Patient_20BRS1205[] Records= new Patient_20BRS1205[n]; //storing the records in array
        for(int i=0;i<n;i++){
            System.out.println("Enter the patient name: ");
            PName = s.nextLine();
            System.out.println("Enter the age of the patient: ");
            PAge = s.nextInt();
            s.nextLine();
            System.out.println("Enter the patient address: ");
            PAddress = s.nextLine();
            System.out.println("Enter the patient contact number: ");
            PContactNumber =s.nextLine();
            System.out.println("Enter the patient blood group: ");
            PBloodGroup = s.nextLine();
            System.out.println("Enter the patient date of last visit in month numeric: ");
            PDateOfLastVisit = s.nextInt();
            s.nextLine();
            System.out.println("Enter the patient hospital name: ");
            PHospital = s.nextLine();
            Records[i]= new Patient_20BRS1205(PName,PAge,PAddress,PContactNumber,PBloodGroup,PDateOfLastVisit,PHospital);
            System.out.println();

        }
        //serialization
        try{
            //Saving of object in a file
            FileOutputStream fos = new FileOutputStream("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/objectSave.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(int i=0;i<n;i++)
            {
                oos.writeObject(Records[i]);
            }

            fos.close();
            oos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //deserialization
        try{
            FileInputStream fis = new FileInputStream("/Users/samik/Desktop/Programming/Java/Java_Workspace/src/objectSave.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Patient_20BRS1205 obj;
            for(int i=0;i<n;i++)
            {
                obj=(Patient_20BRS1205) ois.readObject();
                obj.printPatientInfo();
            }
            fis.close();
            ois.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
