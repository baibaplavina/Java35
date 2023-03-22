package homeworks;

public class HW14PriceAfterDiscount {
    //Discount method
        private float price;
        private float discount;

        public void setDiscount(float discount) {
            this.discount = discount;
        }
        public void setPrice(float price) {
            this.price = price;
        }

        public float getDiscount() {
            return discount;
        }
        public float getPrice() {
            return price;
        }

        public float priceAfterDiscount(float price, float discount) {
            float priceAfterDiscount = price * discount;
           System.out.printf("discount ( %.2f, %.2f ) -> %.2f", price, discount, priceAfterDiscount);
            return (priceAfterDiscount);
        }
    }
