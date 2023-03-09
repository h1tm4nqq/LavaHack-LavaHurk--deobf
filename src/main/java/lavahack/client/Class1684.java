/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;

public interface Class1684 {
    public static final JsonParser Field15828 = new JsonParser();
    public static final Gson Field15829 = new GsonBuilder().setLenient().setPrettyPrinting().create();

    public void Method6475(JsonElement var1);

    public String Method6476();

    public static JsonElement Method6477(String string) {
        return Class1684.Method6478(string, true);
    }

    public static JsonElement Method6478(String string, boolean bl) {
        JsonElement jsonElement = null;
        JsonReader jsonReader = new JsonReader(new StringReader(bl ? "\"" + string + "\"" : string));
        Object var4_4 = null;
        jsonReader.setLenient(true);
        jsonElement = Field15828.parse(jsonReader);
        if (jsonReader == null) return jsonElement;
        if (var4_4 != null) {
            jsonReader.close();
            return jsonElement;
        }
        jsonReader.close();
        return jsonElement;
    }
}

