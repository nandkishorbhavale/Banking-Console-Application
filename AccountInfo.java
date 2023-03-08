import java.util.Scanner;

class Account {                             //tightly encapsulated class.
    private String name, emailId;
    private long acNumber;
    private int amount;

    // Account Holder name
    public void setName(String Uname) {
        this.name = Uname;
    }

    public String getName() {
        return this.name;
    }

    // Email id
    public void setEmailId(String UEmailId) {
        this.emailId = UEmailId;
    }

    public String getEailId() {
        return this.emailId;
    }

    // Account Number
    public void setAccountNumber(Long accountNum) {
        this.acNumber = accountNum;
    }

    public long getAccountNumber() {
        return this.acNumber;
    }

    // Amount deposite
    public void setAmount(int amount) {
        this.amount += amount;
    }
    //Amount Withdraw updations 
    public void setAmountWithdraw(int amount) {
        this.amount -= amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getAmountWithdraw() {
        return this.amount;
    }

}

public class AccountInfo extends Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Account Holder: ");
        String Uname = sc.nextLine();
        System.out.println("Enter the email id of " + Uname + ": ");
        String UEmailId = sc.nextLine();
        System.out.println("Enter the Account number of " + Uname + ": ");
        long accountNum = sc.nextLong();
        System.out.println("Enter the Amount to Deposite: ");
        int amount = sc.nextInt();

        Account AccountHolder = new Account();
        AccountHolder.setName(Uname);
        AccountHolder.setEmailId(UEmailId);
        AccountHolder.setAccountNumber(accountNum);
        AccountHolder.setAmount(amount);

        // displaying all the information of the user
        System.out.println();
        System.out.println("****************************** Account Information *******************************");
        System.out.println();
        System.out.println("Name of the Account Holder is: " + AccountHolder.getName());
        System.out.println("Email Id of the " + Uname + " is: " + AccountHolder.getEailId());
        System.out.println("Account number of " + Uname + " is: " + AccountHolder.getAccountNumber());
        System.out.println("Balance of " + AccountHolder.getAccountNumber() + " is: " + AccountHolder.getAmount());

        // Deposite amount
        boolean flag = true;
        while (flag) {
        System.out.println("What you Want: \n\t 1.Deposite Amount\n\t 2.Withdraw Amount\n");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Enter the Amount You want to Deposit: ");
                amount = sc.nextInt();
                AccountHolder.setAmount(amount);
                System.out.println(
                        "Updated Balance of " + AccountHolder.getAccountNumber() + " is: " + AccountHolder.getAmount());

                break;
            case 2:
                System.out.println("How much Amount you want to withdraw: ");
                amount = sc.nextInt();
                AccountHolder.setAmountWithdraw(amount);
                System.out.println(
                        "Updated Balance of " + AccountHolder.getAccountNumber() + " is: " + AccountHolder.getAmountWithdraw());

            default:
                break;
        }
        }

        sc.close();
    }
}
