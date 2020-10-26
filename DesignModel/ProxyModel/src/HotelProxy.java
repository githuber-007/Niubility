public class HotelProxy implements Eat{

    private Hotel hotel;
    public HotelProxy(){
        hotel=new Hotel();
    }
    @Override
    public void cook() {
        hotel.cook();
    }
}
