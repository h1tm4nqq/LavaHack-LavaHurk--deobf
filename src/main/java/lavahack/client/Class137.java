//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.common.network.*;

public class Class137
{
    public static final SimpleNetworkWrapper Field8524;
    private String Field8525 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method940() {
        Class137.Field8524.registerMessage((Class)Class446.class, (Class)Class446.class, 0, Side.CLIENT);
        Class137.Field8524.registerMessage((Class)Class1755.class, (Class)Class1755.class, 1, Side.CLIENT);
        Class137.Field8524.registerMessage((Class)Class2151.class, (Class)Class2151.class, 2, Side.SERVER);
        Class137.Field8524.registerMessage((Class)Class289.class, (Class)Class289.class, 3, Side.CLIENT);
        Class137.Field8524.registerMessage((Class)Class231.class, (Class)Class231.class, 4, Side.SERVER);
        Class137.Field8524.registerMessage((Class)Class513.class, (Class)Class513.class, 5, Side.CLIENT);
    }
    
    static {
        Field8524 = NetworkRegistry.INSTANCE.newSimpleChannel("schematica");
    }
    
    private static String Method941(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x29D5 ^ 0x50));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
