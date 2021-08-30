package za.ac.cput.entity.product;

public class Item {
    private String itemId, itemName, itemDetails, condition;
    private double itemPrice;
    private boolean isSold;

    private Item(){}

    private Item(Builder builder){
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.itemDetails = builder.itemDetails;
        this.condition = builder.condition;
        this.itemPrice = builder.itemPrice;
        this.isSold = builder.isSold;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public String getCondition() {
        return condition;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public boolean isSold() {
        return isSold;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemDetails='" + itemDetails + '\'' +
                ", condition='" + condition + '\'' +
                ", itemPrice=" + itemPrice +
                ", isSold=" + isSold +
                '}';
    }

    public static class Builder{
        private String itemId, itemName, itemDetails, condition;
        private double itemPrice;
        private boolean isSold;

        public Builder itemId(String itemId){
            this.itemId = itemId;
            return this;
        }

        public Builder itemName(String itemName){
            this.itemName = itemName;
            return this;
        }

        public Builder itemDetails(String itemDetails){
            this.itemDetails = itemDetails;
            return this;
        }

        public Builder condition(String condition){
            this.condition = condition;
            return this;
        }

        public Builder itemPrice(double itemPrice){
            this.itemPrice = itemPrice;
            return this;
        }

        public Builder isSold(boolean isSold){
            this.isSold = isSold;
            return this;
        }

        public Builder copy(Item item){
            this.itemId = item.itemId;
            this.itemName = item.itemName;
            this.itemDetails = item.itemDetails;
            this.condition = item.condition;
            this.itemPrice = item.itemPrice;
            this.isSold = item.isSold;
            return this;
        }

        public Item build(){
            return new Item(this);
        }
    }
}
