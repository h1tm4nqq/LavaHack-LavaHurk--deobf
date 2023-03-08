//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.text.*;
import java.util.*;

public class Class1519 extends Class158
{
    private String Field15111 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1519() {
        super("lua");
    }
    
    @Override
    public void Method443(final String s, final String[] array) {
        if (array[0].equalsIgnoreCase("info")) {
            this.Method437("Documentation: https://cattyn.gitbook.io/ferret-lua-api/reference/readme.");
        }
        else if (array[0].equalsIgnoreCase("load")) {
            final Iterator<Class1089> iterator = (Iterator<Class1089>)Class1796.Field16241.Field16283.Field15891.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().Method40().equalsIgnoreCase(array[1])) {
                    this.Method438("[Lua] Script " + array[1] + " is already loaded!");
                    return;
                }
            }
            final Class1089 e = new Class1089(array[1], ".lua script");
            e.Method4453();
            Class1796.Field16241.Field16283.Field15891.add(e);
            Class1796.Method6788();
            this.Method437("[Lua] Successful loaded " + array[1] + " script!");
        }
        else if (array[0].equalsIgnoreCase("get")) {
            if (Class1796.Field16241.Field16283.Method6537(array[1])) {
                if (array[2].equalsIgnoreCase("state")) {
                    boolean b;
                    if (array[3].equalsIgnoreCase("true")) {
                        b = true;
                    }
                    else {
                        if (!array[3].equalsIgnoreCase("false")) {
                            this.Method438("[Lua] State " + array[3] + " doesn't convert to boolean type!");
                            return;
                        }
                        b = false;
                    }
                    final Class1700 method4452 = Class1796.Field16241.Field16283.Method6536(array[1]).Method4452(array[4]);
                    if (method4452 != null) {
                        method4452.Method21(b);
                        this.Method435(TextFormatting.GRAY + "[Lua] Module " + TextFormatting.RED + array[4] + TextFormatting.GRAY + " has been " + "disabled" + "!");
                    }
                    else {
                        this.Method438("[Lua] Module " + array[4] + " in script " + array[1] + " doesn't exists!");
                    }
                }
                else if (array[2].equalsIgnoreCase("action")) {
                    Class1295 class1295;
                    if (array[3].equalsIgnoreCase("unload")) {
                        class1295 = Class1295.Field13918;
                    }
                    else {
                        if (!array[3].equalsIgnoreCase("reload")) {
                            this.Method438("[Lua] Action " + array[3] + " doesn't exists!");
                            return;
                        }
                        class1295 = Class1295.Field13919;
                    }
                    final Class1089 method4453 = Class1796.Field16241.Field16283.Method6536(array[1]);
                    if (method4453 != null) {
                        switch (Class1331.Field14097[class1295.ordinal()]) {
                            case 1: {
                                method4453.Method4454(true);
                                this.Method437("[Lua] Script " + method4453.Method40() + " has been unloaded!");
                                break;
                            }
                            case 2: {
                                method4453.Method20();
                                this.Method437("[Lua] Script " + method4453.Method40() + " has been reloaded!");
                                break;
                            }
                        }
                    }
                    else {
                        this.Method438("[Lua] Script " + array[4] + " doesn't exists!");
                    }
                }
                else {
                    this.Method438("Usage: " + this.Method448());
                }
            }
            else {
                this.Method438("[Lua] Script " + array[1] + " doesn't exists!");
            }
        }
    }
    
    @Override
    public String Method447() {
        return "catlua";
    }
    
    @Override
    public String Method448() {
        return "\nlua info\nlua load <script name>\nlua get <script name> <action> <unload/reload>\nlua get <script name> <state> <true/false> <module from script name>";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x208F ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
