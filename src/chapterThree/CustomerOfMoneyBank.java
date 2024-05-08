package chapterThree;

public class CustomerOfMoneyBank {

        private String name;
        private double accountNumber;
        private double id;
        private double accountBalance;
        private int age;

        public CustomerOfMoneyBank(String name, double accountNumber, double id, double accountBalance, int age) {
                this.name = name;
                this.accountNumber = accountNumber;
                this.id = id;
                this.accountBalance = accountBalance;
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public double getAccountNumber() {
                return accountNumber;
        }

        public void setAccountNumber(double accountNumber) {
                this.accountNumber = accountNumber;
        }

        public double getId() {
                return id;
        }

        public void setId(double id) {
                this.id = id;
        }

        public double getAccountBalance() {
                return accountBalance;
        }

        public void setAccountBalance(double accountBalance) {
                this.accountBalance = accountBalance;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }



        public String displayName(String customerName) {
                customerName = name;
                return customerName;
        }

        public int addOneToAge(int customerAge) {
                customerAge = age + 1;
                return customerAge;
        }



}
