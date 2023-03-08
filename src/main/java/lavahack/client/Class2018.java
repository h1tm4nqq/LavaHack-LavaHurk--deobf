//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.net.*;
import com.mojang.authlib.yggdrasil.*;
import com.mojang.authlib.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import java.lang.reflect.*;
import java.util.*;

public class Class2018
{
    private static final List Field17289;
    private int Field17290;
    
    public static YggdrasilUserAuthentication Method7474(final String username, final String password, final boolean b) {
        final YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)new YggdrasilAuthenticationService(Proxy.NO_PROXY, "").createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.setUsername(username);
        yggdrasilUserAuthentication.setPassword(password);
        final YggdrasilUserAuthentication yggdrasilUserAuthentication2;
        new Thread(() -> {
            yggdrasilUserAuthentication2.logIn();
            if (b) {
                Method7476(new Session(yggdrasilUserAuthentication2.getSelectedProfile().getName(), yggdrasilUserAuthentication2.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication2.getAuthenticatedToken(), "mojang"));
            }
            return;
        }).start();
        return yggdrasilUserAuthentication;
    }
    
    public static List Method7475() {
        return Class2018.Field17289;
    }
    
    public static void Method7476(final Session value) {
        final Class<? extends Minecraft> class1 = Minecraft.getMinecraft().getClass();
        Field field = null;
        for (final Field field2 : class1.getDeclaredFields()) {
            if (field2.getType().isInstance(value)) {
                field = field2;
                Class1796.Field16243.info("Attempting Injection into Session.");
            }
        }
        if (field == null) {
            throw new IllegalStateException("No field of type " + Session.class.getCanonicalName() + " declared.");
        }
        field.setAccessible(true);
        field.set(Minecraft.getMinecraft(), value);
        field.setAccessible(false);
    }
    
    static {
        Field17289 = new ArrayList();
    }
    
    private static String Method7478(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5806 ^ 0x6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
