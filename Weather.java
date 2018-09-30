package homePage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Weather {

    public static void main(String[] args) throws Exception {
       
    {
    	String url = "http://www.accuweather.com/en/gb/london/ec4a-2/weather-forecast/328328";
        Document document = Jsoup.connect(url).get();

        String weather = document.select("div.panel-list.cityforecast span[class=large-temp]").first().text();
        System.out.println("Weather: " + weather);
    
    }

}
}