public class ConferenceRegistration_20BRS1205 {
    int PaperID;
    String AuthorName;
    double RegistrationAmount;
    String RegistrationDate;
    boolean checkXYZ;
    public ConferenceRegistration_20BRS1205(int PaperID, String AuthorName,double RegistrationAmount,String RegistrationDate,boolean checkXYZ){
        this.PaperID= PaperID;
        this.AuthorName=AuthorName;
        this.RegistrationAmount = RegistrationAmount;
        this.RegistrationDate= RegistrationDate;
        this.checkXYZ = checkXYZ;
    }


    public void display(){
        System.out.println("The ID is "+PaperID);
        System.out.println("The name is: "+AuthorName);
        System.out.println("The registration Amount is: "+RegistrationAmount);
        System.out.println("The registration date is: "+RegistrationDate);
        System.out.println("");
    }

    public void XYZ_member_check(){
        if(checkXYZ){
            RegistrationAmount = RegistrationAmount- RegistrationAmount*0.5;
        }
        else{
            RegistrationAmount = RegistrationAmount;
        }
    }

    public static void main(String[] args){
        ConferenceRegistration_20BRS1205 xyz1 = new ConferenceRegistration_20BRS1205(1,"Sam",7000,"16-08-2022",false);
        ConferenceRegistration_20BRS1205 xyz2 = new ConferenceRegistration_20BRS1205(2,"Ram",7000,"16-08-2022",true);
        ConferenceRegistration_20BRS1205 xyz3 = new ConferenceRegistration_20BRS1205(3,"Tom",7000,"16-08-2022",false);
        xyz1.XYZ_member_check();
        xyz2.XYZ_member_check();
        xyz3.XYZ_member_check();
        xyz1.display();
        xyz2.display();
        xyz3.display();
    }
}
