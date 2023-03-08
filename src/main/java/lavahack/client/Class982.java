//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class Class982 extends Class42
{
    public static Class982 Field12194;
    public Class44 Field12195;
    private final Class44 Field12196;
    public Class44 Field12197;
    public Class44 Field12198;
    public Class44 Field12199;
    public Class44 Field12200;
    public Class44 Field12201;
    public Class44 Field12202;
    public Class44 Field12203;
    private String Field12204 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class982() {
        super("SwingAnimation", "SwingAnimation", Class97.Field8342);
        this.Field12195 = this.Method23(new Class44("Mode", (Class42)this, "Strong", new ArrayList((Collection<? extends E>)Arrays.asList("Hand", "Strong"))));
        this.Field12196 = this.Method23(new Class44("Hand Mode", (Class42)this, "X", (List)Arrays.asList("X", "Y", "Z")));
        this.Field12197 = this.Method23(new Class44("StrongMode", (Class42)this, (Enum)Class788.Field11330));
        this.Field12198 = this.Method23(new Class44("IgnoreEating", (Class42)this, true));
        this.Field12199 = this.Method23(new Class44("If KillAura", (Class42)this, true));
        this.Field12200 = this.Method23(new Class44("Test", (Class42)this, false));
        this.Field12201 = this.Method23(new Class44("Rotate X", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), true));
        this.Field12202 = this.Method23(new Class44("Rotate Y", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)672791533 ^ 0x407680002819FBEDL), true));
        this.Field12203 = this.Method23(new Class44("Rotate Z", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4645040803167600640L), true));
        super.Method44((Supplier)this::Method3994);
        Class982.Field12194 = this;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method3993(final RenderSpecificHandEvent renderSpecificHandEvent) {
        if (this.Field12195.Method359().equalsIgnoreCase("Hand") && renderSpecificHandEvent.getSwingProgress() > 0.0f) {
            final float n = (1.0f - renderSpecificHandEvent.getSwingProgress()) * Float.intBitsToFloat(1135869952);
            final String method359 = this.Field12196.Method359();
            switch (method359.hashCode()) {
                case 88: {
                    if (method359.equals("X")) {
                        break;
                    }
                    break;
                }
                case 89: {
                    if (method359.equals("Y")) {
                        break;
                    }
                    break;
                }
                case 90: {
                    if (method359.equals("Z")) {
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    private String Method3994() {
        return "[" + (this.Field12195.Method359().equalsIgnoreCase("Hand") ? this.Field12196.Method359() : this.Field12197.Method359()) + "]";
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3006 ^ 0xD6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
