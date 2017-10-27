package banking;

/**
 * @author BJTU16301130
 * @version 201270922
 */
public class CheckingAccount extends Account{
        private SavingsAccount protectedBy = null;

        public CheckingAccount(double balance){
            super(balance);
        }
        public CheckingAccount(double balance, SavingsAccount protect){
            super(balance);
            protectedBy = protect;
        }

        public boolean withdraw(double amt){
            if(balance >= amt){
                balance -= amt;
                return true;
            }
            else if(protectedBy != null && balance + protectedBy.balance >= amt){
                protectedBy.balance -= amt - balance;
                balance = 0;
                return true;
            }
            else return false;
        }
    }

