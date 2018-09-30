package homePage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import net.sourceforge.jFuzzyLogic.FIS;


/**
 * Test parsing an FCL file
 
 */
public class Fuzzy_Logic {
    public static void main(String[] args) throws Exception {
    
    	Fuzzy_Logic.fuzzy();
    	Fuzzy_Logic.weather();
    }
       
    	public static void fuzzy()throws Exception
    	{
    	// Load from 'FCL' file
        String fileName = "tipper.fcl";
        FIS fis = FIS.load(fileName,true);

        // Error while loading?
        if( fis == null ) { 
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }

        // Show 
       
        		
       
        String url = "http://www.accuweather.com/en/gb/london/ec4a-2/weather-forecast/328328";
        Document document = Jsoup.connect(url).get();

        String weather = document.select("div.panel-list.cityforecast span[class=large-temp]").first().text();
        System.out.println("Outside Weather: " + weather);
        String str = weather.replaceAll("\\D+","");
        int y = Integer.parseInt(str);
        // Set inputs
        fis.setVariable("temperature", y);
        
        
        // Evaluate
        fis.evaluate();

        // Show output variable's chart
        

        // Print ruleSet
        
        System.out.println("Room Temperature is set to: " + fis.getVariable("room").getValue()); 
        
        
        
    }
    
    	public static String weather()throws Exception {
    		    String url = "http://www.accuweather.com/en/gb/london/ec4a-2/weather-forecast/328328";
    	        Document document = Jsoup.connect(url).get();

    	        String weather = document.select("div.panel-list.cityforecast span[class=large-temp]").first().text();
    	        
    	        return weather;
    		
    	}
}

