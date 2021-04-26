public class NonFiction extends Book {
    NonFiction(){
        super();
        setPrice();
    }
    NonFiction(String str){
        super(str);
        setPrice();
    }
    @Override

    public void setPrice(){
        super.price = 31.49;
    }
}