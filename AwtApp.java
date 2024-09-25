import java.awt.*;
class AwtApp extends Frame{

    AwtApp(){
        Label firstName = new Label("First Name");
        firstName.setBounds(20,50,100,20);

        Label age = new Label("Age");
        age.setBounds(20,80,100,20);

        TextField firstname = new TextField();
        firstname.setBounds(120,50,100,20);

        TextField ageTF = new TextField();
        ageTF.setBounds(120,80,100,20);

        Button submit = new Button("submit");
        submit.setBounds(20,160,100,30);

        Button reset = new Button("reset");
        reset.setBounds(120,160,100,30);

        add(firstName);
        add(firstname);
        add(age);
        add(ageTF);
        add(submit);
        add(reset);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    
    }
    public static void main(String[] args) {
        AwtApp a = new AwtApp();
    }
}