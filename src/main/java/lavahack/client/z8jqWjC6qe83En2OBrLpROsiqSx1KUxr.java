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
import lavahack.client.GAy9jV5JLrUCU1UxQkzXttscRqZTYALl;
import lavahack.client.N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public abstract class z8jqWjC6qe83En2OBrLpROsiqSx1KUxr
implements GAy9jV5JLrUCU1UxQkzXttscRqZTYALl {
    public static Supplier Field15608;
    protected static final Minecraft Field15609;
    protected N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb Field15610 = (N30COeo2hOrQ6APQBrOnGCY8FrTAEjcb)Field15608.get();
    protected xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15611;
    private final String Field15612;
    protected qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15613;
    private final boolean Field15614;
    private final boolean Field15615;
    private String Field15616 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public z8jqWjC6qe83En2OBrLpROsiqSx1KUxr(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, String string, boolean bl, boolean bl2) {
        this.Field15611 = xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2;
        this.Field15612 = string;
        this.Field15614 = bl;
        this.Field15615 = bl2;
        this.Field15613 = this.Field15610.Method23(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(this.Field15612, (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this.Field15610, (boolean)((long)2082896663 ^ (long)2082896663))));
    }

    public boolean Method6362() {
        return this.Field15613.Method365();
    }

    protected qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6363(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        return this.Field15610.Method23(this.Field15611.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method313(this.Field15613::Method365)));
    }

    public void Method6364() {
        if (this.Field15614) {
            MinecraftForge.EVENT_BUS.register((Object)this);
        }
        if (!this.Field15615) return;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
    }

    public void Method6365() {
        if (this.Field15614) {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
        }
        if (!this.Field15615) return;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
    }

    public void Method6366() {
    }

    static {
        Field15609 = Minecraft.getMinecraft();
    }
}

