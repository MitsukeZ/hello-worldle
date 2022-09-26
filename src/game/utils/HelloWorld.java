package src.game.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class HelloWorld {
    private String lang;
    private String code;

    public HelloWorld() {
        
        String jsonString = FileToString.getString("ressources/helloWorld.json");
        
        JSONObject jsonFile = new JSONObject(jsonString);
        JSONArray array = jsonFile.getJSONArray("helloWorld");

        int index = (int) (Math.random()*array.length());

        JSONObject helloObj = array.getJSONObject(index);

        this.lang = helloObj.getString("lang");
        this.code = helloObj.getString("code");
    }

    public String toString() {
        return this.code;
    }

    public boolean equals(String s) {
        return s.toUpperCase().equals(this.lang.toUpperCase());
    }

    public String getReponse() {return this.lang;}
}
