interface Bank_int_20BRS1205 {
    public  void checkPrivilegeCustomer(int a,int y);
    class Bank1_20BRS1205_Q5 extends MainBank_20BRS1205_Q5{
        public void checkPrivilegeCustomer(int a,int y){
            if(a>=100000 && y>5){
                System.out.println("You are a privileged customer in our bank 1.");
            }
            else{
                System.out.println("You are not a privileged customer in our bank 1.");
            }
        }
    }
    class Bank2_20BRS1205_Q5 extends MainBank_20BRS1205_Q5{
        public void checkPrivilegeCustomer(int a,int y){
            if(a>=200000 && y>4){
                System.out.println("You are a privileged customer in our bank 2.");
            }
            else{
                System.out.println("You are not a privileged customer in our bank 2.");
            }
        }
    }
}
