package utils.datautils;

import java.util.Properties;
import java.util.TreeMap;

public class LoadDataProperties {

	private TreeMap<String, String> webDataMapping = new TreeMap<String, String>();

	public TreeMap<String, String> getWebDataMapping(String path) throws Exception {

		try {
			Properties propData = new Properties();
			propData.load(this.getClass().getResourceAsStream(path));
			for (String key : propData.stringPropertyNames())
				webDataMapping.put(key, propData.getProperty(key));

			return webDataMapping;

		} catch (Exception e) {
			throw new Exception("Failed : getWebDataMapping()" + e.getLocalizedMessage());
		}
	}
}