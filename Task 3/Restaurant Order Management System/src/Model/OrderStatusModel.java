package model;

public enum OrderStatusModel {
    PENDING,
    PREPARING,
    COMPLETED,
    CANCELLED;


    public String getDescription() {
        switch (this) {
            case PENDING:
                return "The order is pending and has not been processed yet.";
            case PREPARING:
                return "The order is currently being prepared.";
            case COMPLETED:
                return "The order has been completed and delivered.";
            case CANCELLED:
                return "The order has been cancelled.";
            default:
                return "Unknown status.";
        }
    }
}
