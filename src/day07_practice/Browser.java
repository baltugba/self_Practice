package day07_practice;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Chrome";
        String result = "";

        if (browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera" || browserName == "Safari"
                || browserName == "Edge"){

            if(browserName=="Chrome"){
                result = browserName + " browser is selected";
            }else if(browserName=="Firefox"){
                result= browserName + " browser is selected";
            }else if(browserName=="Opera"){
                result=browserName+ " Browser is selected";
            }else if(browserName=="Safari"){
                result=browserName + " browser is selected";
            }else{
                result=browserName + " browser is selected";
            }

        } else {
            result = " Invalid Browser Name";
        }
        System.out.println(result);
    }
}
/*

2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

 */