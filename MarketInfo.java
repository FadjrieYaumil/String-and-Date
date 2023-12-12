import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MarketInfo {
    public void displayInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");

        Date currentDate = new Date();
        System.out.println("NAMA SUPERMARKET/MINI MARKET");
        System.out.println("Tanggal : " + dateFormat.format(currentDate));
        System.out.println("Waktu   : " + timeFormat.format(currentDate));
        System.out.println("======================================");
    }
}
