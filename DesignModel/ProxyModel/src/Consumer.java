public class Consumer implements Eat {
    public Consumer() {
    }

    @Override
    public void cook() {
        HotelProxy hotelProxy = new HotelProxy();
        hotelProxy.cook();
    }
}
