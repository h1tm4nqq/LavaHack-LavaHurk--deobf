//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 */
package lavahack.client;

import java.util.function.Supplier;
import lavahack.client.Class1320;
import lavahack.client.Class1796;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class52;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public abstract class Class1629
implements Class1320 {
    public static Supplier Field15608;
    protected static final Minecraft Field15609;
    protected Class52 Field15610 = (Class52)Field15608.get();
    protected Class1996 Field15611;
    private final String Field15612;
    protected Class44 Field15613;
    private final boolean Field15614;
    private final boolean Field15615;
    private String Field15616 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1629(Class1996 class1996, String string, boolean bl, boolean bl2) {
        this.Field15611 = class1996;
        this.Field15612 = string;
        this.Field15614 = bl;
        this.Field15615 = bl2;
        this.Field15613 = this.Field15610.Method23(class1996.Method7405(new Class44(this.Field15612, (Class42)this.Field15610, false)));
    }

    public boolean Method6362() {
        return this.Field15613.Method365();
    }

    protected Class44 Method6363(Class44 class44) {
        return this.Field15610.Method23(this.Field15611.Method7405(class44.Method313(this.Field15613::Method365)));
    }

    public void Method6364() {
        if (this.Field15614) {
            MinecraftForge.EVENT_BUS.register((Object)this);
        }
        if (!this.Field15615) return;
        Class1796.Field16242.Method705(this);
    }

    public void Method6365() {
        if (this.Field15614) {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
        }
        if (!this.Field15615) return;
        Class1796.Field16242.Method710(this);
    }

    public void Method6366() {
    }

    static {
        Field15609 = Minecraft.getMinecraft();
    }
}

