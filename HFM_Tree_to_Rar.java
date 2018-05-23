package hfm_rar;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class HFM_Tree_to_Rar {

	public static void main(String[] args) {
		HFM_Tree_to_Rar hfm = new HFM_Tree_to_Rar();
		String path = "src/hfm_rar/You Have Only One Life.txt";
	}
	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	public void Read(String path){
		int i = 0;
		try {
			FileInputStream fis= new FileInputStream(path);
			BufferedInputStream bis = new BufferedInputStream(fis);
			while ((i = bis.read())!= -1){
				String key = (char)i +"";
				Integer value = map.get(key);
				if(value == null){
					map.put(key, 1);
				}else
					map.put(key, value+1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
