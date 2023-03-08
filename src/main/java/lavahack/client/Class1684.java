//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.google.gson.stream.*;
import java.io.*;
import com.google.gson.*;

public interface Class1684
{
    public static final JsonParser Field15828 = new JsonParser();
    public static final Gson Field15829 = new GsonBuilder().setLenient().setPrettyPrinting().create();
    
    void Method6475(final JsonElement p0);
    
    String Method6476();
    
    default JsonElement Method6477(final String s) {
        return Method6478(s, true);
    }
    
    default JsonElement Method6478(final String str, final boolean b) {
        final JsonReader jsonReader = new JsonReader((Reader)new StringReader(b ? ("\"" + str + "\"") : str));
        final Object o = null;
        jsonReader.setLenient(true);
        final JsonElement parse = Class1684.Field15828.parse(jsonReader);
        if (jsonReader != null) {
            if (o != null) {
                jsonReader.close();
            }
            else {
                jsonReader.close();
            }
        }
        return parse;
    }
}
