package _02_02;

public class Ticket {
  
  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  public String getDestination() {
    return destination;
  }

  public void setDestination(String updatedDestination) {
    destination = updatedDestination;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double updatedPrice) {
    price = updatedPrice;
  }

  public boolean getIsReturn() {
    return isReturn;
  }

  public void setIsReturn(boolean updatedIsReturn) {
    isReturn = updatedIsReturn;
  }
}
