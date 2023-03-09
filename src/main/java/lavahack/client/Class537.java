//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import kotlin.Metadata;
import lavahack.client.Class1226;
import net.minecraft.entity.Entity;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class537
implements Runnable {
    final Class1226 Field10267;
    private String Field10268 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        if (Class2142.Field17803.world == null) return;
        Entity entity = Class2142.Field17803.world.getEntityByID(Class1226.Method4931(this.Field10267));
        if (entity == null) return;
        entity.setPosition(Class1226.Method4933(this.Field10267), Class1226.Method4935(this.Field10267), Class1226.Method4937(this.Field10267));
    }

    Class537(Class1226 class1226) {
        this.Field10267 = class1226;
    }
}

