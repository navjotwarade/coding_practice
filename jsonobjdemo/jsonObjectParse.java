package jsonobjdemo;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.*;

public class jsonObjectParse {

	public static void main(String[] args) throws JSONException{
		String jString = "{\"location\":{\"id\":52,\"accuracy\":0,\"map\":{\"id\":4,\"mapName\":\"apartment 402\",\"mapURL\":\"http://i.imgur.com/aMrYToy.png\"},\"mapXcord\":766,\"mapYcord\":386,\"symbolicID\":\"\"},\"measurement\":{\"bluetoothReadings\":[{\"bluetoothAddress\":\"CC:6D:A0:07:5D:3A\",\"friendlyName\":\"Roku Player\",\"majorDeviceClass\":\"-90\",\"minorDeviceClass\":\"0\",\"rssi\":\"\"},{\"bluetoothAddress\":\"CC:6D:A0:07:5D:3A\",\"friendlyName\":\"Roku Player\",\"majorDeviceClass\":\"-90\",\"minorDeviceClass\":\"0\",\"rssi\":\"\"},{\"bluetoothAddress\":\"CC:6D:A0:07:5D:3A\",\"friendlyName\":\"Roku Player\",\"majorDeviceClass\":\"-90\",\"minorDeviceClass\":\"0\",\"rssi\":\"\"}],\"gsmReadings\":[],\"timestamp\":1479588530873,\"wifiReadings\":[{\"bssid\":\"a4:2b:8c:8a:13:59\",\"isInfrastructure\":false,\"rssi\":-50,\"ssid\":\"Exorcist3\",\"wepEnabled\":true},{\"bssid\":\"c0:56:27:68:aa:c1\",\"isInfrastructure\":false,\"rssi\":-40,\"ssid\":\"butterChicken5\",\"wepEnabled\":true},{\"bssid\":\"ec:aa:a0:4b:20:d0\",\"isInfrastructure\":false,\"rssi\":-68,\"ssid\":\"Brianna-5\",\"wepEnabled\":true},{\"bssid\":\"c0:56:27:68:aa:c0\",\"isInfrastructure\":false,\"rssi\":-31,\"ssid\":\"butterChicken\",\"wepEnabled\":true},{\"bssid\":\"fc:51:a4:47:4f:f2\",\"isInfrastructure\":false,\"rssi\":-64,\"ssid\":\"1812Clinton\",\"wepEnabled\":true},{\"bssid\":\"fc:51:a4:47:4f:f3\",\"isInfrastructure\":false,\"rssi\":-72,\"ssid\":\"1812Clinton\",\"wepEnabled\":true},{\"bssid\":\"c0:ff:d4:a3:ef:ad\",\"isInfrastructure\":false,\"rssi\":-77,\"ssid\":\"SoapyBath - 5G\",\"wepEnabled\":true},{\"bssid\":\"b8:c7:5d:06:d0:2c\",\"isInfrastructure\":false,\"rssi\":-90,\"ssid\":\"rohot-ac\",\"wepEnabled\":true},{\"bssid\":\"ec:aa:a0:4b:20:d1\",\"isInfrastructure\":false,\"rssi\":-68,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"c2:56:27:68:aa:c0\",\"isInfrastructure\":false,\"rssi\":-32,\"ssid\":\"butterChicken-guest\",\"wepEnabled\":false},{\"bssid\":\"0e:51:a4:47:4f:f3\",\"isInfrastructure\":false,\"rssi\":-72,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"60:02:92:cf:9e:f0\",\"isInfrastructure\":false,\"rssi\":-85,\"ssid\":\"HOME-Jeanie-5\",\"wepEnabled\":true},{\"bssid\":\"cc:03:fa:33:04:30\",\"isInfrastructure\":false,\"rssi\":-59,\"ssid\":\"BLESSED\",\"wepEnabled\":true},{\"bssid\":\"60:02:92:cf:9e:f2\",\"isInfrastructure\":false,\"rssi\":-84,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"a4:2b:8c:bd:3b:13\",\"isInfrastructure\":false,\"rssi\":-32,\"ssid\":\"Exorcist\",\"wepEnabled\":true},{\"bssid\":\"38:3b:c8:93:d0:02\",\"isInfrastructure\":false,\"rssi\":-87,\"ssid\":\"Jimmy_wifi\",\"wepEnabled\":true},{\"bssid\":\"0c:54:a5:ce:64:a2\",\"isInfrastructure\":false,\"rssi\":-91,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"ec:aa:a0:4b:20:c8\",\"isInfrastructure\":false,\"rssi\":-62,\"ssid\":\"Brianna\",\"wepEnabled\":true},{\"bssid\":\"9c:34:26:80:e4:de\",\"isInfrastructure\":false,\"rssi\":-88,\"ssid\":\"APT3335\",\"wepEnabled\":true},{\"bssid\":\"0e:51:a4:47:4f:f2\",\"isInfrastructure\":false,\"rssi\":-66,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"ec:aa:a0:4b:20:ca\",\"isInfrastructure\":false,\"rssi\":-75,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"ae:34:26:80:e4:de\",\"isInfrastructure\":false,\"rssi\":-88,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"84:1b:5e:3d:70:77\",\"isInfrastructure\":false,\"rssi\":-68,\"ssid\":\"\",\"wepEnabled\":true},{\"bssid\":\"be:34:26:80:e4:de\",\"isInfrastructure\":false,\"rssi\":-90,\"ssid\":\"\",\"wepEnabled\":true},{\"bssid\":\"0c:54:a5:dc:52:b8\",\"isInfrastructure\":false,\"rssi\":-73,\"ssid\":\"403-Forbidden\",\"wepEnabled\":true},{\"bssid\":\"60:02:92:ce:4f:e8\",\"isInfrastructure\":false,\"rssi\":-78,\"ssid\":\"HOME-Jeanie-2.4\",\"wepEnabled\":true},{\"bssid\":\"0c:54:a5:dc:52:ba\",\"isInfrastructure\":false,\"rssi\":-75,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"60:02:92:ce:4f:ea\",\"isInfrastructure\":false,\"rssi\":-78,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"96:0d:cb:4f:ba:00\",\"isInfrastructure\":false,\"rssi\":-80,\"ssid\":\"xfinitywifi\",\"wepEnabled\":false},{\"bssid\":\"fa:8f:ca:60:59:69\",\"isInfrastructure\":false,\"rssi\":-85,\"ssid\":\"\",\"wepEnabled\":false},{\"bssid\":\"14:cf:e2:f5:fc:b0\",\"isInfrastructure\":false,\"rssi\":-51,\"ssid\":\"HOME-FCB2\",\"wepEnabled\":true},{\"bssid\":\"38:3b:c8:3e:a4:62\",\"isInfrastructure\":false,\"rssi\":-82,\"ssid\":\"ATT86AFB23\",\"wepEnabled\":true},{\"bssid\":\"0c:54:a5:ce:64:a0\",\"isInfrastructure\":false,\"rssi\":-93,\"ssid\":\"PaneerMakhni\",\"wepEnabled\":true},{\"bssid\":\"a0:63:91:52:0d:fb\",\"isInfrastructure\":false,\"rssi\":-87,\"ssid\":\"SoapyBath\",\"wepEnabled\":true}]}}";
		
		List<String> queryList = new ArrayList<String>();
		
		JSONObject jsonObject = new JSONObject(jString);
	    JSONObject getlocation = jsonObject.getJSONObject("location");
	    JSONObject getmap = getlocation.getJSONObject("map");
	    JSONObject getmeasurement = jsonObject.getJSONObject("measurement");
	    
	    Object locationid = getlocation.get("id");
	    if(locationid!=null){
	    Object mapid = getmap.get("id");
	    
	    JSONArray jsonArray = getmeasurement.getJSONArray("bluetoothReadings");
	    for (int i = 0; i < jsonArray.length(); i++) {
	        JSONObject explrObject = jsonArray.getJSONObject(i);
	        
	        String query = "use redpin; Insert into bluetoothfingerprint (mapid, locid, rssi, bluetoothaddress, mapXcord, mapYCord)  values (" + getmap.get("id") +"," + getlocation.get("id") +"," + explrObject.get("majorDeviceClass") +",'" +  explrObject.get("bluetoothAddress").toString() + "'," +  getlocation.get("mapXcord") +"," + getlocation.get("mapYcord") + ");";
	        queryList.add(query);
	        
	    }
	    
	    	    
	    // Execute query code will go in this for loop
	    for (int i = 0; i < queryList.size(); i++) {
			System.out.println(queryList.get(i));
		}
	    
	    }
	}
	
	
	
}