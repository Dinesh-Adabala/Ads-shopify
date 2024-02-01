public class OnlineShopTest {
   public static void main (String[]args){
       Paylater paylater = new Paylater();
       DeliveryProcess deliveryProcess = new DeliveryProcess();
       OrderProcess orderProcess = new OrderProcess();
        AccountInfo accountInfo = new AccountInfo();
       AccountLogin accountLogin = new AccountLogin();
       accountInfo.accountNo = "dinesh.adabala417@gmail.com";
       accountInfo.password = "1419@adS";
       accountInfo.reciverOtp = 1234;
       PaymentProcess paymentProcess = new PaymentProcess();
       Boolean login = accountLogin.loginProcess(accountInfo);
       if (login){
           System.out.println(" Account Login Successfully");
           String status = paymentProcess.paymentProcess();
           System.out.println(status);
           if (deliveryProcess.senderOtp == accountInfo.reciverOtp){
               System.out.println("Odere Deliverd Successfully");
       }else {
               System.out.println("Oder Undelivered due to OTP fail  call CustomerCare for more updates");
       }
       }
   }
}
