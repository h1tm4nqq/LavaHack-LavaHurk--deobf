//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.Session
 */
package lavahack.client;

import com.mojang.authlib.Agent;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Session;

public class d8NUi994osLCmt6QS9gn2nL3bytx8gy3 {
    private static final List Field17289 = new ArrayList();
    private int Field17290;

    public static YggdrasilUserAuthentication Method7474(String string, String string2, boolean bl) {
        YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)new YggdrasilAuthenticationService(Proxy.NO_PROXY, "").createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.setUsername(string);
        yggdrasilUserAuthentication.setPassword(string2);
        new Thread(() -> {
            yggdrasilUserAuthentication.logIn();
            if (!bl) return;
            d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7476(new Session(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang"));
        }).start();
        return yggdrasilUserAuthentication;
    }

    public static List Method7475() {
        return Field17289;
    }

    public static void Method7476(Session session) {
        Class<?> clazz = Minecraft.getMinecraft().getClass();
        Field field = null;
        Field[] fieldArray = clazz.getDeclaredFields();
        int n = fieldArray.length;
        for (int i = (int)-865534800L ^ 0xCC68FCB0; i < n; ++i) {
            Field field2 = fieldArray[i];
            if (!field2.getType().isInstance(session)) continue;
            field = field2;
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Attempting Injection into Session.");
        }
        if (field == null) {
            throw new IllegalStateException("No field of type " + Session.class.getCanonicalName() + " declared.");
        }
        field.setAccessible(((int)2063793644L ^ 0x7B02FDED) != 0);
        field.set(Minecraft.getMinecraft(), session);
        field.setAccessible(((int)-576754464L ^ 0xDD9F6CE0) != 0);
    }

    private static String Method7478(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-601652778 ^ (long)-601652778);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2061953879 ^ (long)-2061953962);
            int n2 = ((int)-959457221L ^ 0xC6CFD838) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-284842000 ^ (long)-284849165) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

