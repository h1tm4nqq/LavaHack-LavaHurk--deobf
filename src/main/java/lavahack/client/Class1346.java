//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.entity.*;

public class Class1346 implements Class2142
{
    private int Field14128;
    
    boolean Method5401() {
        return Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player == null || Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world == null;
    }
    
    public void Method5402(final float rotationYaw, final float rotationPitch) {
        if (this.Method5401()) {
            Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.rotationYaw = rotationYaw;
            Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.rotationPitch = rotationPitch;
        }
    }
    
    public void Method5403(final float n, final float n2, final boolean b) {
        Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(n, n2, b));
    }
    
    public void Method5404(final float n, final float n2) {
        this.Method5403(n, n2, Class1346.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.onGround);
    }
    
    public float[] Method5405(final Entity entity) {
        return Class1568.Method6179(entity);
    }
}
