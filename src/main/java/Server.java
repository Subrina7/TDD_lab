public class Server {
    //    public boolean canServeGuest(Guest guest){
//    }
    public boolean checkGuestAge(Guest guest) {
        if(guest.getAge() >= 18) {
            return true;
        }
        else {
            return false;}
    }
}
