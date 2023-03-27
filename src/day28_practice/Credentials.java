package day28_practice;

public class Credentials {
    private String userName,password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){
            System.err.println("Password\""+ password+"\" is not a strong password");
            System.exit(1);

        }
        this.password = password;
    }
    public boolean isStrongPassword(String password){
        boolean r1 = password.length() >8 && !password.contains(" ");
        boolean r2 = false; // has upper case letter
        boolean r3 = false; // has lower case letter
        boolean r4 = false; // has digit
        boolean r5 = false; // has special Character
        for (char each:password.toCharArray()){
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r4 = true;
            }else{
                r5 = true;
            }
        }
         return r1&r2&r3&r4&r5;
    }
}
/*
ate a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()
 */