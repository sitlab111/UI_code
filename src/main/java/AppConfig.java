import java.util.Map;
import Config.Confiuration;

public class AppConfig {

	public static void main(String[] args) throws Exception {
		Confiuration con = new Confiuration();
		con.setPath("service.yaml");
		Map<String,Object> conf = null;
		conf = con.getConfig("interactions");
		System.out.println("New Map: "+conf);
	}
}
