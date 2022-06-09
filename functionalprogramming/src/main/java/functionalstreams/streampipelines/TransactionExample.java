package functionalstreams.streampipelines;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Let's say you are developing a banking system. There are two classes in this system:
 * <p>
 * Transaction with the fields uuid (String), the State enum (CANCELED, FINISHED, PROCESSING), sum (Long)
 * Account with the fields number (String), balance (Long), and transactions (List<Transaction>)
 * Both classes have getters for all fields with the corresponding names (getState(), getSum(), getTransactions() and so on).
 * <p>
 * Using Stream API, implement a method that calculates the total sum of canceled transactions for all non-empty accounts (balance > 0). Perhaps, flatMap method can help you to implement it.
 * <p>
 * Important. Use the given template for your method. Pay attention to type of an argument and the returned value. Please, use only Stream API without loops.
 * <p>
 * Examples: there are 2 accounts (in JSON notation) below. The result is 10 000.
 * <p>
 * [
 * {
 * "number": "1001",
 * "balance": 0,
 * "transactions": [
 * {
 * "uuid": "774cedda-9cde-4f53-8bc2-5b4d4859772a",
 * "state": "CANCELED",
 * "sum": 1000,
 * }
 * ]
 * },
 * {
 * "number": "1002",
 * "balance": 8000,
 * "transactions": [
 * {
 * "uuid": "337868a7-f469-43c0-9042-3422ce37ee26a",
 * "state": "FINISHED",
 * "sum": 8000,
 * },
 * {
 * "uuid": "f8047f86-89e7-4226-8b75-74c55a4d7e31",
 * "state": "CANCELED",
 * "sum": 10000,
 * }
 * ]
 * }
 * ]
 */

public class TransactionExample {

    /**
     * Calculates the general sum of canceled transactions for all non empty accounts in the list
     */
    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        // write your code here
        return accounts.stream()
                .filter(a -> a.getBalance() > 0)
                .flatMap(a -> a.getTransactions().stream())
                .filter(a -> a.getState() == State.CANCELED)
                .mapToLong(Transaction::getSum)
                .sum();
    }

    // Don't change the code below
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfAccounts = Integer.parseInt(scanner.nextLine());
        List<Account> accounts = new ArrayList<>();

        for (int i = 0; i < numberOfAccounts; i++) {
            String[] accDesc = scanner.nextLine().split(" ");
            String number = accDesc[0];
            Long balance = Long.parseLong(accDesc[1]);

            int numberOfTransByAccount = Integer.parseInt(scanner.nextLine());
            List<Transaction> trans = new ArrayList<>();

            for (int j = 0; j < numberOfTransByAccount; j++) {
                String[] transDesc = scanner.nextLine().split(" ");
                String uuid = transDesc[0];
                State state = convertStringToState(transDesc[1]);
                Long sum = Long.parseLong(transDesc[2]);
                trans.add(new Transaction(uuid, state, sum));
            }

            accounts.add(new Account(number, balance, trans));
        }

        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
    }

    private static State convertStringToState(String state) {
        switch (state) {
            case "c":
                return State.CANCELED;
            case "f":
                return State.FINISHED;
            case "p":
                return State.PROCESSING;
            default:
                throw new IllegalArgumentException("Unknown account state");
        }
    }

    enum State {
        FINISHED, CANCELED, PROCESSING
    }

    static class Transaction {

        private final String uuid;
        private final State state;
        private final Long sum;

        public Transaction(String uuid, State state, Long sum) {
            this.uuid = uuid;
            this.state = state;
            this.sum = sum;
        }

        public State getState() {
            return state;
        }

        public Long getSum() {
            return sum;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "uuid='" + uuid + '\'' +
                    ", state=" + state +
                    ", sum=" + sum +
                    '}';
        }
    }

    static class Account {

        private final String number;
        private final Long balance;
        private final List<Transaction> transactions;

        public Account(String number, Long balance, List<Transaction> transactions) {
            this.number = number;
            this.balance = balance;
            this.transactions = transactions;
        }

        public Long getBalance() {
            return balance;
        }

        public List<Transaction> getTransactions() {
            return transactions;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "number='" + number + '\'' +
                    ", balance=" + balance +
                    ", transactions=" + transactions +
                    '}';
        }
    }

}
