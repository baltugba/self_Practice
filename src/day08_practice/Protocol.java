package day08_practice;

public class Protocol {
    public static void main(String[] args) {
        // ternary

        int num= 200;

        String result= (num==200)?"OK":(num==201)?"Created":(num==202)?"Accepted"
                :(num==301)?"Moved Permanently":(num==303)?"See Other":(num==304)?"Not Modified"
                :(num==307)?"Temporary Redirect":(num==400)?"Bad Request":(num==401)?"Unauthorized"
                :(num==403)?"Forbidden":(num==404)?"Not Found":(num==410)?"Gone":(num==500)?"Internal Server Error"
                :"Service Unavailable";
        System.out.println(result);

        System.out.println(".........................");
        //Switch

        int n=200;

        switch (n){
            case 200:
                System.out.println("ok");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See Other");
                break;
            case 304:
                System.out.println(" Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println(" Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 503:
                System.out.println("Service Unavailable");
                break;

        }










        /*
     HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
         */
    }
}
