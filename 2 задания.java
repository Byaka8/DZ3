package Tasks;

import java.util.Date;

public class Customer {
    private static int idStart = 0;

    private final int id = ++idStart;
    private String name;
    private String surname;
    private String secondName;
    private String address;
    private long creditCardNumber;
    private String accountNumber;

    public static class buyer {
      
        private final String name;
        private final String surname;
        private final long creditCardNumber;
        private final String accountNumber;
        
        private String secondName = "";
        private String address = "";

        public buyer(String name, String surname, long creditCardNumber, String accountNumber) {
            this.name = name;
            this.surname = surname;
            this.creditCardNumber = creditCardNumber;
            this.accountNumber = accountNumber;
        }

        public buyer secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public buyer address(String address) {
            this.address = address;
            return this;
        }

        public Customer  buyer() {
            return new Customer(this);
        }
    }

    public Customer(buyer builder) {
        this.name = buyer.name;
        this.surname = buyer.surname;
        this.creditCardNumber = buyer.creditCardNumber;
        this.accountNumber = buyer.accountNumber;
	this.secondName = buyer.secondName;
        this.address = buyer.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", accountNumber=" + accountNumber +
                '}';
    }
}

package Tasks;

public class CustomerRunner {
    public static void run() {
        Customer[] customers = new Customer[5];
        long[] interval = {42538484, 72538484};

        customers[0] = new Customer. buyer("Няма1", "Няма1", 4484L, "PAA"). buyer();
        customers[1] = new Customer. buyer("Няма2", "Няма2", 53384L, "P1A"). buyer();
        customers[2] = new Customer. buyerr("Няма3", "Няма3", 184L, "AAA"). buyer();
        customers[3] = new Customer. buyer("Няма4", "Няма4", 72684L, "PH"). buyer();
        customers[4] = new Customer. buyer("Няма5", "Няма5", 1284L, "F5A"). buyer();

        for(Customer elem : customers) {
            System.out.println(elem.toString());
            System.out.println("------------------------");
        }

        usersAlphabet(customers);
        cardInInterval(interval, customers);
    }

    public static void usersAlphabet(Customer[] customers) {
        for(int i = 0; i < customers.length - 1; i++) {
            for(int j = 0; j < customers.length - i - 1; j++) {
                if (customers[j].getName().compareTo(customers[j + 1].getName()) > 0){
                    Customer swap = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = swap;
                }
            }
        }
        System.out.println(">>> The list of customers sorted by name:");
        for(Customer elem : customers) {
            System.out.println(elem.getName() + " " + elem.getSurname());
        }
    }

    public static void cardInInterval(long[] interval, Customer[] customers) {
        System.out.println(">>> List buyers who credit card number is in a predetermined range:");
        for(Customer elem : customers) {
            if (elem.getCreditCardNumber() >= interval[0] && elem.getCreditCardNumber() <= interval[1]) {
                System.out.println(elem.getName() + " " + elem.getSurname());
            }
        }
    }
}
Raw  Tasks_Main.java
package Tasks;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        //
       
        StudentRunner.run();
      
        CustomerRunner.run();
    }
}