//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.play.server.*;
import java.util.*;
import net.minecraft.util.text.*;

public class Class848 extends Class42
{
    public static Class848 Field11583;
    public ArrayList Field11584;
    @Class1801
    private final Class618 Field11585;
    private int Field11586;
    
    public Class848() {
        super("AntiSpammer", Class97.Field8343);
        this.Field11584 = new ArrayList();
        this.Field11585 = new Class618(this::Method3585, new Predicate[0]);
        Class848.Field11583 = this;
    }
    
    public boolean Method52() {
        return true;
    }
    
    public void Method38() {
        Class1796.Field16242.Method706(this.Field11585);
    }
    
    public void Method39() {
        Class1796.Field16242.Method711(this.Field11585);
    }
    
    private void Method3585(final Class544 class544) {
        if (class544.Method982() instanceof SPacketChat) {
            if (!((SPacketChat)class544.Method982()).isSystem()) {
                return;
            }
            String s = ((SPacketChat)class544.Method982()).chatComponent.getFormattedText();
            final Iterator<String> iterator = this.Field11584.iterator();
            while (iterator.hasNext()) {
                s = s.replaceAll(iterator.next(), "");
            }
            ((SPacketChat)class544.Method982()).chatComponent = (ITextComponent)new TextComponentString(s);
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1806 ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
