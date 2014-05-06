package ce1002.e9.s102502044;

class E9 {

    static int count;

    public static void main(String[] argv) {
        count = 0;
        try {
            check("ce1234", "minelab");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            check(null    , "minelab");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            check("ce1002", "minelab");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean check(String account , String password) throws Exception {
        count++;
        System.out.println("Test"+count+" : Account = "+account+" , Password = "+password);
        if(account == null || password == null) {
            throw new Exception("Account or password can't not empty");
        }else if(account == "ce1002" && password == "minelab") {
            System.out.println("Succeed");
            return true;
        } else {
            System.out.println("Failed");
            return false;
        }
    }
}
