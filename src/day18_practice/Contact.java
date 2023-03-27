package day18_practice;

public class Contact {
    public String name;
    public long phoneNumber;
    public String email;

    public String toString() {
        return "contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public void setInfo(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;


    }
    public void call(){
        System.out.println("Calling " + name + " now");
    }
    public void sendMessage(){
        System.out.println("Sending message to" + phoneNumber + "now");
    }
    public void sendEmail(){
        System.out.println("Sending email to "+ email+ " now");
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.setInfo("Tugba", 678848,"tt_bal@hotmail.com");
        System.out.println(contact1);
        contact1.call();
        contact1.sendEmail();
        contact1.sendMessage();
    }

}
/*

2. Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"

 */