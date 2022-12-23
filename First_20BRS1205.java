class First_20BRS1205{
    private int data=40;
    private void msg(){
        System.out.println("Hello java");
    }
    void data_display(){    //made method displaying the private member data
        System.out.println(data);
    }
    void msg_display(){ //made method calling the private method msg
        msg();
    }
}
