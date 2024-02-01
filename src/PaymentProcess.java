public class PaymentProcess {
    //public static void main(String[] args) {
        Paylater paylater = new Paylater();
        OrderProcess orderProcess = new OrderProcess();
        // AccountInfo accountInfo = new AccountInfo();
        AccountLogin accountLogin = new AccountLogin();
        // Boolean login = accountLogin.loginProcess(accountInfo);
        public String paymentProcess() {
            System.out.println("PayLater Limit :"+paylater.payLaterLimit);
            if (paylater.payLaterLimit >= orderProcess.totalPrice) {
                paylater.payLaterLimit = paylater.payLaterLimit - orderProcess.totalPrice;

                System.out.println("Total Amount :"+" " +orderProcess.totalPrice);
                System.out.println("Updated Paylater Limit  :" + " "+ paylater.payLaterLimit);
            }
            return "Payment Success";

        }
    }
