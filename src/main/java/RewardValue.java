
public class RewardValue {
    private double cash;
    private double miles;

    // Constructor for cash only
    public RewardValue(double cash, boolean isCash) {
        if (isCash) {
            this.cash = cash;
            this.miles = cash / 0.0035;  // Convert cash to miles
        } else {
            this.miles = cash;  // Use cash parameter as miles
            this.cash = miles * 0.0035;  // Convert miles to cash
        }
    }

    // Method to get cash value
    public double getCashValue() {
        return this.cash;
    }

    // Method to get miles value
    public double getMilesValue() {
        return this.miles;
    }
}
