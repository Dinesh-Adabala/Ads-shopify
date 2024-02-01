public class AccountLogin {
    public boolean loginProcess(AccountInfo accountInfo){
        String localAccountNo = "dinesh.adabala417@gmail.com";
        String localPassword = "1419@adS";
        if (localAccountNo.equals(accountInfo.accountNo)  && localPassword.equals(accountInfo.password)){
            return true;
        }else {
            return false;
        }
    }
}
